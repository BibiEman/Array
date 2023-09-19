package Array;
import java.util.Scanner;
public class FindUnique {
    public static int findUnique1(int[] arr){
        //iterate over every element
        for(int i=0; i<arr.length; i++) {
        //initialize count to 0
            int count =0;
            for(int j=0; j<arr.length; j++) {
                //count the frequency
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
//count == 1 ans return
            if(count == 1) {
                return arr[i];
            }
        }
//no unique element found
        return -1;
    }
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static void main(String[] args){
        System.out.println("Enter the number of elements:");
        int[] arr = takeInput();
        System.out.println("The output is:");
        System.out.println(findUnique1(arr));
    }
}

