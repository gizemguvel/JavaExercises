package reviewExercises;

import java.util.Scanner;

public class Day03 {
    public static void main(String[] args) {
        //Example 1: Ask user to enter width and the length of a rectangle, then calculate
        //perimeter and the area of the rectangle.

        Scanner input= new Scanner(System.in);
        System.out.println("enter width");
        int width=input.nextInt();
        System.out.println("enter length");
        int length=input.nextInt();

        System.out.println("perimeter is: "+ 2*(width+length));
        System.out.println("area is: "+ width*length);

    /*
        Type a program which calculates the volume of a rectangular prism
        whose length, width, and height are entered by user.
        Hint 1: Volume of a rectangular prism is width x length x height
    */

        System.out.println("enter length,width,height");
        double l=input.nextDouble();

        double w=input.nextDouble();

        double h=input.nextDouble();




        System.out.println("volume of rectangular prism is "+ l*w*h);

        /*

        Type a program which calculates the area and the perimeter of a circle
        whose radius is entered by user. (Use float)
        Hint 1: Take pi number as 3.14159
        Hint 2: Area of a circle is 3.14159 x radius x radius
        Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
 */
        System.out.println("enter radius value");
        Double radius=input.nextDouble();
        double pi=3.14;
        double area=pi*radius*radius;
        double perimeter=2*pi*radius;
        System.out.println("area is: "+area+"\nperimeter is: "+perimeter);



        //Example 1: Ask user to enter his first and the last name and address then print them on the console.
        System.out.println("enter your address");
        String address=input.next();
        System.out.println("enter your first name");
        String first=input.next();
        System.out.println("enter your last name");
        String last=input.next();





    }
}
