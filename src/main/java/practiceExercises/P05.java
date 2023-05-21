package practiceExercises;

public class P05 {
    public static void main(String[] args) {
         /*
        Create a String variable and find the sum of ASCII values of the first and the last characters of the String.
        String s= "Miami";
         */

        String s="I will move to London";
        char first=s.charAt(0);
        char last=s.charAt(s.length()-1);
        int sum=first+last;
        System.out.println(sum);


        //1.Task: Count the alphabetical characters in a given value.
        String s2="I will move to London in 2023.!";
        int numOfLetters=s2.replaceAll("[^a-zA-Z]","").length();
        System.out.println("numOfLetters = " + numOfLetters);


        //Example 1: Type code to select the minimum one of two integers
        int a=5;
        int b=12;

       int result = a < b ? a : b;
        System.out.println("result = " + result);

        //Example 2: Type code to calculate absolute value of an integer
        int c=-7;
        int r2= c<0 ? c*-1 : c;
        System.out.println("r2 = " + r2);

        if(c<0){
            System.out.println(Math.abs(c));
        }else System.out.println(c);

        //Example 3: If two integers are positive return the multiplication
        //           Otherwise, give a message like "I do not how to multiply"
        int x=99;
        int y=-10;

        Object result1=x>0 && y>0 ? x*y : "I don't know how to multiply";
        System.out.println("result1 = " + result1);

        //Example 4: Type a code to check if a number is positive or not
       String s3= y>0 ? "positive":"negative";
        System.out.println("s3 = " + s3);

        //Example: Type code to check if an integer has 3 digits or not
        String result2=x<1000 && x>99 ? "3 digits":"not 3 digits";
        System.out.println("result2 = " + result2);

    }
}
