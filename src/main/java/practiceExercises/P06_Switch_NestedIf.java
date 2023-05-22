package practiceExercises;

import java.util.Scanner;

public class P06_Switch_NestedIf {
    public static void main(String[] args) {
        //Ask user to enter a character, if it is vowel print 'Vowel 'or if it is not vowel 'Not Vowel

        Scanner input=new Scanner(System.in);
        System.out.println("enter a character");
        char ch=input.next().charAt(0);

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("enter again");

        }

         /*
           If the gender is "Male" and the age is less than 13 print "Boy" otherwise print "Man".
        If the gender is "Female" and the age is less than 13 print "Girl" otherwise print "Woman".
        If the gender is different from "Male" and "Female" print "No information".
        If you put another statement into an if statement you need to use 'nested if'
        //to prevent any difference cause any problem with the entrance of the data
         */
        System.out.println("enter gender");
        String gender=input.next();
        System.out.println("enter age");
        int age=input.nextInt();

        if(gender.equals("male")){
            if(age<0){
                System.out.println("invalid age");
            } else if (age<13) {
                System.out.println("boy");
            }else {
                System.out.println("man");
            }
        } else if (gender.equals("female")) {
            if(age<0){
                System.out.println("invalid age");
            } else if (age<13) {
                System.out.println("girl");
            }else {
                System.out.println("woman");
            }
        }else {
            System.out.println("no info");
        }
    }
}
