import java.util.Scanner;

public class day18_assignment {

    // Bubble Sort (Ascending)
    static void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Bubble Sort (Ascending):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Selection Sort (Ascending)
    static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println("Selection Sort (Ascending):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Binary Search
    static void binarySearch(int arr[], int key) {
        int low = 0, high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at position: " + (mid + 1));
                found = true;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
    }

    // Descending Order Sort
    static void descendingSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Descending Order Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Copies of original array
        int bubbleArr[] = arr.clone();
        int selectionArr[] = arr.clone();
        int descArr[] = arr.clone();

        // Q69 Bubble Sort
        bubbleSort(bubbleArr);

        // Q70 Selection Sort
        selectionSort(selectionArr);

        // Q71 Binary Search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Binary search requires sorted array
        binarySearch(selectionArr, key);

        // Q72 Descending Order Sort
        descendingSort(descArr);

        sc.close();
    }
}