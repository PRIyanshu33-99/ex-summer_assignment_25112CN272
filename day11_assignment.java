import java.util.Scanner;

public class day11_assignment {

    // Q41: Function to find sum of two numbers
    static int findSum(int a, int b) {
        return a + b;
    }

    // Q42: Function to find maximum of two numbers
    static int findMaximum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Q43: Function to check prime number
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Q44: Function to find factorial
    static long findFactorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q41
        System.out.println("Q41 - Sum of Two Numbers");
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Sum = " + findSum(num1, num2));

        // Q42
        System.out.println("\nQ42 - Maximum of Two Numbers");
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Maximum = " + findMaximum(a, b));

        // Q43
        System.out.println("\nQ43 - Check Prime Number");
        System.out.print("Enter a number: ");
        int primeNum = sc.nextInt();

        if (isPrime(primeNum)) {
            System.out.println(primeNum + " is a Prime Number");
        } else {
            System.out.println(primeNum + " is not a Prime Number");
        }

        // Q44
        System.out.println("\nQ44 - Find Factorial");
        System.out.print("Enter a number: ");
        int factNum = sc.nextInt();

        System.out.println("Factorial = " + findFactorial(factNum));

        sc.close();
    }
} 
    

