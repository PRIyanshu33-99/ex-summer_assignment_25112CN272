import java.util.Scanner;

public class day7_assignment {

    // Recursive Factorial
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    // Recursive Fibonacci
    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Recursive Sum of Digits
    static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }

    // Recursive Reverse Number
    static int reverse(int n, int rev) {
        if (n == 0)
            return rev;
        return reverse(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Factorial
        System.out.print("Enter a number for Factorial: ");
        int factNum = sc.nextInt();
        System.out.println("Factorial = " + factorial(factNum));

        // Fibonacci
        System.out.print("\nEnter position for Fibonacci: ");
        int fibNum = sc.nextInt();
        System.out.println("Fibonacci Number = " + fibonacci(fibNum));

        // Sum of Digits
        System.out.print("\nEnter a number for Sum of Digits: ");
        int sumNum = sc.nextInt();
        System.out.println("Sum of Digits = " + sumOfDigits(sumNum));

        // Reverse Number
        System.out.print("\nEnter a number to Reverse: ");
        int revNum = sc.nextInt();
        System.out.println("Reversed Number = " + reverse(revNum, 0));

        sc.close();
    }
}