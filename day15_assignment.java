import java.util.Scanner;
import java.util.Arrays;

public class day15_assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array from user
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Q57 Reverse Array
        int[] reverseArr = arr.clone();

        for (int i = 0; i < reverseArr.length / 2; i++) {
            int temp = reverseArr[i];
            reverseArr[i] = reverseArr[reverseArr.length - 1 - i];
            reverseArr[reverseArr.length - 1 - i] = temp;
        }

        System.out.println("\nQ57 Reverse Array:");
        System.out.println(Arrays.toString(reverseArr));

        // Q58 Left Rotate Array by 1 position
        int[] leftRotate = arr.clone();

        int first = leftRotate[0];
        for (int i = 0; i < leftRotate.length - 1; i++) {
            leftRotate[i] = leftRotate[i + 1];
        }
        leftRotate[leftRotate.length - 1] = first;

        System.out.println("\nQ58 Left Rotate Array:");
        System.out.println(Arrays.toString(leftRotate));

        // Q59 Right Rotate Array by 1 position
        int[] rightRotate = arr.clone();

        int last = rightRotate[rightRotate.length - 1];
        for (int i = rightRotate.length - 1; i > 0; i--) {
            rightRotate[i] = rightRotate[i - 1];
        }
        rightRotate[0] = last;

        System.out.println("\nQ59 Right Rotate Array:");
        System.out.println(Arrays.toString(rightRotate));

        // Q60 Move Zeroes to End
        int[] zeroArr = arr.clone();

        int index = 0;
        for (int i = 0; i < zeroArr.length; i++) {
            if (zeroArr[i] != 0) {
                zeroArr[index] = zeroArr[i];
                index++;
            }
        }

        while (index < zeroArr.length) {
            zeroArr[index] = 0;
            index++;
        }

        System.out.println("\nQ60 Move Zeroes to End:");
        System.out.println(Arrays.toString(zeroArr));

        sc.close();
    }
}