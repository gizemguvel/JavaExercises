package reviewExercises;

public class Day09 {
    public static void main(String[] args) {

//Example 1: Type "Hi" for 5 times on the console

        for (int i = 1; i <=5 ; i++) {
            System.out.println("Hi");
        }

//Example 2: Type all integers from 11 to 44 "in the same line" with a space between consecutive integers

        for (int i = 11; i <45 ; i++) {
            System.out.print(i+" ");
        }

        System.out.println();
//Example 3: Type even integers from 11 to 44 in the same line with a space between consecutive integers

        for (int i = 11; i <45 ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

//Example 4: Type "odd integers" from 68 to 13 in the same line with a space between consecutive integers

        for (int i = 68; i >12 ; i--) {
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }

        System.out.println();
//Example 5: Type code to print the letters from 'c' to 'u'

        for (int i = 'c'; i <='u' ; i++) {
            System.out.print((char)i+" ");
        }
        System.out.println();
//Example 6: Type code to print integers from 0 to 100 without using any number
        System.out.println((char)101);
        for (int i = 'a'-'a'; i <'e' ; i++) {
            System.out.print(i+" ");
        }

















    }
}
