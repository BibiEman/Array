package Array;

public class ArrayTask1 {

        public void PrintArray(int arr[]){

            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
        public  void arrayCreation() {
            int[] myArray = new int[5];
            myArray[0] = 5;
            myArray[1] = 1;
            myArray[2] = 8;
            myArray[3] = 2;
            myArray[4] = 10;
            myArray[2] = 9;

            PrintArray(myArray);
        }

        public static void main(String[] args) {

            ArrayTask1 t=new ArrayTask1();
            t.arrayCreation();
        }
    }



