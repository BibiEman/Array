package Array;

import java.util.*;
public class ArrayProduct {

        public static int[] findProduct(int[] arr) {
            int n = arr.length;
            int[] result = new int[n];

            int leftProduct = 1;
            for (int i = 0; i < n; i++) {
                result[i] = leftProduct;
                leftProduct *= arr[i];
            }

            int rightProduct = 1;
            for (int i = n - 1; i >= 0; i--) {
                result[i] *= rightProduct;
                rightProduct *= arr[i];
            }

            return result;
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

            int[] result = findProduct(arr);

            System.out.println("\nInput array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            System.out.println("\nProduct array:");
            for (int num : result) {
                System.out.print(num + " ");
            }

            scanner.close();
        }
    }


