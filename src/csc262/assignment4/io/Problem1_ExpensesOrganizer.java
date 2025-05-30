package csc262.assignment4.io;

import java.io.*;
import java.util.*;

/**
 * Problem 1: Expenses Organizer
 * CSC262 - Assignment 4
 * Group Members: Zach Banks, Jess Scott
 *
 * This program reads an expenses file with entries in the format:
 * Category;Description;Amount;Date
 * It categorizes each entry and writes a separate file for each expense category.
 * It also handles missing file exceptions and malformed input lines.
 */
public class Problem1_ExpensesOrganizer {

    public static void main(String[] args) {
        Map<String, List<String>> categorizedExpenses = new HashMap<>();
        File inputFile = new File("input.txt");

        try (Scanner scanner = new Scanner(inputFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                if (parts.length != 4) {
                    System.out.println("Invalid line format: " + line);
                    continue;
                }

                String category = parts[0].trim();
                String entry = String.join(";", Arrays.copyOfRange(parts, 1, 4));

                categorizedExpenses
                    .computeIfAbsent(category, k -> new ArrayList<>())
                    .add(entry);
            }

            // Write categorized entries to separate files
            for (Map.Entry<String, List<String>> entry : categorizedExpenses.entrySet()) {
                String category = entry.getKey();
                List<String> entries = entry.getValue();

                try (PrintWriter writer = new PrintWriter(new FileWriter(category + ".txt"))) {
                    for (String expense : entries) {
                        writer.println(expense);
                    }
                }
            }

            System.out.println("Expense files created successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: input.txt not found.");
        } catch (IOException e) {
            System.out.println("Error writing category file: " + e.getMessage());
        }
    }
}