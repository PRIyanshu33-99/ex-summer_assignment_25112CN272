import java.util.*;

public class day25_assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q97 Merge Two Sorted Arrays
        System.out.println("Q97. Merge Two Sorted Arrays");

        System.out.print("Enter size of first sorted array: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second sorted array: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];

        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int merged[] = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        System.out.print("Merged Array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        sc.nextLine(); // clear buffer

        // Q98 Find Common Characters in Strings
        System.out.println("Q98. Find Common Characters in Strings");

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.print("Common Characters: ");
        String common = "";

        for (i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            if (str2.indexOf(ch) != -1 && common.indexOf(ch) == -1) {
                common += ch;
            }
        }

        System.out.println(common);
        System.out.println();

        // Q99 Sort Names Alphabetically
        System.out.println("Q99. Sort Names Alphabetically");

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        String names[] = new String[n];

        for (i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        Arrays.sort(names);

        System.out.println("Names in Alphabetical Order:");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();

        // Q100 Sort Words by Length
        System.out.println("Q100. Sort Words by Length");

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String words[] = sentence.split(" ");

        for (i = 0; i < words.length - 1; i++) {
            for (j = i + 1; j < words.length; j++) {
                if (words[i].length() > words[j].length()) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        System.out.println("Words Sorted by Length:");
        for (String word : words) {
            System.out.print(word + " ");
        }

        sc.close();
    }
}