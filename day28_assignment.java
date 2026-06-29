import java.util.Scanner;

public class day28_assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ==========================
        // Q109 Library Management System
        // ==========================
        System.out.println("===== LIBRARY MANAGEMENT SYSTEM =====");

        System.out.print("Enter Book ID: ");
        int bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        String bookName = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Is Book Issued? (yes/no): ");
        String issued = sc.nextLine();

        System.out.println("\nLibrary Record");
        System.out.println("Book ID : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author : " + author);
        System.out.println("Issued : " + issued);

        // ==========================
        // Q110 Bank Account System
        // ==========================
        System.out.println("\n===== BANK ACCOUNT SYSTEM =====");

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Amount to Deposit: ");
        double deposit = sc.nextDouble();
        balance = balance + deposit;

        System.out.print("Enter Amount to Withdraw: ");
        double withdraw = sc.nextDouble();

        if (withdraw <= balance) {
            balance = balance - withdraw;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Insufficient Balance.");
        }

        System.out.println("Account Number : " + accNo);
        System.out.println("Final Balance : " + balance);

        // ==========================
        // Q111 Ticket Booking System
        // ==========================
        System.out.println("\n===== TICKET BOOKING SYSTEM =====");

        sc.nextLine();

        System.out.print("Enter Passenger Name: ");
        String passenger = sc.nextLine();

        System.out.print("Enter Source: ");
        String source = sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();

        int price = 500;
        int total = tickets * price;

        System.out.println("\nTicket Details");
        System.out.println("Passenger : " + passenger);
        System.out.println("From : " + source);
        System.out.println("To : " + destination);
        System.out.println("Tickets : " + tickets);
        System.out.println("Total Fare : " + total);

        // ==========================
        // Q112 Contact Management System
        // ==========================
        System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");

        sc.nextLine();

        System.out.print("How many contacts do you want to store? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        String[] phones = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            phones[i] = sc.nextLine();
        }

        System.out.println("\nSaved Contacts");
        for (int i = 0; i < n; i++) {
            System.out.println("Name : " + names[i]);
            System.out.println("Phone : " + phones[i]);
            System.out.println();
        }

        sc.close();
    }
}