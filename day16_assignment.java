import java.util.Scanner;

public class day16_assignment
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Q61 - Find Missing Number
        System.out.println("\nQ61. Find Missing Number");

        boolean validForMissing = true;

        // Check for duplicates
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    validForMissing = false;
                    break;
                }
            }
        }

        if (validForMissing) {
            int expectedSum = (n + 1) * (n + 2) / 2;
            int actualSum = 0;

            for (int i = 0; i < n; i++) {
                actualSum += arr[i];
            }

            int missingNumber = expectedSum - actualSum;
            System.out.println("Missing Number = " + missingNumber);
        } else {
            System.out.println("Missing Number cannot be found because the array contains duplicate elements.");
        }

        // Q62 - Find Maximum Frequency Element
        System.out.println("\nQ62. Find Maximum Frequency Element");

        int maxCount = 0;
        int maxElement = arr[0];

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Maximum Frequency Element = " + maxElement);
        System.out.println("Frequency = " + maxCount);

        // Q63 - Find Pair with Given Sum
        System.out.println("\nQ63. Find Pair with Given Sum");

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair Found: " + arr[i] + " and " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No Pair Found");
        }

        // Q64 - Remove Duplicates
        System.out.println("\nQ64. Remove Duplicates from Array");

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < n; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}