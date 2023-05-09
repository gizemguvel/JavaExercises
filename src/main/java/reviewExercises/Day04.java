package reviewExercises;

import java.util.Scanner;

public class Day04 {
    public static void main(String[] args) {
       /* //Example1: Type code to swap two integers.
        //          a=12 and b=5  ==> a=5 and b=12
        //1.Way:By using a third variable.
        //2.Way: do not create a 3rd variable.

        int a=3;
        int b=5;
        //1.Way:By using a third variable.
        int temp;
        temp=b;
        b=a;
        a=temp;
        System.out.println("a= "+a+"\nb= "+b);

        //2.Way: do not create a 3rd variable.

        int x=3;
        int y=5;
        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("x= "+x+"\ny= "+y);

        //Example 1: Get the initial of a name which contains first name and last name.
        String name="Gizem Guvel";
        char f=name.charAt(0);
        char l=name.split(" ")[1].charAt(0);
        System.out.println(f+""+l);


        //Example 1: Get the full name of the user and make all characters in uppercase.
        Scanner input=new Scanner(System.in);
        System.out.println("enter your name");
        String fullName=input.nextLine().toUpperCase();
        System.out.println(fullName);

        /*Example 2:Get the full name of the user, make all characters in uppercases and remove spaces
                    from the beginning and from the end.*/
        Scanner input=new Scanner(System.in);
        System.out.println("enter a sentence");

        /*System.out.println("type your full name");
        String fName=input.nextLine().toUpperCase().trim();
        System.out.println(fName);*/

        //Example 3: Get a String from the user, then count the number of the characters in the
        //String.
        //int numOfChars=input.nextLine().length();
        //System.out.println(numOfChars);


        //Example 1: Get the first 4 characters from String and convert them to lowercases.
        String str="I WILL be a good tester.";
        String updated=str.substring(0,4).toLowerCase();
        System.out.println(updated);


        //Example 2: Check if two Strings are same or not.
        String str1="i will be a good tester.";
        boolean result=str.equalsIgnoreCase(str1);
        System.out.println("result = " + result);

        //Example 1: Check the password if it has given rules.
        //i)It should start with "J"
        //ii)It should have at least 8 characters
        //iii)Last 3 characters should be "AVA"

        String pwd="J123!5AVAx";
        boolean j = pwd.startsWith("J");
        System.out.println("j = " + j);
        boolean l=pwd.length()>7;
        System.out.println("l = " + l);
        boolean end=pwd.endsWith("AVA");
        System.out.println("end = " + end);

        boolean i= pwd.substring(pwd.length()-3).equals("AVA");
        System.out.println("i = " + i);


    }
}
