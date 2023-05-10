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


        //Example 2: Create an Integer list and remove the duplicated elements
        List<Integer> ages=new ArrayList<>();
        ages.add(5);
        ages.add(10);
        ages.add(9);
        ages.add(16);
        ages.add(54);
        ages.add(54);
        ages.add(9);
        System.out.println("ages = " + ages);

//        List<Integer> noDuplication=new ArrayList<>();
//
//        for (int w:ages){
//            if(!noDuplication.contains(w)){
//                noDuplication.add(w);
//            }
//        }
//        System.out.println("noDuplication = " + noDuplication);

        for(int i=0; i<ages.size(); i++){

            if(ages.indexOf(ages.get(i))!=ages.lastIndexOf(ages.get(i))){
                ages.remove(i);
                i--;
            }
        }
        System.out.println("ages = " + ages);


    }
}

