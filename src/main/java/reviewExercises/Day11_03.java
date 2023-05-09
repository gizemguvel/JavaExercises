package reviewExercises;

import java.util.Scanner;

public class Day11_03 {
    public static void main(String[] args) {
        /*
            Example 4: Type java code by using while loop,
            Write a program that prompts the user to input an integer.
            It should then find the sum of the digits of that number.
            123 ==> 1+2+3 = 6
         */

        Scanner input=new Scanner(System.in);
        System.out.println("enter an integer");
        int number=input.nextInt();

        int sum=0;

        while (number>0){

            sum=sum+number%10;
            number=number/10;
        }
        System.out.println(sum);


        /*
            Example 5: Type java code by using while loop,
            Write a program that prompts the user to input a number.
            It should then print the multiplication table of that number.
            3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
        */

        System.out.println("enter a number");
        int num=input.nextInt();
        int m=1;

        while (m<11){
            System.out.print(num+"x"+m+"="+(num*m)+" ");
            m++;
        }

    }
}
