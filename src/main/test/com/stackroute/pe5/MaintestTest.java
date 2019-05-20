package main.test.com.stackroute.pe5;

import main.java.com.stackroute.pe5.Maintest;
import main.java.com.stackroute.pe5.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class MaintestTest {
    Maintest obj = new Maintest();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void comparisionOfStudents_() {

        Student s1 = new Student(500001,"Maria",23);
        Student s2= new Student(500002, "Rohit", 35 );
        Student s3= new Student(500003, "Gayatri", 21 );
        Student s4= new Student(500004, "Priya", 21 );
        Student s5= new Student(500005, "Ankit", 26 );

        ArrayList array=new ArrayList();
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        array.add(s5);



        String expected="[Student{id=500002, name='Rohit', age=35}, Student{id=500005, name='Ankit', age=26}, Student{id=500001, name='Maria', age=23}, Student{id=500004, name='Priya', age=21}, Student{id=500003, name='Gayatri', age=21}]";




        assertEquals(expected,obj.comparisionOfStudents(array).toString() );

    }
}
