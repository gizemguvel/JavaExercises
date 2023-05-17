package reviewExercises;

public class Day17_02 {


    public static void main(String[] args) {
        //Example 1: Create a method adds two integers
        System.out.println(addTwoInts(3,5));

        //Example 2: Create a method prints the first and the last character of a String on the console
        System.out.println(printFirstLastChar("Gizem"));

        //Example 3: Create a method prints the sum of the ASCII values of characters in a String
        System.out.println(sumOfAsciiValuesOfCharsInString("Gizem"));

        System.out.println("multiply(3,3) = " + multiply(3, 3));
    }



    //Example 1: Create a method adds two integers
    public static int addTwoInts(int x, int y){

        return x+y;
    }


    //Example 2: Create a method prints the first and the last character of a String on the console

    public static String printFirstLastChar(String a){
        return a.charAt(0)+" "+a.charAt(a.length()-1);
    }

    //Example 3: Create a method prints the sum of the ASCII values of characters in a String
    public static int sumOfAsciiValuesOfCharsInString(String a){
        int sum=0;
        for (int i=0;i<a.length();i++){
            sum=sum+a.charAt(i);
        }return sum;
    }

    //Create a method that multiplies two integers
    public static int multiply(int a, int b){
        return a*b;
    }
    //Create a method that multiplies one double and one integer
    public static double multiply(double a, int b){
        return  a*b;
    }
    //Create a method that multiplies one integer and one double
    public static double multiply(int a,double b){
        return a*b;
    }
    //Create a method that multiplies three integers
    public static int multiply(int a,int b,int c){
        return a*b*c;
    }



}
