package Array;
import java.util.Scanner;
public class ArrayTask04 {
        public ArrayTask04() {
        }

        public static int[] findSum(int[] arr, int n) {
            for(int i = 0; i < arr.length - 1; ++i) {
                for(int j = i + 1; j < arr.length; ++j) {
                    if (arr[i] + arr[j] == n) {
                        int[] pair = new int[]{arr[i], arr[j]};
                        return pair;
                    }
                }
            }

            return arr;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Array Size");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.print("Enter Array Elements");

            int n;
            for(n = 0; n < size; ++n) {
                arr[n] = sc.nextInt();
            }

            System.out.println("Enter target number for sum");
            n = sc.nextInt();
            findSum(arr, n);
            int[] result = findSum(arr, n);
            if (result.length == 2) {
                System.out.println("Pair found: (" + result[0] + "," + result[1] + ")");
            } else {
                System.out.println("Pair not found");
            }

        }
    }



