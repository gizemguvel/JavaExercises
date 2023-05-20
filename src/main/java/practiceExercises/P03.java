package practiceExercises;

public class P03 {
    public static void main(String[] args) {
        //Type a code that calculates the hypotenuse.
        //Formula of hypotenuse: a²+b²=c²
        int a=3;
        int b=4;
        double c=Math.sqrt(a*a+b*b);
        System.out.println("c = " + (int)c);


        // Write a Java program to break an integer into a sequence of individual digits.
        // Hint: use /(division operator) and %(modulus operator)
        // x: input: 12345  divide and give me the remainder
        //    output: 1
        //            2
        //            3
        //            4  10 and then %10
        //            5

        int x=12345;

        int ones=x%10;
        System.out.println("ones = " + ones);

        int tens=(x/10)%10;
        System.out.println("tens = " + tens);

        int hundreds=(x/100)%10;
        System.out.println("hundreds = " + hundreds);

        int thousands=(x/1000)%10;
        System.out.println("thousands = " + thousands);

        int tenThousands=(x/10000)%10;
        System.out.println("tenthousands = " + tenThousands);


    }
}
