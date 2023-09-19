package Array;
import java.util.Scanner;
public class RearrangeArray {
        public static void reArrange(int[] arr) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {

                while (left < arr.length && arr[left] < 0) {
                    left++;
                }

                while (right >= 0 && arr[right] >= 0) {
                    right--;
                }


                if (left < right) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();


            int[] arr = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            reArrange(arr);
            System.out.println("Rearranged array:");

            for (int i = 0; i < arr.length; i++) {

                System.out.print(arr[i] + " ");


            }


        }


    }



