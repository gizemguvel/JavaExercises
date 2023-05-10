package reviewExercises;

import java.util.ArrayList;
import java.util.List;

public class Day15_02 {
    public static void main(String[] args) {
        //Example 1: Create an Integer list, add 5 elements into it, change the elements less than 10 to 77
        List<Integer> numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(9);
        numbers.add(16);
        numbers.add(54);
        System.out.println("numbers = " + numbers);


        for (int i=0;i<numbers.size();i++){
            if(numbers.get(i)<10){
                numbers.set(i,77);{
                }
            }
        }System.out.println(numbers);


        for (int w:numbers){
           if(w<10){
               numbers.set(numbers.indexOf(w),77);

               }
           }
        System.out.println(numbers);

    }}

