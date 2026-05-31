
import java.util.Scanner;

public class day4_assignment {

    // Function to check Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;

        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Generate Fibonacci Series
        System.out.print("Enter number of terms for Fibonacci Series: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("\nFibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        // 2. Find nth Fibonacci Term
        System.out.print("\n\nEnter n to find nth Fibonacci term: ");
        int nth = sc.nextInt();

        if (nth == 0) {
            System.out.println("0th Fibonacci Term = 0");
        } else if (nth == 1) {
            System.out.println("1st Fibonacci Term = 1");
        } else {
            int x = 0, y = 1, term = 0;

            for (int i = 2; i <= nth; i++) {
                term = x + y;
                x = y;
                y = term;
            }

            System.out.println(nth + "th Fibonacci Term = " + term);
        }

        // 3. Check Armstrong Number
        System.out.print("\nEnter a number to check Armstrong: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong Number.");
        } else {
            System.out.println(num + " is NOT an Armstrong Number.");
        }

        // 4. Print Armstrong Numbers in a Range
        System.out.print("\nEnter start of range: ");
        int start = sc.nextInt();

        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        System.out.println("\nArmstrong Numbers in the range:");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
