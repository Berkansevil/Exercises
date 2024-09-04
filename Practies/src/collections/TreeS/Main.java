package collections.TreeS;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students=new TreeSet<>();
        students.add(new Student("berkan",80));
        students.add(new Student("ahmet",50));
        students.add(new Student("selim",10));

       for (Student student : students){
           System.out.println(student.getNote());
       }
    }
}
