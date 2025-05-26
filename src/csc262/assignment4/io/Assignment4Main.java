package csc262.assignment4.io;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * CSC262 - Assignment 4: I/O and Exceptions
 * Group Members: Zach Banks, Jess Scott
 * 
 * This program demonstrates:
 * - User input using Scanner
 * - Exception handling (InputMismatchException, ArithmeticException)
 * - Clean program structure and comments
 */
public class Assignment4Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("=== Division Calculator ===");

            // Prompt user for numerator
            System.out.print("Enter an integer numerator: ");
            int numerator = scanner.nextInt();

            // Prompt user for denominator
            System.out.print("Enter an integer denominator: ");
            int denominator = scanner.nextInt();

            // Perform division and display result
            int result = numerator / denominator;
            System.out.println("Result: " + numerator + " ÷ " + denominator + " = " + result);

        } catch (InputMismatchException ime) {
            System.out.println("Error: Please enter valid integers only.");
        } catch (ArithmeticException ae) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Program complete. Thank you for using the calculator.");
            scanner.close();
        }
    }
}
