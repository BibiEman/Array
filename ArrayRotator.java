package Array;
import java.util.Scanner;
public class ArrayRotator {
           public static void rotateArray(int[] arr) {
            if (arr == null || arr.length <= 1) {
                return; // No need to rotate
            }

            int lastElement = arr[arr.length - 1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = lastElement;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            rotateArray(arr);

            System.out.println("Array after rotating right by 1:");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            scanner.close();
        }
    }


