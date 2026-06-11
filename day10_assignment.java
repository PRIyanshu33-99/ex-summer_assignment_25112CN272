import java.util.Scanner;

public class practiceset_2 {

    public static void main(String[] args) {

        int n = 5;
        int i, j, k;

        // 1. Star Pyramid
        System.out.println("Star Pyramid:");
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (k = 1; k <= 2 * i - 1; k++)
                System.out.print("*");

            System.out.println();
        }

        // 2. Reverse Star Pyramid
        System.out.println("\nReverse Star Pyramid:");
        for (i = n; i >= 1; i--) {

            for (j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (k = 1; k <= 2 * i - 1; k++)
                System.out.print("*");

            System.out.println();
        }

        // 3. Number Pyramid
        System.out.println("\nNumber Pyramid:");
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (j = 1; j <= i; j++)
                System.out.print(j);

            for (j = i - 1; j >= 1; j--)
                System.out.print(j);

            System.out.println();
        }

        // 4. Character Pyramid
        System.out.println("\nCharacter Pyramid:");
        for (i = 1; i <= n; i++) {

            char ch;

            for (j = 1; j <= n - i; j++)
                System.out.print(" ");

            ch = 'A';

            for (j = 1; j <= i; j++)
                System.out.print(ch++);

            ch -= 2;

            for (j = 1; j < i; j++)
                System.out.print(ch--);

            System.out.println();
        }
    }
}
