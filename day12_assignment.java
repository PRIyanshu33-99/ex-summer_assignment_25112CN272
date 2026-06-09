import java.util.Scanner;

public class day12_assignment {

    // Palindrome Function
    static void palindrome(int n) {
        int temp = n;
        int rev = 0;

        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }

        if (temp == rev)
            System.out.println(temp + " is Palindrome");
        else
            System.out.println(temp + " is Not Palindrome");
    }

    // Armstrong Function
    static void armstrong(int n) {
        int temp = n;
        int sum = 0;

        while (n > 0) {
            int d = n % 10;
            sum = sum + (d * d * d);
            n = n / 10;
        }

        if (sum == temp)
            System.out.println(temp + " is Armstrong");
        else
            System.out.println(temp + " is Not Armstrong");
    }

    // Fibonacci Function
    static void fibonacci(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();
    }

    // Perfect Number Function
    static void perfect(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum = sum + i;
        }

        if (sum == n)
            System.out.println(n + " is Perfect Number");
        else
            System.out.println(n + " is Not Perfect Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q45 Palindrome
        System.out.print("Enter a number for Palindrome: ");
        int p = sc.nextInt();
        palindrome(p);

        // Q46 Armstrong
        System.out.print("Enter a number for Armstrong: ");
        int a = sc.nextInt();
        armstrong(a);

        // Q47 Fibonacci
        System.out.print("Enter number of terms for Fibonacci: ");
        int f = sc.nextInt();
        fibonacci(f);

        // Q48 Perfect Number
        System.out.print("Enter a number for Perfect Number: ");
        int pn = sc.nextInt();
        perfect(pn);

        sc.close();
    }
}