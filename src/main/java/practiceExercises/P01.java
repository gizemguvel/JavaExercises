package practiceExercises;

public class P01 {
    public static void main(String[] args) {
        //Initialize variable
        int a=12;

        //Print variables with label
        System.out.println("a = " + a);
        //Copy the variable's value
        int b=a;
        System.out.println("b = " + b);
        //Declare multiple variables in the same line
        int c=1, d=2;
        System.out.println("c = " + c);
        //Update a variable
        c=3;
        System.out.println("c = " + c);
        //Declare a variable: x
        int x;

        //Initialize another variable:y
        int y=34;
        //Initialize variable z;
        int z=18;
        //Initialize x by using z;
        x=z;
        System.out.println("x = " + x);
        //Update the variables
        x=0;
        y=3;
        z=45;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

    }
}
