import java.util.Scanner;

public class day19_assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] A = new int[r][c];
        int[][] B = new int[r][c];

        // Input first matrix
        System.out.println("Enter elements of First Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of Second Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Q73: Matrix Addition
        System.out.println("\nMatrix Addition:");
        int[][] add = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                add[i][j] = A[i][j] + B[i][j];
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }

        // Q74: Matrix Subtraction
        System.out.println("\nMatrix Subtraction:");
        int[][] sub = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sub[i][j] = A[i][j] - B[i][j];
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }

        // Q75: Transpose of First Matrix
        System.out.println("\nTranspose of First Matrix:");

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(A[j][i] + " ");
            }
            System.out.println();
        }

        // Q76: Diagonal Sum of First Matrix
        if (r == c) {
            int diagonalSum = 0;

            for (int i = 0; i < r; i++) {
                diagonalSum += A[i][i];
            }

            System.out.println("\nDiagonal Sum of First Matrix = " + diagonalSum);
        } else {
            System.out.println("\nDiagonal Sum can be calculated only for a square matrix.");
        }

        sc.close();
    }
}