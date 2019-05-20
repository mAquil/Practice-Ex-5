package main.java.com.stackroute.pe5;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Maintest {

        public ArrayList comparisionOfStudents(ArrayList student){
            StudentSorter stu = new StudentSorter();
            Collections.sort(student,stu);
            return student;
        }




}
