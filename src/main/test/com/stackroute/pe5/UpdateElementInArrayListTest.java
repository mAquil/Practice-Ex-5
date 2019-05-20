package main.test.com.stackroute.pe5;

import main.java.com.stackroute.pe5.UpdateElementInArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class UpdateElementInArrayListTest {

    UpdateElementInArrayList obj;
    @Before
    public void setup(){
        obj=new UpdateElementInArrayList();
    }

    @After
    public void tearDown(){
        obj=null;
    }
    @Test
    public void UpdateAndEmpty_ChangeListItem_ShouldReturnEmptyArray(){

        ArrayList<String> array = new ArrayList<String>();
        array.add("Apple");
        array.add("Grape");
        array.add("Melon");
        array.add("Berry");
        String replace1="Kiwi";
        String replace2="Mango";
        ArrayList<String> result=new ArrayList<String>();
        result=obj.UpdateAndEmpty(array,replace1,replace2);
        ArrayList<String> expected=new ArrayList<>();
        assertEquals(expected, result);
        System.out.println(result);
    }

}



