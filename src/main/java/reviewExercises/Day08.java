package reviewExercises;

import java.util.Scanner;

public class Day08 {
    public static void main(String[] args) {

        /*
                Type java code by using nested ternary.
                Write a program to check if a year is "leap year" or not.
                i)If the year is divisible by 100 then it must be divisible by 400.==>1600+
                ii)If a year is not divisible by 100 then it must be divisible by 4.==>2004+  1997-
        */


        int number= 16;
        String result= number%100==0 ? (number%400==0 ? "leap" :"not leap") : (number%4==0?"leap":"not leap");
        System.out.println("result = " + result);


        /*
            Type code to check the password
            If it has more than 8 characters, initial should be 'i'
            If it has no more than 8 characters initial should be 'K'
            Solve the task by using nested-ternary
        */

        String pwd="Kaksleod";

        String r= pwd.length()>8 ? (pwd.startsWith("i") ? "valid":"invalid") :(pwd.startsWith("K")?"valid":"invalid");
        System.out.println("r = " + r);


        /*
               Example 1:For the number of the days, print the day names
                            ... 3==>Tuesday ... 7==>Saturday
        */

        int dayNumber=3;

        switch (dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("enter valid number");





        }


        /*

                       If user enters 5 the code will print May, June, July, August, September, October,
                    November, December

                       If user enters 9 the code will print September, October, November, December
                 */

        int monthNumber=9;

        switch (monthNumber){
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");

            case 6:
                System.out.println("June");

            case 7:
                System.out.println("July");

            case 8:
                System.out.println("August");

            case 9:
                System.out.println("September");

            case 10:
                System.out.println("October");

            case 11:
                System.out.println("November");

            case 12:
                System.out.println("December");

            default:
                System.out.println("enter valid month number");

        }


            //Example 1: Create a simple calculator which does addition, subtraction, multiplication,
            //division, percentage calculation

        Scanner input= new Scanner (System.in);
        System.out.println("enter the first number");
        int num1=input.nextInt();
        System.out.println("enter the second number");
        int num2=input.nextInt();
        System.out.println("enter a math operation symbol");
        char operation=input.next().charAt(0);

        switch (operation){
            case '+':
                System.out.println("addition: " +(num1+num2));
                break;
            case '-':
                System.out.println("subtraction: " +(num1-num2));
                break;
            case '*':
                System.out.println("multiplication: " +(num1*num2));
                break;
            case '/':
                System.out.println("division: " +(num1/num2));
                break;
            default:
                System.out.println("enter a valid sign");
        }











}
}
