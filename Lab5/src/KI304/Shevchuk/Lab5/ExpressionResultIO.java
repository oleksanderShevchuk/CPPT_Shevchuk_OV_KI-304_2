package KI304.Shevchuk.Lab5;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

/**
 * The {@code ExpressionResultIO} class provides methods for reading/writing expression results in text and binary formats.
 */
public class ExpressionResultIO {
    /**
     * Writes the expression result to a text file.
     *
     * @param result  The result to write.
     * @param txtFile The text file to write to.
     * @throws IOException If an error occurs while writing to the file.
     */
    public static void writeResultToTextFile(double result, String txtFile) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(txtFile))) {
            writer.println(result);
        }
    }

    /**
     * Reads the expression result from a text file.
     *
     * @param txtFile The text file to read from.
     * @return The read result.
     * @throws IOException If an error occurs while reading from the file.
     */
    public static double readResultFromTextFile(String txtFile) throws IOException {
        try (Scanner scanner = new Scanner(new File(txtFile))) {
            scanner.useLocale(Locale.US);
            return scanner.nextDouble();
        }
    }

    /**
     * Writes the expression result to a binary file.
     *
     * @param result    The result to write.
     * @param binFile   The binary file to write to.
     * @throws IOException If an error occurs while writing to the file.
     */
    public static void writeResultToBinaryFile(double result, String binFile) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(binFile))) {
            dos.writeDouble(result);
        }
    }

    /**
     * Reads the expression result from a binary file.
     *
     * @param binFile The binary file to read from.
     * @return The read result.
     * @throws IOException If an error occurs while reading from the file.
     */
    public static double readResultFromBinaryFile(String binFile) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(binFile))) {
            return dis.readDouble();
        }
    }
}
