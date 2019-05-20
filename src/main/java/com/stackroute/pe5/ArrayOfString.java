/* Write a program where an array of strings is input and output is a Map<String,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array
Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false} */

package main.java.com.stackroute.pe5;

import java.util.*;

public class ArrayOfString {
    public HashMap<String,Boolean> differentStringMap(String[] str){
        int size=str.length;
        Set<String> keys=new HashSet<>(); //taking a hashset
        keys.addAll(Arrays.asList(str)); //adding strings to it

        ArrayList<String> arraylist=new ArrayList<String>(Arrays.asList(str));

        ArrayList<String> array=new ArrayList<>(keys);  //adding hashset elements to arraylist

        HashMap<String,Boolean> hash=new HashMap<>(); //declaring a hashmap

        int[] count=new int[keys.size()];
        Iterator itr=keys.iterator();
        int i=0;
        while (itr.hasNext()){
            count[i]=Collections.frequency(arraylist,itr.next());  //counting the occurrence of each string
            i++;
        }

        boolean temp;
        for (int j=0;j<array.size();j++){  //putting each value in hashmap
            if (count[j]>1)
                temp=true;
            else {
                temp = false;
            }
            hash.put((String) array.get(j), temp);
        }
        System.out.println(hash);
        return hash;
    }
}
