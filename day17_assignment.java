import java.util.*;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input First Array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input Second Array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Q65 - Merge Arrays
        System.out.println("\nMerged Array:");
        int[] merged = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }

        for (int num : merged) {
            System.out.print(num + " ");
        }

        // Q66 - Union of Arrays
        System.out.println("\n\nUnion of Arrays:");
        HashSet<Integer> union = new HashSet<>();

        for (int num : arr1) {
            union.add(num);
        }

        for (int num : arr2) {
            union.add(num);
        }

        for (int num : union) {
            System.out.print(num + " ");
        }

        // Q67 - Intersection of Arrays
        System.out.println("\n\nIntersection of Arrays:");
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        for (int num : intersection) {
            System.out.print(num + " ");
        }

        // Q68 - Common Elements
        System.out.println("\n\nCommon Elements:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }

        sc.close();
    }
}