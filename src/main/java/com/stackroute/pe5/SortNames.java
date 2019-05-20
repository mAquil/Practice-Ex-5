package main.java.com.stackroute.pe5;

import java.util.*;

public class SortNames {
    public List<String> sortingOfNames(String str){
        System.out.println("Input: "+str);
        System.out.println("Output: ");
        System.out.print("Sorted Set: ");

        String[] array=str.split(" "); //splitting each word
        Set<String> treeset=new TreeSet<String>();
        treeset.addAll(Arrays.asList(array));  //adding names to treeset for sorting

        Iterator<String> itr= treeset.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()); //printing of sorted names
            System.out.print(" ");
        }
        System.out.println(" ");

        List<String> list=new ArrayList<String>(treeset.size()); // added sorted names to arraylist
        for (String x:treeset){
            list.add(x);
        }
        return list;
    }

}
