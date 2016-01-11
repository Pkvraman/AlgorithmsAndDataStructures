import java.io.*;
import java.util.*;
import java.math.*;

public class RotateMatrix {

    public static void main(String[] args) {
        Integer[][] a = {{17, 2, 0}, {4, 10, 2}, {9, 5, 6}};
        for (Integer[] row : a) {
            printRow(row);
        }
        System.out.println("\n");
        System.out.println("\n");
        a = rotate(a);
        for (Integer[] row : a) {
            printRow(row);
        }
    }

    public static void printRow(Integer[] row) {
        for (Integer i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }

    private static Integer[][] rotate(Integer[][] a) {
        //transpose
        //reverse each row
        Integer[][] transposedMatrix = getTranspose(a);
        for (int j = 0; j < transposedMatrix.length; j++) {
            transposedMatrix[j] = reverseRows(transposedMatrix[j]);
        }
        return transposedMatrix;
    }

    private static Integer[] reverseRows(Integer[] rows) {
        for (int i = 0; i < rows.length / 2; i++) {
            int tmp = rows[i];
            rows[i] = rows[rows.length - i - 1];
            rows[rows.length - i - 1] = tmp;
        }
        return rows;
    }

    private static Integer[][] getTranspose(Integer[][] a) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (i <= j) {
                    int tmp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = tmp;
                }
            }
        }
        return a;
    }
}
