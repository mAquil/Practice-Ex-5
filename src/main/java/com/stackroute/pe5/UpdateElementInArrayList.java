/* 1. Write a Java program to update specific array element by given element and empty the array list.
Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]
Array list after removing all elements [] */

package main.java.com.stackroute.pe5;

import java.util.ArrayList;

public class UpdateElementInArrayList {
    public ArrayList<String> UpdateAndEmpty(ArrayList<String> arr, String str1, String str2) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {  //print original list
            list.add(arr.get(i));
        }
        list.set(0, str1);  //setting the name to the new one
        list.set(2, str2);  //settinhg the second name
        System.out.println(list);
        arr.removeAll(arr);  //the list made empty by clearing all the elements
        return arr;

    }
}


