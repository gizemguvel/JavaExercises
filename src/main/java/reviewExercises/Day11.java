package reviewExercises;

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        /*
            Ask user to enter an integer.
            If the integer is less than 100, tell user "Won!"
            Otherwise, tell user "Lost!"
        */

        Scanner input = new Scanner(System.in);

//        do {
//            System.out.println("enter an integer");
//            int number = input.nextInt();
//            if (number < 100) {
//                System.out.println("Won!");
//            } else {
//                System.out.println("Lost!");
//                break;
//
//            }
//        } while (true) ;

        /*
             Username is "admin", Password is "pwd123"
             Ask user to enter username and password
             User should see "Enter your username and password" message
             If user enters correct credentials he should get "You are in your account!" message
             Otherwise, he should see "Enter your username and password" message 3 times
             After 3 times he should get "Your account is blocked" message
        */

//
//        int counter=0;
//
//        do{
//            if (counter==3){
//                System.out.println("your account was blocked");
//                break;
//
//            }
//
//            System.out.println("Enter your username");
//            String userName=input.next();
//            System.out.println("Enter your password");
//            String pwd=input.next();
//
//            if (userName.equals("admin") && pwd.equals("pwd123")){
//                System.out.println("you are in your account");
//                break;
//            }else{
//                System.out.println("your username or password is wrong");
//            }
//
//            counter++;
//
//
//        }while (true);


                /*
                        Example 1:Type code to get the output like
                        1
                        12
                        123
                        1234
                        12345
                */


        int row=4;

        for (int i=1;i<=row;i++){

            for (int k=1;k<=i;k++){

                System.out.print(k+" ");
            }
            System.out.println();
        }








    }
    }