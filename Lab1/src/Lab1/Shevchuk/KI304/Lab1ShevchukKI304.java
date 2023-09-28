package Lab1.Shevchuk.KI304;

import java.io.*;
import java.util.*;

/**
 * The {@code Lab1.Shevchuk.KI304.Lab1} class demonstrates the creation of a triangular matrix and
 * its population with a user-specified filler character.
 */
public class Lab1ShevchukKI304 {
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        // Prompt the user for the size of a square matrix
        System.out.print("Enter the size of a square matrix: ");
        nRows = in.nextInt();
        in.nextLine();

        // Prompt the user for the filler character
        System.out.print("Enter the filling character: ");
        filler = in.nextLine();

        arr = new char[nRows][];
        int halfNRows = (nRows / 2) + 1;
        int row = 1;
        for (int i = 0; i < halfNRows; i++) {
            arr[i] = new char[row];
            for (int j = 0; j < row; j++) {
                arr[i][j] = (char) filler.codePointAt(0);
            }
            row += 2;
        }

        exit:
        if (filler.isEmpty()) {
            System.out.print("\nFiller character not entered.");
        } else if (filler.length() != 1) {
            System.out.print("\nToo many filler characters entered.");
        } else {
            int counter = halfNRows - 1;
            for (int i = 0; i < halfNRows - 1; i++) {
                for (int j = 0; j < nRows; j++){
                    System.out.print("  ");
                    fout.print("  ");
                }
                System.out.print("\n");
                fout.print("\n");
            }
            int colArr = 0, rowArr = 0;
            for (int i = halfNRows - 1; i < nRows; i++) {
                for (int j = 0; j < nRows; j++) {
                    if (j >= counter && arr[rowArr].length > colArr) {
                        System.out.print(arr[rowArr][colArr] + " ");
                        fout.print(arr[rowArr][colArr] + " ");
                        colArr++;
                    } else {
                        System.out.print("  ");
                        fout.print("  ");
                    }
                    if (j == counter) {
                        counter--;
                    }
                }
                rowArr++;
                colArr = 0;
                System.out.print("\n");
                fout.print("\n");
            }
        }
        fout.flush();
        fout.close();
    }
}
