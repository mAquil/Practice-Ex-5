package main.test.com.stackroute.pe5;

import java.util.*;
import main.java.com.stackroute.pe5.NumberOfCountInMap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;

public class NumberOfCountInMapTest {
    NumberOfCountInMap obj;

    @Before
    public void setup(){
        obj=new NumberOfCountInMap();
    }

    @After
    public void tearDown(){
        obj=null;
    }

    @Test
    public void CountNumberOfStringTest_InputString_ShouldReturnHashmap() {
        String str="one one -one___two,,three,one @three*one?two";
        HashMap<String,Integer> expected = new HashMap<>();
        expected.put("one",5);
        expected.put("two",2);
        expected.put("three",2);
        System.out.println(expected);

        assertEquals(expected,obj.CountNumberOfString(str));

    }


}



