package reviewExercises;

import java.util.Scanner;

public class Day07_03 {
    public static void main(String[] args) {
        //Example 1: If the worker is male and the age is greater than 65 he will be retired otherwise he should work
        //           If the worker is female and the age is greater than 60 she will be retired otherwise she should work
        //           If the worker does not define himself as male or female print "Undefined" on the console

        Scanner input = new Scanner(System.in);
        System.out.println("enter gender");
        String gender = input.next();

        System.out.println("enter age");
        int age = input.nextInt();

        if (gender.equalsIgnoreCase("male")) {
            if (age < 0) {
                System.out.println("invalid age");
            } else if (age <= 65) {
                System.out.println("he should work");
            } else {
                System.out.println("he should be retired");
            }
        } else if (gender.equalsIgnoreCase("female")) {
            if (age < 0) {
                System.out.println("invalid age");
            } else if (age <= 60) {
                System.out.println("she should work");
            } else {
                System.out.println("she should be retired");
            }
        } else {
            System.out.println("undefined gender");
        }

        //Example 1: Type code to check if a number is even or not by using ternary
        System.out.println("enter a number");
        int number = input.nextInt();
        String result = number % 2 == 0 ? "even" : "odd";
        System.out.println("result = " + result);

        //Example 2: Type code to check if a number has 3 digits or not

        String digits = number > 99 && number < 1000 ? "3 digits" : "not 3 digits";
        System.out.println("digits = " + digits);


    }
}
