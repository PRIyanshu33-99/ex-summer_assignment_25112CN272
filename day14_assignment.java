import java.util.Scanner;

public class day14_assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Q53: Linear Search
        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();

        boolean found = false;
        int position = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                found = true;
                position = i;
                break;
            }
        }

        if (found)
            System.out.println("Element found at position " + (position + 1));
        else
            System.out.println("Element not found");

        // Q54: Frequency of an Element
        System.out.print("\nEnter element to find frequency: ");
        int freqElement = sc.nextInt();

        int frequency = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == freqElement) {
                frequency++;
            }
        }

        System.out.println("Frequency of " + freqElement + " = " + frequency);

        // Q55: Second Largest Element
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE)
            System.out.println("\nSecond largest element does not exist.");
        else
            System.out.println("\nSecond largest element = " + secondLargest);

        // Q56: Find Duplicates in Array
        System.out.println("\nDuplicate elements are:");
        boolean duplicateFound = false;

        for (int i = 0; i < n; i++) {
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted)
                continue;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    duplicateFound = true;
                    break;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No duplicate elements found.");
        }

        sc.close();
    }
}