package csc262.assignment4.io;

import java.io.*;
import java.util.*;

/**
 * Problem 2: DataAnalyzer with Exception Handling
 * CSC262 - Assignment 4
 * Group Members: Zach Banks, Jess Scott
 *
 * This program reads a file containing a count and several doubles.
 * It uses nextInt and nextDouble without calling hasNext, and catches
 * NoSuchElementException in main as required.
 */
public class Problem2_DataAnalyzer {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean done = false;

        while (!done) {
            try {
                System.out.print("Enter filename: ");
                String filename = console.nextLine();
                double[] data = readFile(filename);

                System.out.println("Data loaded:");
                for (double d : data) {
                    System.out.println(d);
                }

                done = true;
            } catch (FileNotFoundException e) {
                System.out.println("File not found.");
            } catch (NoSuchElementException e) {
                System.out.println("File contents invalid.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static double[] readFile(String filename) throws IOException {
        File inFile = new File(filename);
        try (Scanner in = new Scanner(inFile)) {
            return readData(in);
        }
    }

    public static double[] readData(Scanner in) throws IOException {
        int numberOfValues = in.nextInt(); // May throw NoSuchElementException
        double[] data = new double[numberOfValues];

        for (int i = 0; i < numberOfValues; i++) {
            data[i] = in.nextDouble(); // May throw NoSuchElementException
        }

        if (in.hasNext()) {
            throw new IOException("End of file expected");
        }

        return data;
    }
}