import java.util.Scanner;

public class day6_assignment {

    // Decimal to Binary
    public static String decimalToBinary(int num) {
        if (num == 0) return "0";

        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }
        return binary;
    }

    // Binary to Decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = binary.charAt(i) - '0';
            decimal += digit * (1 << power);
            power++;
        }
        return decimal;
    }

    // Count Set Bits
    public static int countSetBits(int num) {
        int count = 0;

        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }

    // Find x^n without Math.pow()
    public static long power(int x, int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= x;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q21: Decimal to Binary
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        System.out.println("Binary = " + decimalToBinary(decimal));

        // Q22: Binary to Decimal
        System.out.print("\nEnter a binary number: ");
        String binary = sc.next();
        System.out.println("Decimal = " + binaryToDecimal(binary));

        // Q23: Count Set Bits
        System.out.print("\nEnter a number to count set bits: ");
        int num = sc.nextInt();
        System.out.println("Number of set bits = " + countSetBits(num));

        // Q24: Find x^n
        System.out.print("\nEnter base (x): ");
        int x = sc.nextInt();
        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();
        System.out.println(x + "^" + n + " = " + power(x, n));

        sc.close();
    }
}