package reviewExercises;

public class Day11_02 {
    public static void main(String[] args) {

        //Example 1: Type code to print integers from 4 to 7 on the console
        int i=4;

        while(i<8){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        //Example 2: Type code to print odd integers from 12 to 67 in the same line with a space between them
        int m=12;

        while (m<68){
            if(m%2!=0){
                System.out.print(m+" ");
            }m++;
        }
        System.out.println();
        //Example 3: Type code to find the sum of integers from 12 to 67

        int n=12;
        int sum=0;
        while (n<68){
            sum+=n;
            n++;
        }System.out.println(sum);







    }
}
