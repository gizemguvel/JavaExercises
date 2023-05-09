package reviewExercises;

public class Day06 {
    public static void main(String[] args) {
    //Example 1: If a number is positive, print positive on the console
        int a=0;
        if(a>0){
            System.out.println("positive");
        } else if (a<0) {
            System.out.println("negative");

        }else {
            System.out.println("undefined");
        }

        //Example 2: Type code that prints day names for the given day numbers
        int dayNum=3;

        if(dayNum==1){
            System.out.println("monday");
        } else if (dayNum==2) {
            System.out.println("tuesday");

        } else if (dayNum==3) {
            System.out.println("wednesday");
        }else if (dayNum==4) {
            System.out.println("thursday");}
        else if (dayNum==5) {
            System.out.println("friday");
        } else if (dayNum==6) {
            System.out.println("saturday");
        }else if (dayNum==7){
            System.out.println("sunday");
        }else {
            System.out.println("undefined");
        }

        //Example 1: Type code to find the index of the first occurrence of 'a' in a given String

        String str="Java is easy,learn Java earn moneym";

        int idxFirst=str.indexOf('a');
        System.out.println("idxFirst = " + idxFirst);


        //Example 2: Type code to find the index of the first occurrence of 'java' in a given String
        //           "java is easy to learn, java is common in the market, java is OOP"

        int idxJava=str.toLowerCase().indexOf("java");
        System.out.println("idxJava = " + idxJava);


        //Example 3: Type code to find the index of the last occurrence of 'm' in a given String
        int last=str.lastIndexOf('m');
        System.out.println("last = " + last);


        //Example 4: Type code to find the index of the last occurrence of 'earn' in a given String
        int lastEarn=str.lastIndexOf("earn");
        System.out.println("lastEarn = " + lastEarn);


        //Example 5:Type code to check if a given character is unique or not in a given String
        boolean result=str.indexOf("a")==str.lastIndexOf("a");
        System.out.println("result = " + result);


        //Example 1: Type code to check if a given String is empty or not
        String b="";

        boolean r=b.length()==0;
        System.out.println("r = " + r);

        //Example 2: Type code to check if a given String is containing just space character or not
        String c=" aa";
        boolean r1 = c.replaceAll("[ ]", "").length() == 0;
        System.out.println("r1 = " + r1);
        boolean r2=c.isBlank();
        System.out.println("r2 = " + r2);
        //Example 3: Type code to join multiple Strings
        String concat=c.concat(c).concat(c);
        System.out.println("concat = " + concat);

        //Example 1: Type code to check if given String contains a specific character or characters
        String str1="How are you? where are you?";
        boolean contain=str1.contains("e");
        System.out.println("contain = " + contain);

        //Example 2: Type code to change the first occurrence of "are" to "python"
        //           java is java, i like java ==> python is java, i like java

        System.out.println(str1.replaceFirst("are","python"));

        //Example 3: Type code to repeat a given String
        System.out.println( str1.repeat(5));




    }}

