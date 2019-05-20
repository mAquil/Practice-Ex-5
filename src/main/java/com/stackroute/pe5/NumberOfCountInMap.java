/* Write a program to find the number of counts in the following String. Store the output in
Map<String,Integer> as key value pair.
Input : String str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2} */

package main.java.com.stackroute.pe5;

import java.util.*;

public class NumberOfCountInMap {
    public HashMap CountNumberOfString(String str){

        String[] ar=str.split("[^a-zA-Z]+");   // extracting words from the input
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(ar));  //arraylist of size equal to no. of words

        HashMap<String,Integer> hash=new HashMap<>();
        Set keys = new HashSet<>();
        ArrayList list = new ArrayList();

        keys.addAll(arrayList); //words added to hashset

        list.addAll(keys);

        int[] count = new int[keys.size()];
        int i=0;

        Iterator itr = keys.iterator();
        while (itr.hasNext()){
            count[i]=Collections.frequency(arrayList,itr.next());  //the repetition of words of is calculated and stored
            i++;
        }
        for(int j=0;j<list.size();j++){
            hash.put((String) list.get(j),count[j]); //hashmap is input with the words and it's count
        }
        return hash;

    }





}
