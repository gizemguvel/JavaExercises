package reviewExercises;

import java.util.Arrays;

public class Day12 {
    public static void main(String[] args){
        //How to create an Array
        String[] arr=new String[3];

        //How to print an Array on the console
        System.out.println(Arrays.toString(arr));

        //How to add elements into an Array
        arr[0]="a";
        arr[1]="b";
        arr[2]="c";

        //How to print specific elements from an Array
        System.out.println(arr[1]);

        //How to find the number of elements in an Array
        System.out.println(arr.length);

        //Example 1: Create a String Array, add 5 elements in it, type code to print
        //           the sum of the characters in the first and the last element on the console.
        //           Make your code dynamic

        String[] a=new String[5];
        a[0]="Ali";
        a[1]="Ahmet";
        a[2]="Ayse";
        a[3]="Gizem";
        a[4]="Zeynep";

        int numOfCharsFirst=a[0].length();
        int numOfCharsLast=a[a.length-1].length();


        System.out.println("total is: "+(numOfCharsFirst+numOfCharsLast));

        //Example 2: Create a String Array, add 5 elements in it, type code to print
        //           the sum of all characters in all element on the console.

        int sum=0;
        for (int i=0;i<a.length;i++){
            sum=sum+a[i].length();
        }
        System.out.println(sum);



        int total=0;
        for(String w:a){
            total=total+w.length();
        }
        System.out.println("total = " + total);

        //Example 1: Create an integer array, add 6 elements in it. Find the sum of all elements.

        int sum1=0;
        int[]numbers={12,13,1,4,5,6};
        for(int w:numbers){
            sum1+=w;
        }
        System.out.println("sum1 = " + sum1);

        //Example 2: Create an integer array, type code to find the sum of the min and the max value.
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int min=numbers[0];
        int max=numbers[numbers.length-1];
        System.out.println(min+max);


        int minValue=numbers[0];
        int maxValue=numbers[0];

        for (int w:numbers){
            minValue=Math.min(minValue,w);
            maxValue=Math.max(maxValue,w);

        }
        System.out.println(minValue+maxValue);
        System.out.println("minValue = " + minValue);
        System.out.println("maxValue = " + maxValue);

        //Example 1: Create a String array with 5 elements, delete the elements whose length is less than 5
        //           [Orange, Blue, Red, Yellow, Brown] ==> [Orange, Yellow, Brown]

        String[] colors={"Orange", "Blue", "Red", "Yellow", "Brown"};

        int counter=0;
        for(String w:colors){
            if(w.length()>=5){
                counter++;
            }
        }
        System.out.println(counter);

        String[]array=new String[counter];
        int index=0;
        for(String w:colors){
            if(w.length()>=5){
                array[index]=w;
                index++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(colors));
    }
}
