package com.mycompany.f43;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class F43 {
    public static void main(String[] args) {
    /////////////////////////// Part 1 ////////////////////////////////////////////////////
        // Step 1: Initialize a 2D array named matrix with dimensions [7][7]
        int[][] matrix = new int[7][7];

        // Step 2: Fill the matrix array with multiplication table values
        for (int i = 0; i < 7; i++) {   // for columns
            for (int j = 0; j < 7; j++) {   // for rows
                matrix[i][j] = (i + 1) * (j + 1);
            }
        }

        // Step 3: Print the contents of the matrix array
        System.out.println("Matrix Contents:");
        for (int i = 0; i < 7; i++) {   // for columns
            for (int j = 0; j < 7; j++) {   // for rows
                System.out.printf("%3s ", matrix[i][j]);
            }
            System.out.println();
        }

        // Step 4: Compute row sums and store the results in the rowSum array
        int[] rowSum = new int[7];
        for (int i = 0; i < 7; i++) {   // for columns
            int sum = 0;    // varaible sum to store summation for each rows
            for (int j = 0; j < 7; j++) {   // for rows
                sum += matrix[i][j];
            }
            rowSum[i] = sum;
        }

        // Step 5: Print the contents of the matrix array and rowSum array
        System.out.println("\nMatrix Contents with Row Sums:");
        for (int i = 0; i < 7; i++) {   // for columns
            for (int j = 0; j < 7; j++) {   // for rows
                System.out.printf("%3s ", matrix[i][j]);
            }
            System.out.printf("| %3s\n", rowSum[i]);
        }
        
    /////////////////////////// Part 2 ////////////////////////////////////////////////////
        // Step 1: Create a text file named "matrixData.txt."
        // Step 2: Write the contents of the matrix array to "matrixData.txt" file
        try (FileWriter writer = new FileWriter("matrixData.txt")) {
            for (int i = 0; i < 7; i++) {   // for columns
                for (int j = 0; j < 7; j++) {   // for rows
                    writer.write(matrix[i][j] + " ");
                }
                writer.write(System.lineSeparator());
            }
            System.out.println("\nMatrix data written to matrixData.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to matrixData.txt.");
            e.printStackTrace();
        }

        // Step 3-a: Initialize a one-dimensional array named arrayOne from user inputs
        int[] arrayOne = new int[7];
        Scanner scanner = new Scanner(System.in);
        // Assuming you have a Scanner object named scanner for user input
        System.out.println("\nEnter 7 numbers to initialize arrayOne:");
        for (int i = 0; i < 7; i++) {
            arrayOne[i] = scanner.nextInt(); // read input from user and store it to arrayOne[i]
        }

        // Step 3-b: Write the contents of arrayOne to "arrayOne.txt" file
        try (FileWriter writer = new FileWriter("arrayOne.txt")) {
            for (int i = 0; i < 7; i++) {
                writer.write(arrayOne[i] + " ");
            }
            System.out.println("arrayOne data written to arrayOne.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to arrayOne.txt.");
            e.printStackTrace();
        }
    }
}