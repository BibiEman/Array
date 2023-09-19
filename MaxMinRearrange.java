package Array;
import java.util.Scanner;
public class MaxMinRearrange {
          public static void maxMin(int[] arr) {
            int n = arr.length;
            int[] result = new int[n];

            int left = 0;
            int right = n - 1;

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    result[i] = arr[right--];
                } else {
                    result[i] = arr[left++];
                }
            }

            System.arraycopy(result, 0, arr, 0, n);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the elements (sorted in ascending order):");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            maxMin(arr);

            System.out.println("Array after rearranging:");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            scanner.close();
        }
    }


