package Array;
import java.util.*;
public class TwoArraySorting {

        public TwoArraySorting() {
        }

        public static void PrintArray(int[] Arr1, int[] Arr2) {
            System.out.println("Elements of first Array: ");

            int i;
            for(i = 0; i < Arr1.length; ++i) {
                System.out.println("Array[" + i + "]=" + Arr1[i]);
            }

            System.out.println();
            System.out.println("Elements of  Second Array");

            for(i = 0; i < Arr2.length; ++i) {
                System.out.println("Array[" + i + "]=" + Arr2[i]);
            }

        }

        public static int[] mergeArrays(int[] Arr1, int[] Arr2) {
            int length1 = Arr1.length;
            int length2 = Arr2.length;
            int[] Result = new int[length1 + length2];

            int i;
            for(i = 0; i < length1; ++i) {
                Result[i] = Arr1[i];
            }

            for(i = 0; i < length2; ++i) {
                Result[length1 + i] = Arr2[i];
            }

            return Result;
        }

        public static void main(String[] args) {
            int[] Arr1 = new int[]{1, 8, 3, 2};
            int[] Arr2 = new int[]{6, 5, 7, 4};
            PrintArray(Arr1, Arr2);
            int[] result = mergeArrays(Arr1, Arr2);
            mergeArrays(Arr1, Arr2);
            Arrays.sort(result);
            System.out.println("Two Merged Arrays are:");

            for(int i = 0; i < result.length; ++i) {
                System.out.print(result[i] + " ");
            }

        }
    }



