package reviewExercises;

public class Day07 {
    public static void main(String[] args) {
        //Example 1: Type code to check if a given character is upper case or lower case or others


        char ch='A';
        if(ch>='a' && ch<='z'){
            System.out.println("lowercase");
        } else if (ch>='A' && ch<='Z') {
            System.out.println("uppercase");
        }else {
            System.out.println("letter not defined");
        }

        //Example 2: If a number is less than 300 or greater than 3000
        //           print "perfect number" on the console, otherwise
        //           print "regular number"
        int num=550;
        if(num<300 || num>3000){
            System.out.println("perfect number");
        }else{
            System.out.println("regular number");}

        //Example 3: Type code to check if a number is "Even" or "Odd"

        int number=513;
        if(number%2==0){
            System.out.println("even"+number);
        }else{
            System.out.println("odd"+number);}

        String result=number%2==0?"even":"odd";
        System.out.println("result = " + result);

        //Example 4: Type code to print the number of month for the given month name

        String month="July";
        if(month.equalsIgnoreCase("January")){
            System.out.println(1);
        } else if (month.equalsIgnoreCase("February")){
            System.out.println(2);
        } else if (month.equalsIgnoreCase("March")){
            System.out.println(3);

        }else if (month.equalsIgnoreCase("April")) {
            System.out.println(4);
        }else if (month.equalsIgnoreCase("May")){
                System.out.println(5);}
        else if (month.equalsIgnoreCase("June")) {
            System.out.println(6);
        }else {
            System.out.println("invalid");
        }

    }
}

