import java.util.Scanner;

public class  day3_assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, flag;
        int start, end, j;

        // 1. Check Prime Number
        System.out.println("===== CHECK PRIME NUMBER =====");
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        flag = 1;

        if (n <= 1)
            flag = 0;
        else {
            for (i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = 0;
                    break;
                }
            }
        }

        if (flag == 1)
            System.out.println(n + " is a Prime Number\n");
        else
            System.out.println(n + " is not a Prime Number\n");

        // 2. Prime Numbers in Range
        System.out.println("===== PRIME NUMBERS IN RANGE =====");
        System.out.print("Enter start and end values: ");
        start = sc.nextInt();
        end = sc.nextInt();

        System.out.print("Prime numbers are: ");

        for (i = start; i <= end; i++) {
            if (i <= 1)
                continue;

            flag = 1;

            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 1)
                System.out.print(i + " ");
        }

        System.out.println("\n");

        // 3. Find GCD
        System.out.println("===== FIND GCD =====");
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = a, y = b;

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int gcd = x;

        System.out.println("GCD = " + gcd + "\n");

        // 4. Find LCM
        System.out.println("===== FIND LCM =====");
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        x = num1;
        y = num2;

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        gcd = x;
        int lcm = (num1 * num2) / gcd;

        System.out.println("LCM = " + lcm);

        sc.close();
    }
}