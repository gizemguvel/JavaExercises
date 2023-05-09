package reviewExercises;

import java.util.Arrays;
import java.util.Collections;

public class Day13 {
    public static void main(String[] args) {
        //Example 1: Create an integer array and print elements less than 10 on the console.
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 513;
        arr[2] = 9;
        arr[3] = 67;
        arr[4] = 8;

        //long t1=System.nanoTime();
        for (int w : arr) {
            if (w < 10) {
                System.out.print(w + " ");
            }
        }
        System.out.println();
        //long t2=System.nanoTime();

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        for (int w : arr) {
            if (w >= 10) {
                break;

            } else System.out.print(w + " ");
        }
        //long t3=System.nanoTime();
        System.out.println();


        //Example 2: Create an integer array and print elements greater than 10 on the console.

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int w : arr) {
            if (w <= 10) {
                continue;
            }
            System.out.print(w + " ");
        }
        System.out.println(Arrays.toString(arr));


        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] <= 10) {
                break;
            }
            System.out.print(arr[i] + " ");
        }

        //Example 1: Type code to check if a specific element exists in the array or not

        String[] letters = {"a", "k", "o"};

        int counter=0;
        for (String w:letters){
            if(w=="k"){
                counter++;
                break;
            }

        }if(counter>0){
            System.out.println("exists");
        }else {
            System.out.println("doesn't exist");
        }




        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));
        int element=Arrays.binarySearch(letters,"k");
        System.out.println("element = " + element);


    }
}
