package Array;
import java.util.*;
public class MinimumFinder {

    public static int findMinimum(int[]arr){
        int minimum=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<minimum){
                minimum=arr[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n= sc.nextInt();
        int[]numbers=new int[n];

        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }

        int minimum=findMinimum(numbers);
        System.out.println("The minimum number is:"+minimum);

    }
}
