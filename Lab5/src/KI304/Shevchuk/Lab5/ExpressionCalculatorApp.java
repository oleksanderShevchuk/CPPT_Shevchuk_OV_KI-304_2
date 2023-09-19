package KI304.Shevchuk.Lab5;

import java.io.IOException;
import java.util.Scanner;

/**
 * The {@code ExpressionCalculatorApp} class is a simple application for calculating and storing
 * the result of the expression defined by the expression calculator.
 */
public class ExpressionCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the value of x from the user
        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();

        // Calculate the expression result
        double result = ExpressionCalculator.calculateExpression(x);

        try {
            // Write the result to a text file
            ExpressionResultIO.writeResultToTextFile(result, "result.txt");
            System.out.println("Result written to result.txt");

            // Write the result to a binary file
            ExpressionResultIO.writeResultToBinaryFile(result, "result.dat");
            System.out.println("Result written to result.dat");

            // Read the result from the text file and display it
            double textResult = ExpressionResultIO.readResultFromTextFile("result.txt");
            System.out.println("Result from text file: " + textResult);

            // Read the result from the binary file and display it
            double binaryResult = ExpressionResultIO.readResultFromBinaryFile("result.dat");
            System.out.println("Result from binary file: " + binaryResult);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
