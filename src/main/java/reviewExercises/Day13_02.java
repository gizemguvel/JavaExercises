package reviewExercises;

import java.util.Arrays;

public class Day13_02 {
    public static void main(String[] args) {

        //How to create a multidimensional array

        int arr[][]=new int[3][2];
        int brr[][]= {{1,2},{60,34},{43,45}};

        //How to print multidimensional array on the console
        System.out.println(Arrays.deepToString(arr));

        //How to add elements into a multidimensional array
        arr[0][0]=1;
        arr[0][1]=2;
        arr[1][0]=60;
        arr[1][1]=34;
        arr[2][0]=43;
        arr[2][1]=45;
        System.out.println(Arrays.deepToString(arr));

        //How to print the element of outer array
        System.out.println(Arrays.toString(arr[1]));

        //How to print array elements one by one
        System.out.println(arr[1][0]);

        //Example 1: Type code to find the sum of all elements in an integer multidimensional array

       int sum=0;
        for(int[] w:brr){
            for(int u:w){
                sum+=u;
            }
        }
        System.out.println(sum);

    }
}
