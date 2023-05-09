package reviewExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day14_02 {
    public static void main(String[] args) {
        //Example 1:Type code to print the elements of a list if the element is greater than the number of elements
        //          [5, 9, 3, 4, 6]==> 9-6

        List<Integer> number=new ArrayList<>();
        number.add(5);
        number.add(9);
        number.add(3);
        number.add(4);
        number.add(6);
        System.out.println("number = " + number);

        for (int w: number){
            if(w>number.size()){
                System.out.println(w+" ");
            }
        }

        //Example 1: convert 2 dimensional array to 1 dimensional array

        int[][] a = {{3,4},{5,7},{8,9}};

        int counter=0;
        for (int[]w:a){
            counter=counter+ w.length;
            }
        System.out.println("counter = " + counter);


        int[] b=new int[counter];
        int idx=0;
        for(int[]w:a){
            for (int u:w){
                b[idx]=u;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b));

        //Example 1: Type code to find the multiplication of all elements of multidimensional array
        int multiplication=1;
        for (int[]w:a){
            for (int u:w){
                multiplication=multiplication*u;
            }
        }
        System.out.println("multiplication = " + multiplication);


        //Example 1: Find the sum of the minimum and maximum elements in a multidimensional array
        int min=a[0][0];
        int max=a[0][0];

        for (int[]w:a){
            for (int u:w){
                min=Math.min(min,u);
                max=Math.max(max,u);
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println(min+max);



    }
}
