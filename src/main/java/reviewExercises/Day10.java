package reviewExercises;

public class Day10 {
    public static void main(String[] args) {

        //Example 1: Type code to calculate the multiplication of integers from 3 to 6

        int multiplication=1;
        for (int i = 3; i <7 ; i++) {
            multiplication*=i;
        }
        System.out.print(multiplication);

        System.out.println();

        //Example 2: Type code to find the sum of the digits in a given integer
        int number=345;
        int sum1=0;
        for (int i = number; i >0 ; i=i/10) {

            sum1=sum1+i%10;
        }
        System.out.print(sum1);
        System.out.println();
        //Example 3: Type code to check if a String is "palindrome" or not

        String p="nazan";

        String reverse="";
        for (int i = p.length()-1; i>=0; i--) {
            char pchar=p.charAt(i);
            reverse=reverse+pchar;

        }
        System.out.println();
        boolean palindrome = p.equals(reverse);
        System.out.println(palindrome);

        //Example 1: Type code to find the sum of the unique digits in an integer

        String num="1123245";
        int sumUnique=0;
        for (int i = 0; i <num.length() ; i++) {

            String digit=num.substring(i,i+1);

            if(num.indexOf(digit)==num.lastIndexOf(digit)){
                sumUnique+=Integer.valueOf(digit);
            }
        }
        System.out.println(sumUnique);
    }
}
