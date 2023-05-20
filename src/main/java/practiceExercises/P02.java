package practiceExercises;

public class P02 {
    public static void main(String[] args) {
        /*
        Type code to print first name, last name, age, height and weight then print them on console in this way:
        First Name: ...
        Last Name: ...
        Age: ...
        Height: ...
        Weight: ...
        Note: Use containers for each element and only one "System.out.println();"
                */

        String firstName="Gizem";
        String lastName="Guvel";
        int age=32;
        double height=1.73;
        int weight=55;
        System.out.println("First Name: "+firstName+"\nLast Name: "+lastName+"\nAge: "+age+"\nHeight: "+height+"\nWeight: "+weight);


          /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;

       Calculate the average of these numbers.
     */
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;

        double sum=num1+num2+num3+num4+num5;
        double average=sum/5;
        System.out.println("average = " + average);



    }
}
