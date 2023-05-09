package reviewExercises;

import java.util.Scanner;

public class Day10_02 {
    public static void main(String[] args) {
        /*
        Example:Type code to get the output like
                Week: 1
                  Day: 1
                  Day: 2
                  Day: 3
                  .....
                Week: 2
                  Day: 1
                  Day: 2
                  Day: 3
            ....
         */

        for (int i=1; i<5;i++){

            System.out.println("Week: "+i);

            for(int j=1; j<8;j++){

                System.out.println("Day: "+j);
            }
        }

        /*
            Example 3: Write a Java Program to Print Rectangle Star Pattern using For Loop
                ****
                ****
                ****
            Note: Get the number of rows and columns from user

         */

        Scanner input=new Scanner(System.in);
        System.out.println("enter number of rows");
        int row=input.nextInt();
        System.out.println("enter number of columns");
        int column=input.nextInt();

        for(int i=1;i<=row;i++){

            for (int k=1;k<=column;k++){
                System.out.print("*");
            }
            System.out.println();
        }









    }
}
