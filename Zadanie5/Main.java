package Exam4.Zadanie5;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet();

        treeSet.add(new Student("Aysa", 8));
        treeSet.add(new Student("Abdul", 3));
        treeSet.add(new Student("Yasir", 5));
        treeSet.add(new Student("Beka", 4));
        treeSet.add(new Student("Akram", 2));

        Iterator var2 = treeSet.iterator();
        while(var2.hasNext()) {
            Student student = (Student)var2.next();
            System.out.println(student);
        }

    }
}
