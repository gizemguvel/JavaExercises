package reviewExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day15 {
    public static void main(String[] args) {
        //Example 1: Create a String list, add 5 elements into the list, remove a specific element
        List<String> country=new ArrayList<>();
        country.add("Turkey");
        country.add("UK");
        country.add("USA");
        country.add("Germany");
        country.add("France");
        System.out.println("country = " + country);
        country.remove("Germany");
        System.out.println("country = " + country);
        country.remove(1);
        System.out.println("country = " + country);

        //Example 2: Create an Integer List, add 6 elements into it, remove a specific element
        ArrayList<Integer> ages= new ArrayList<>();
        ages.add(13);
        ages.add(15);
        ages.add(89);
        ages.add(5);
        ages.add(98);
        ages.add(10);
        ages.remove((Integer) 5);
        System.out.println("ages = " + ages);

        //Example 3: Create a String list, add 5 elements into it, remove the elements whose length is less than 6
        List<String> countries=new ArrayList<>();
        countries.add("Turkey");
        countries.add("UK");
        countries.add("USA");
        countries.add("Germany");
        countries.add("France");

//        for(int i=0;i<countries.size();i++) {
//            if (countries.get(i).length() < 6) {
//                countries.remove(i);
//                i--;
//            }
//        }
        System.out.println("countries = " + countries);

        List<String> clonedCountries=new ArrayList<>(countries);
        System.out.println("clonedCountries = " + clonedCountries);


        for (String w:clonedCountries){
            if(w.length()<6){
                countries.remove(w);
            }
        }System.out.println("countries = " + countries);

    }
}
