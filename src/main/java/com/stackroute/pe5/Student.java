/* Create a Student class that represents the following information of a student: id, name, and age
all the member variables should be private .
a. Implement `getter and setter` .
b. Create a `StudentSorter` class that implements `Comparator interface` .
c. Write a class `Maintest` create Student class object(minimum 5)
d. Add these student object into a List of type Student .
e. Sort the list based on their age in decreasing order, for student having
same age, sort based on their name.
f. For students having same name and age, sort them according to their ID. */

package main.java.com.stackroute.pe5;

public class Student {
    private long id;
    private String name;
    private int age;

    public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {  //getter
        return name;
    }

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) { //setter
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setId(long newId) {
        this.id = newId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
