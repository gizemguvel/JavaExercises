package practiceExercises;

import java.util.Scanner;

public class P07_SumOfDigits_Fibonacci {
    public static void main(String[] args) {
        // Type code to find the sum of the digits of an integer
        //  584 ==> 5+8+4= 17  ==> %10 AND ORDINARY DIVISION BY 10

        int a= 584;
        int sum=0;

        for(int i=a;i>0;i=i/10){
            sum=sum+i%10;
        }
        System.out.println("sum = " + sum);


         /*
        Ask user how many fibonacci numbers he wants to see. Then type the code that prints
      these fibonacci numbers.
      Ex: if user enters 6 output will be 1 1 2 3 5 8 13...
      */
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        int number=input.nextInt();

        int fibo1=1;
        int fibo2=1;
        int fibonacci=0;
        System.out.print(fibo1+" ");
        System.out.print(fibo2+" ");

        for (int i=1;i<number-1;i++){
            fibonacci=fibo1+fibo2;
            fibo1=fibo2;
            fibo2=fibonacci;
            System.out.print(fibonacci+" ");
        }



    }
}
