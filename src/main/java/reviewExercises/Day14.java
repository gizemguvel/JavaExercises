package reviewExercises;

import java.util.Arrays;
import java.util.Collections;

public class Day14 {
    public static void main(String[] args) {

        //Example 1: convert 2 dimensional array to 1 dimensional array

        int arr[][]= {{3, 1, 45},{98,32}};

        int sum=0;

        for (int[] w:arr){
            sum=sum+w.length;
        }
        System.out.println(sum);

        int[] brr= new int[sum];
        int idx=0;

        for (int[] w:arr){
            for (int u:w){
                brr[idx]=u;
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));

        //Example 1: Type code to find the multiplication of all elements of multidimensional array

        int multiplication=1;

        for (int[] w:arr){
            for (int u:w){
                multiplication=multiplication*u;
            }
        }
        System.out.println(multiplication);

        //Example 1: Find the sum of the minimum and maximum elements in a multidimensional array

        int a[][]= {{3, 1, 45},{98,32}};

        int total=0;
        int min= a[0][0];
        int max=a[0][0];

        for (int[] w:a){
            for (int u:w){
                min=Math.min(min,u);
                max=Math.max(max,u);
                total=max+min;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("total = " + total);


    }
}
