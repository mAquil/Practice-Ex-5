/*
Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
Modify and return the given map as follows:
a. If the key `val1` has a value, set the key `val2` to have that value, and
b. Set the key `val1` to have the value `" "` (empty string).
Example 1: The map {"val1": "java", "val2": "c++"} should return {"val1": " ", "val2": "java"}
Example 2: The map {"val1": "mars", "val2": "saturn"} should return {"val1": " ", "val2": "mars"}
 */

package main.java.com.stackroute.pe5;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapKeyValuePair {

    public Map mapValueModify(Map value)
    {
        Set set = value.keySet();

        Object[] objects = new Object[2];
        int i=0;


        Iterator itr = set.iterator();
        while (itr.hasNext()){
            objects[i]=itr.next();
            i++;
        }

        Object newValue = value.get(objects[0]);
        value.put(objects[0],"");  //putting "" in place of value one
        value.put(objects[1],newValue);


        return value;

    }
}
