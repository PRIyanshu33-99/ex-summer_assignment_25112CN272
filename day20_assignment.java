import java.util.Scanner;

public class day20_assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q77: Matrix Multiplication
        System.out.println("=== MATRIX MULTIPLICATION ===");

        System.out.print("Enter rows and columns of first matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] A = new int[r1][c1];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter rows and columns of second matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] B = new int[r2][c2];

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        if (c1 == r2) {
            int[][] C = new int[r1][c2];

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            System.out.println("Resultant Matrix:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication not possible.");
        }

        // Q78, Q79, Q80
        System.out.println("\n=== SYMMETRIC MATRIX, ROW SUM & COLUMN SUM ===");

        System.out.print("Enter order of square matrix: ");
        int n = sc.nextInt();

        int[][] M = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = sc.nextInt();
            }
        }

        // Check Symmetric Matrix
        boolean symmetric = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (M[i][j] != M[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }

        if (symmetric)
            System.out.println("Matrix is Symmetric.");
        else
            System.out.println("Matrix is Not Symmetric.");

        // Row-wise Sum
        System.out.println("\nRow-wise Sum:");
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += M[i][j];
            }
            System.out.println("Row " + (i + 1) + " Sum = " + rowSum);
        }

        // Column-wise Sum
        System.out.println("\nColumn-wise Sum:");
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += M[i][j];
            }
            System.out.println("Column " + (j + 1) + " Sum = " + colSum);
        }

        sc.close();
    }
}