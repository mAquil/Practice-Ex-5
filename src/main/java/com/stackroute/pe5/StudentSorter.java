package main.java.com.stackroute.pe5;

import java.util.Comparator;

public class StudentSorter implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {

        if (((Student) (obj1)).getAge() > ((Student) (obj2)).getAge()) {
            return -1;
        }
        else if (((Student) (obj1)).getAge() == ((Student) (obj2)).getAge())
        {
            if ((((Student) (obj1)).getName().compareTo(((Student) (obj2)).getName()) > 0)) {
                return -1;
            }
            else if((((Student) (obj1)).getName().equals(((Student) (obj2)).getName()))) {
                if(((Student) (obj1)).getId() > ((Student) (obj2)).getId())
                {
                    return -1;
                }
                else {
                    return 1;
                }
            }
            else {
                return 1;
            }
        }
        else
        {
            return 1;
        }

    }
}
