package main.test.com.stackroute.pe5;

import main.java.com.stackroute.pe5.MapKeyValuePair;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MapKeyValuePairTest {
        MapKeyValuePair obj;

        @Before
        public void setUp(){
            obj= new MapKeyValuePair();
        }

        @After
        public void tearDown(){
            obj=null;
        }


        @Test
        public void mapValueModify() {
        Map value=new LinkedHashMap();
        value.put("val1","Java");
        value.put("val2","C++");

        Map modify=new LinkedHashMap();
        modify.put("val1","");
        modify.put("val2","Java");

        assertEquals(modify,obj.mapValueModify(value));

        value.clear();
        modify.clear();

        value.put("val1","Java");
        value.put("val2","C++");


        modify.put("1","");
        modify.put("2","Java");

        assertNotEquals(modify,obj.mapValueModify(value));


    }
}
