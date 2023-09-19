package Array;

public class ArrayTask4 {

        public static int[] removeEven(int[] array) {
            int odd = 0;
            for (int i = 0; i<array.length; i++) {
                if (array[i] % 2 != 0) {
                    odd++;
                }
            }
            int[] updated = new int[odd];
            int index = 0;
            for (int i = 0; i<array.length; i++) {
                if (array[i] % 2 != 0) {
                    updated[index] = array[i];
                    index++;
                }
            }
            return updated;
        }

        public static void PrintArray( int[] array){
            System.out.println("original values of array are:");

            for (int i = 0; i<array.length; i++) {
                System.out.println(array[i] + " ");
            }
        }


        public static void main (String[]args){
            int[] array = {1, 2, 4, 5, 10, 6, 3};
            PrintArray(array);
            int result[]= removeEven(array);
            PrintArray(result);


        }
    }


