import java.util.Scanner;

public class day1_assignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q1 Sum of first N natural numbers
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum of first " + n + " natural numbers = " + sum);

        // Q2 Multiplication table
        System.out.print("\nEnter a number for multiplication table: ");
        int num = sc.nextInt();

        System.out.println("Multiplication Table of " + num);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        // Q3 Factorial of a number
        System.out.print("\nEnter a number to find factorial: ");
        int factNum = sc.nextInt();

        long factorial = 1;

        for (int i = 1; i <= factNum; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + factNum + " = " + factorial);

        // Q4 Count digits in a number
        System.out.print("\nEnter a number to count digits: ");
        int digitNum = sc.nextInt();

        int count = 0;
        int temp = digitNum;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        System.out.println("Number of digits in " + digitNum + " = " + count);

        sc.close();
    }
}