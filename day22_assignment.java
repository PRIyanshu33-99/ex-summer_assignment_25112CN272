
import java.util.Scanner;

public class day22_assignment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q85: Check Palindrome String
        System.out.println("Q85: Check Palindrome String");

        System.out.print("Enter a string: ");
        String palindrome = sc.nextLine();

        String reverse = "";

        for (int i = palindrome.length() - 1; i >= 0; i--) {
            reverse = reverse + palindrome.charAt(i);
        }

        if (palindrome.equals(reverse)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }

        System.out.println();


        // Q86: Count Words in a Sentence
        System.out.println("Q86: Count Words in a Sentence");

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.trim().split("\\s+");

        System.out.println("Total words = " + words.length);

        System.out.println();


        // Q87: Character Frequency
        System.out.println("Q87: Character Frequency");

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Frequency of '" + ch + "' = " + count);

        sc.nextLine(); // consume leftover newline

        System.out.println();


        // Q88: Remove Spaces from String
        System.out.println("Q88: Remove Spaces from String");

        System.out.print("Enter a string: ");
        String spaceString = sc.nextLine();

        String result = "";

        for (int i = 0; i < spaceString.length(); i++) {

            if (spaceString.charAt(i) != ' ') {
                result = result + spaceString.charAt(i);
            }
        }

        System.out.println("String without spaces: " + result);

        sc.close();
    }
}
