package reviewExercises;

public class Day05 {
    public static void main(String[] args) {
        //Example 1: Type code to check if the seventh character of a given String is "a"
        String str="Java is good, Ja2va is easy I lo?!ve55 Jav3a and money.";
        boolean seventh=str.charAt(6)=='a';
        System.out.println(seventh);
        boolean seventh1=str.startsWith("a",6);
        System.out.println("seventh1 = " + seventh1);


        //Example 2: Type code to check if a String is ending with "money" or not.
        boolean end=str.endsWith("money");
        System.out.println("end = " + end);
        boolean end1=str.substring(str.length()-5).equals("money");
        System.out.println("end1 = " + end1);

        //Example 3: Type code to convert "money" to “dollar".
        String strNEW=str.replace("money","dollar");
        System.out.println("strNEW = " + strNEW);

        //Example 4: Type code to convert "a" to "*".
        String str1=str.replace('a','*');
        System.out.println("str1 = " + str1);


        //Example 5: Type code to convert "Java" to "win".
        String str2=str.replace("Java","win");
        System.out.println("str2 = " + str2);

        //Example 1: Delete all "y"s from a given String.
        String strdelete=str.replace("y","");
        System.out.println("strdelete = " + strdelete);


        //Example 2: Delete all digits(0,1,2,3,4,5,6,7,8,9) from a given String
        String deleteDigits=str.replaceAll("[0-9]","");
        System.out.println("deleteDigits = " + deleteDigits);

        //Example 3: Delete all vowels from a given String
        String deleteVowels=str.replaceAll("[aeiouAEIOU]","");
        System.out.println("deleteVowels = " + deleteVowels);

        //Example 4: Count how many letters are there in a String
        int countLetter=str.replaceAll("[^a-zA-Z]","").length();
        System.out.println("countLetter = " + countLetter);


        //Example 5: Count how many digits are there in a String
        int digitCount=str.replaceAll("[^0-9]","").length();
        System.out.println("digitCount = " + digitCount);

        //Example 6: Check the user's password according to the given rules
        String password="Gizem_1206**";
        //i)Password should have at least 8 characters
        boolean numOfChar=password.length()>7;
        System.out.println("numOfChar = " + numOfChar);
        //ii)Password should not have "space" character
        boolean space=password.replaceAll("[^ ]","").length()==0;
        System.out.println("space = " + space);
        //iii)Password should have at least 1 upper case
        boolean upper=password.replaceAll("[^A-Z]","").length()>0;
        System.out.println("upper = " + upper);
        //iv)Password should have at least 1 lower case
        boolean lower=password.replaceAll("[^a-z]","").length()>0;
        System.out.println("lower = " + lower);
        //v)Password should have at least 1 symbol
        boolean symbol=password.replaceAll("[^a-zA-Z0-9]","").length()>0;
        System.out.println("symbol = " + symbol);
        //vi)Password should have at least 1 digit
        boolean digit=password.replaceAll("[^0-9]","").length()>0;
        System.out.println("digit = " + digit);


    }
}
