package reviewExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day16 {
    public static void main(String[] args) {
        //Example 1: Find two closest integer elements in a given list
        //           [12, 15, 10, 14] ==> 14 and 15
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(10);
        list.add(14);

        Collections.sort(list);
        System.out.println(list);

        int minDifference= list.get(1)-list.get(0);

       for (int i=1;i<list.size();i++){

           minDifference=Math.min(minDifference,list.get(i)- list.get(i-1));

       }
        System.out.println("minDifference = " + minDifference);


       for (int i=1;i<list.size();i++){
           if(list.get(i)- list.get(i-1)==minDifference){
               System.out.println(list.get(i-1)+" "+list.get(i));
           }
       }

        //Example 1: Create a salary list and increase the salary %10 if the salary is less than 5000 dollars.
        //           [4500, 6400, 2300, 5000, 7150] ==> 4500-->4950 - 2300—>2530

       List<Double>salary=new ArrayList<>();
       salary.add(4500.0);
       salary.add(6400.0);
       salary.add(5000.0);
       salary.add(7150.0);

       for (Double w:salary){
           if (w<5000){
               salary.set(salary.indexOf(w),w*1.1);
           }
       }
        System.out.println(salary);


        //Example 1: Convert an Array to a List
        String[]a={"Ali","Veli","John"};
        System.out.println(Arrays.toString(a));

        List<String> aList=Arrays.asList(a);

        System.out.println("aList = " + aList);


    }
}
