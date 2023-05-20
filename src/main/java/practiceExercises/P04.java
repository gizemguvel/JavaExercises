package practiceExercises;

import java.util.Scanner;
import java.util.SortedMap;

public class P04 {
    public static void main(String[] args) {
        //Type code to check if a String does not have any space character at the beginning and at the end
        //Example==> ' Ali ' should print false on the console
        //            'Ali' should print true on the console

        String name=" Ali ";
        String trimmedName=name.trim();
        boolean result=name.equalsIgnoreCase(trimmedName);
        System.out.println("result = " + result);


        //Ask user to enter an integer then print "Even" on the console if the number is even.
        Scanner input=new Scanner(System.in);
        System.out.println("enter an integer");
        int number=input.nextInt();
        boolean result2=number%2==0;
        System.out.println("Is the number even? : " + result2);


        //Check a number if it is odd or not
        System.out.println("is the number odd? "+(number%2!=0));



         /*
           String shirtPrice= "$ 12.99";
           String bookPrice= "$ 35.99";
           Type code to find the sum of the shirt and book prices.
     */
        String shirtPrice= "$ 12.99";
        String bookPrice= "$ 35.99";

        String shirt=shirtPrice.replace("$","");
        String book=bookPrice.replace("$","");

        double sum=Double.valueOf(shirt)+Double.valueOf(book);
        System.out.println("sum = " + sum);


    }
}
