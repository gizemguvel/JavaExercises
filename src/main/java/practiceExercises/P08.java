package practiceExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P08 {
    public static void main(String[] args) {
        //Type a code to print its season after getting a month from the user
        Scanner input=new Scanner(System.in);
        System.out.println("enter a month");
        String month=input.next().toLowerCase();

        switch (month){
            case "december":
            case "january":
            case "february":
                System.out.println("winter");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("spring");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("summer");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("autumn");
                break;
            default:
                System.out.println("enter a valid month");
        }

        if(month.equals("december")||month.equals("january")||month.equals("february")){
            System.out.println("winter");
        } else if (month.equals("march")||month.equals("april")||month.equals("may")) {
            System.out.println("spring");
        } else if (month.equals("june")||month.equals("july")||month.equals("august")) {
            System.out.println("summer");
        } else if (month.equals("september")||month.equals("october")||month.equals("november")) {
            System.out.println("autumn");
        }else System.out.println("enter valid month");

        //Type code to print the integers divisible by 4 and 6 from 13 to 211.

        for(int i=13;i<212;i++){

            if(i%4==0 && i%6==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        int i=13;
        while (i<212){
            if(i%4==0 && i%6==0){
                System.out.print(i+" ");
            }
            i++;
        }

        System.out.println();
        //Type code to check if a specific element exists in an Array or not

        String a[]={"ali","beliz","osman","elif"};
        String name="b";

        int counter=0;
       for (String w:a){
           if(a.equals(name)){
               counter++;
           }
       }if (counter>0){
            System.out.println("exists");
        }else{
           System.out.println("does not exist");
        }

        Arrays.sort(a);
        int index=Arrays.binarySearch(a,name);
        System.out.println("index = " + index);


    }
}
