
import java.util.Scanner;

public class day2_assignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Sum of digits
        int num1, sum = 0, digit;

        System.out.print("Enter number for Sum of Digits: ");
        num1 = sc.nextInt();

        while (num1 != 0) {
            digit = num1 % 10;
            sum = sum + digit;
            num1 = num1 / 10;
        }

        System.out.println("Sum of digits = " + sum);


        // 2. Reverse a number
        int num2, reverse = 0;

        System.out.print("\nEnter number for Reverse: ");
        num2 = sc.nextInt();

        while (num2 != 0) {
            digit = num2 % 10;
            reverse = reverse * 10 + digit;
            num2 = num2 / 10;
        }

        System.out.println("Reversed number = " + reverse);


        // 3. Product of digits
        int num3, product = 1;

        System.out.print("\nEnter number for Product of Digits: ");
        num3 = sc.nextInt();

        while (num3 != 0) {
            digit = num3 % 10;
            product = product * digit;
            num3 = num3 / 10;
        }

        System.out.println("Product of digits = " + product);


        // 4. Palindrome check
        int num4, temp, rev = 0;

        System.out.print("\nEnter number for Palindrome Check: ");
        num4 = sc.nextInt();

        temp = num4;

        while (temp != 0) {
            digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        if (num4 == rev) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is Not Palindrome");
        }

        sc.close();
    }
}