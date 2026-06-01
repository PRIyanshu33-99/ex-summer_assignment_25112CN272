import java.util.Scanner;

public class day5_assignment {

    // Function to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to check prime
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q17: Check Perfect Number
        System.out.print("Enter a number to check Perfect Number: ");
        int num1 = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                sum += i;
            }
        }

        if (sum == num1)
            System.out.println(num1 + " is a Perfect Number");
        else
            System.out.println(num1 + " is not a Perfect Number");

        // Q18: Check Strong Number
        System.out.print("\nEnter a number to check Strong Number: ");
        int num2 = sc.nextInt();

        int temp = num2;
        int strongSum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            strongSum += factorial(digit);
            temp /= 10;
        }

        if (strongSum == num2)
            System.out.println(num2 + " is a Strong Number");
        else
            System.out.println(num2 + " is not a Strong Number");

        // Q19: Print Factors of a Number
        System.out.print("\nEnter a number to print its factors: ");
        int num3 = sc.nextInt();

        System.out.println("Factors of " + num3 + " are:");
        for (int i = 1; i <= num3; i++) {
            if (num3 % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Q20: Find Largest Prime Factor
        System.out.print("\nEnter a number to find Largest Prime Factor: ");
        int num4 = sc.nextInt();

        int largestPrimeFactor = -1;

        for (int i = 2; i <= num4; i++) {
            if (num4 % i == 0 && isPrime(i)) {
                largestPrimeFactor = i;
            }
        }

        System.out.println("Largest Prime Factor of " + num4 + " is: " + largestPrimeFactor);

        sc.close();
    }
}