package Array;

public class Task12 {

        public static int findMaxSumSubArray(int[] arr) {
            int maxEndingHere = arr[0];
            int maxSoFar = arr[0];

            for (int i = 1; i < arr.length; i++) {
                maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
                maxSoFar = Math.max(maxSoFar, maxEndingHere);
            }

            return maxSoFar;
        }

        public static void main(String[] args) {
            int[] arr = {1, 7, -2, -5, 10, -1};
            int maxSum = findMaxSumSubArray(arr);
            System.out.println("Maximum sub array sum: " + maxSum);
        }
    }

