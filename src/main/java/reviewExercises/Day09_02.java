package reviewExercises;

public class Day09_02 {
    public static void main(String[] args) {
        //Example 1: Put * between 2 consecutive characters and to the end in a String.
        String str="Java, Java I love Java";

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            System.out.print(ch + "*");
        }
        System.out.println();
        //Type code to print unique characters in a string
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(str.indexOf(c)==str.lastIndexOf(c)){
                System.out.print(c);
            }
        }
        System.out.println();

        //Example 3: Type code to print a string in reverse

        String name="Gizem";

        for (int i=name.length()-1;i>=0;i--){
            char r=name.charAt(i);
            System.out.print(r);
        }
        System.out.println();
        //Example 4: Type code to find the sum of integers from 3 to 7
        int sum=0;
        for (int i = 3; i <8 ; i++) {
            sum+=i;

        }System.out.print(sum);
        System.out.println();


    }
}
