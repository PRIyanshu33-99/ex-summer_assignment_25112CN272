import java.util.Random;
import java.util.Scanner;

public class day26_assignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q101 Number Guessing Game
        System.out.println("----- Q101 Number Guessing Game -----");

        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess;

        do {
            System.out.print("Guess a number between 1 and 100: ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too High!");
            } else if (guess < number) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }

        } while (guess != number);

        // Q102 Voting Eligibility System
        System.out.println("\n----- Q102 Voting Eligibility System -----");

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Q103 ATM Simulation
        System.out.println("\n----- Q103 ATM Simulation -----");

        double balance = 10000;

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Current Balance = " + balance);
                break;

            case 2:
                System.out.print("Enter amount to deposit: ");
                double deposit = sc.nextDouble();
                balance = balance + deposit;
                System.out.println("Updated Balance = " + balance);
                break;

            case 3:
                System.out.print("Enter amount to withdraw: ");
                double withdraw = sc.nextDouble();

                if (withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Updated Balance = " + balance);
                } else {
                    System.out.println("Insufficient Balance.");
                }
                break;

            default:
                System.out.println("Invalid Choice.");
        }

        // Q104 Quiz Application
        System.out.println("\n----- Q104 Quiz Application -----");

        int score = 0;

        sc.nextLine(); // Clear buffer

        System.out.println("Q1. What is the capital of India?");
        System.out.println("a) Mumbai");
        System.out.println("b) Delhi");
        System.out.println("c) Kolkata");
        System.out.print("Enter your answer: ");
        String ans1 = sc.nextLine();

        if (ans1.equalsIgnoreCase("b") || ans1.equalsIgnoreCase("Delhi")) {
            score++;
        }

        System.out.println("\nQ2. How many days are there in a week?");
        System.out.println("a) 5");
        System.out.println("b) 6");
        System.out.println("c) 7");
        System.out.print("Enter your answer: ");
        String ans2 = sc.nextLine();

        if (ans2.equalsIgnoreCase("c") || ans2.equals("7")) {
            score++;
        }

        System.out.println("\nQ3. Which language is used for Android development?");
        System.out.println("a) Java");
        System.out.println("b) HTML");
        System.out.println("c) Python");
        System.out.print("Enter your answer: ");
        String ans3 = sc.nextLine();

        if (ans3.equalsIgnoreCase("a") || ans3.equalsIgnoreCase("Java")) {
            score++;
        }

        System.out.println("\nYour Final Score = " + score + "/3");

        sc.close();
    }
}