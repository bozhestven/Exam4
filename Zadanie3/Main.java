package Exam4.Zadanie3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Students> arrayList = new ArrayList();
        arrayList.add(new Students("Argen","Java",1,4.9));
        arrayList.add(new Students("Yasir","Java",1,5.0));
        arrayList.add(new Students("Sadyr","Python",3,3.2));
        arrayList.add(new Students("Putin","Front",2,1.7));
        arrayList.add(new Students("Argen","PHP",4,2.4));
        System.out.println("Студенты до изменений:");
        System.out.println(arrayList);
        System.out.println("После проверки:");
        Students.checkStudentList(arrayList);
        System.out.println(arrayList);
        System.out.println();
        Students.printStudents(arrayList, 1);
    }
}
