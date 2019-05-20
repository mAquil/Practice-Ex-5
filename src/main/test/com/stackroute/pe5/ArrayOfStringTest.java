package main.test.com.stackroute.pe5;

import main.java.com.stackroute.pe5.ArrayOfString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class ArrayOfStringTest {
    ArrayOfString obj;

    @Before
    public void setUp(){
        obj=new ArrayOfString();

    }
    @After
    public void tearDown(){
        obj=null;
    }

    @Test
    public void differentStringMapTest_checkForDifferentString_returnHashmap(){
        String[] str=new String[] {"a","b","c","d","a","c","c"};
        System.out.print("Input: " +str);
        HashMap<String, Boolean> expected=new HashMap<>();
        expected.put("a",true);
        expected.put("b",false);
        expected.put("c",true);
        expected.put("d",false);
        assertEquals(expected, obj.differentStringMap(str));
        System.out.println("Output: " +expected);


    }
}
