package reviewExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day14_01 {
    public static void main(String[] args) {

        //How to create an ArrayList
        ArrayList<String> arrayList= new ArrayList<>();

        //How to add elements into an ArrayList
        arrayList.add("Ali");
        arrayList.add("Veli");
        arrayList.add("Ayse");
        arrayList.add("Can");
        System.out.println(arrayList);

        //How to remove all elements from a list
        //arrayList.clear();
        System.out.println("arrayList = " + arrayList);

        //How to check if a specific element exists in a list
        boolean result=arrayList.contains("Ali");
        System.out.println("result = " + result);

        for (String w:arrayList){
            if(w.equals("Ali")){
                System.out.println("exists");
            }else {
                System.out.println("doesn't exist");
            }
            break;
        }

        //Example 1: Type code to check if two lists have same elements
        List<String> list= new ArrayList<>();
        list.add("Ayse");
        list.add("Can");
        list.add("Ali");
        list.add("Veli");
        System.out.println("list = " + list);
        Collections.sort(list);
        Collections.sort(arrayList);

        boolean r=list.equals(arrayList);
        System.out.println("r = " + r);
    }
}
