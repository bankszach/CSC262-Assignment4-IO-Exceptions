# CSC262 – Assignment 4: I/O and Exceptions

## Group Members
- Zach Banks
- Jess Scott

## Overview
This project demonstrates:
- Java user input using `Scanner`
- File I/O and text parsing
- Exception handling with `try/catch/finally`
- Modular Java project structure
- Team collaboration and peer evaluation

## Problem 1: Expenses Organizer
Reads a file `input.txt` formatted as `Category;Description;Amount;Date`, and:
- Groups expenses by category
- Writes each category to a separate output file (`Groceries.txt`, etc.)
- Handles malformed lines and missing file errors gracefully

## Problem 2: DataAnalyzer Exception Handling
Modifies the DataAnalyzer pattern to:
- Use `nextInt()` / `nextDouble()` directly (no `hasNext`)
- Catch `NoSuchElementException` and `IOException` in `main()`
- Processes 3 input files:
  - `input1.txt`: invalid input
  - `input2.txt`: valid input
  - `input3.txt`: declared size mismatch

## How to Run
> Requires JavaSE-21  
To run in Eclipse:
1. Open any problem file in `src/csc262/assignment4/io/`
2. Right-click → Run As → Java Application

To compile manually:
```bash
javac -d bin src/csc262/assignment4/io/Problem1_ExpensesOrganizer.java
java -cp bin csc262.assignment4.io.Problem1_ExpensesOrganizer

javac -d bin src/csc262/assignment4/io/Problem2_DataAnalyzer.java
java -cp bin csc262.assignment4.io.Problem2_DataAnalyzer
```

## Input Files
- Place `input.txt`, `input1.txt`, `input2.txt`, and `input3.txt` in the project root
- Refresh Eclipse to view newly generated output files (`*.txt`)

## Screenshots
All screenshots are organized in:
```
/docs/Screen-Shots/Problem 1/
                         Problem 2/
```
Each screenshot is labeled by test type or output captured.

## Notes
This project fulfills the CSC262 Module 4 Signature Assignment requirements and demonstrates robust exception handling, Java file I/O, and clean modular programming structure.