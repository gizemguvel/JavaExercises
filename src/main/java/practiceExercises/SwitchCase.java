package practiceExercises;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

//    Question 1:
//    Write a Java program using a switch case that takes a number as input and prints whether it is a weekday or a weekend day.
//    Assume that Monday is represented by 1 and Sunday by 7.
        Scanner input=new Scanner(System.in);
        System.out.println("enter a day number");
        byte dayNum=input.nextByte();

        switch (dayNum) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
            default:
                System.out.println("enter a valid day number");
        }

//    Question 2:
//    Write a Java program using a switch case that takes a character as input and determines whether it is a vowel or a consonant.
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
                System.out.println("consonant");
        }

//    Question 3:
//    Write a Java program using a switch case that takes a month number (1-12) as input and prints the corresponding month name.
        System.out.println("enter a month number");
        byte monthNum=input.nextByte();
        switch (monthNum){
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
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("enter valid month number");
        }


//    Question 4:
//    Write a Java program using a switch case that takes a grade (A, B, C, D, or F) as input and prints the corresponding description
//    (Excellent, Good, Average, Below Average, or Fail).
        System.out.println("enter a grade");
        char grade=input.next().charAt(0);
        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;
        }

//    Question 5:
//    Write a Java program using a switch case that takes a shape name ("circle", "rectangle", "triangle") as input
//    and calculates the area of the corresponding shape based on additional input parameters.

        System.out.println("enter a shape name");
        String shape=input.next();

        switch (shape){
            case "circle":
                System.out.println("enter radius");
                double radius=input.nextDouble();
                System.out.println( "area of the circle: "+Math.PI*radius*radius);
                break;
            case "rectangle":
                System.out.println("enter length");
                double length=input.nextDouble();
                System.out.println("enter width");
                double width=input.nextDouble();
                System.out.println("area of rectangle: "+length*width);
                break;
            case "triangle":
                System.out.println("enter height");
                double height=input.nextDouble();
                System.out.println("enter base");
                double base=input.nextDouble();
                System.out.println("area of triangle: "+(base*height)/2);
                break;
        }
    }
}
