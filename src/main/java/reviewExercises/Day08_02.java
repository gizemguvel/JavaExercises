package reviewExercises;

import java.util.Scanner;

public class Day08_02 {
    public static void main(String[] args) {
        //Example 1:  Ask user to enter country name among "America, England, Germany, Turkey,India, Peru, Spain,
        // Bulgaria, Albania, France"
        // Type code to print abbreviation of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL,FR"

        Scanner input=new Scanner(System.in);
        System.out.println("enter country name");
        String country=input.next().toLowerCase();

        switch(country){
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            default:
                System.out.println(" ");
        }

        //Example 1: Type code to select the minimum one of two integers
        int a=5;
        int b=3;

        int result = a < b ? a : b;
        System.out.println("result = " + result);

        //Example 2: Type code to calculate absolute value of an integer
        int x=-35;
        int resul2=x<0 ? (x*-1) : x;
        System.out.println("resul2 = " + resul2);

        //Example 3: If two integers are positive return the multiplication
        //           otherwise, give a message "I do not know how to multiply

        int num1=4;
        int num2=-5;

        Object result3=num1>0 && num2>0 ? (num1*num2) : "I do not know how to multiply";
        System.out.println("result3 = " + result3);


    }
}
