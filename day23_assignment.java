import java.util.Arrays;

public class day23_assignment{
    public static void main(String[] args) {

        String str = "programming";

        // Q89 - First Non-Repeating Character
        System.out.println("Q89 - First Non-Repeating Character");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("Answer: " + ch);
                break;
            }
        }

        // Q90 - First Repeating Character
        System.out.println("\nQ90 - First Repeating Character");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                System.out.println("Answer: " + ch);
                break;
            }
        }

        // Q91 - Check Anagram Strings
        System.out.println("\nQ91 - Check Anagram Strings");

        String s1 = "listen";
        String s2 = "silent";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b))
            System.out.println("Anagram Strings");
        else
            System.out.println("Not Anagram Strings");

        // Q92 - Maximum Occurring Character
        System.out.println("\nQ92 - Maximum Occurring Character");

        int maxCount = 0;
        char maxChar = ' ';

        for (int j = 0; j < str.length(); j++) {

            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = str.charAt(j);
            }
        }

        System.out.println("Character: " + maxChar);
    }
}