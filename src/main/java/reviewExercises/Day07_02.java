package reviewExercises;

import java.util.Scanner;

public class Day07_02 {
    public static void main(String[] args) {
        //Example 1: Get user's age
        //           0-4 ==> Baby  5-12 ==> Kid  13-19 ==> Teenager  20-30 ==> Adult
        //           Others ==> Undefined   Negative ages ==> Invalid age

        Scanner input=new Scanner(System.in);
        System.out.println("enter age");
        int age=input.nextInt();


        if(age<0) {
            System.out.println("invalid");
        }else if(age<5){
            System.out.println("baby");
        } else if (age<13) {
            System.out.println("kid");
        } else if (age<20) {
            System.out.println("teenager");
        } else if (age<=30) {
            System.out.println("adult");
        }else{
            System.out.println("undefined age");
        }


    }
}
