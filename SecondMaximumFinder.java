package Array;
import java.util.*;
public class SecondMaximumFinder {

        public static int findSecondMaximum(int[] arr) {
            int max = arr[0];
            int secondMax = arr[1];

            if (secondMax > max) {
                int temp = max;
                max = secondMax;
                secondMax = temp;
            }

            for (int i = 2; i < arr.length; i++) {
                if (arr[i] > max) {
                    secondMax = max;
                    max = arr[i];
                } else if (arr[i] > secondMax && arr[i] != max) {
                    secondMax = arr[i];
                }
            }

            return secondMax;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements:");
            int n = sc.nextInt();

            if (n < 2) {
                System.out.println("Array should contain at least two unique elements.");
                sc.close();
                return;
            }

            int[] arr = new int[n];
            System.out.println("Enter the elements:");

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int secondMax = findSecondMaximum(arr);
            System.out.println("The second largest element is: " + secondMax);

            sc.close();
        }
    }


