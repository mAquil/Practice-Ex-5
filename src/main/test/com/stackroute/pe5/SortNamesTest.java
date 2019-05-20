package main.test.com.stackroute.pe5;

import main.java.com.stackroute.pe5.SortNames;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SortNamesTest {
    SortNames obj;

    @Before
    public void setUp(){
        obj=new SortNames();
    }

    @After
    public void tearDown(){
        obj=null;
    }

    @Test
    public void sortingOfNames_sortNames_ShouldReturnHashmap(){
        String str="Harry Olive Alice Bluto Eugene";
        List<String> actual=new ArrayList<String>();
        actual=obj.sortingOfNames(str);
        List<String> expected=new ArrayList<String>(5);
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");
        assertEquals(expected,actual);
        System.out.print("Array list from set: ");
        Iterator<String> itr=actual.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next());
            System.out.print(" ");
        }
    }
}
