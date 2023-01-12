package Exam4.Zadanie3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Students {
    private String name;
    private String group;
    private int kurs;
    private double subjectgrades;

    public Students(String name, String group, int kurs, double subjectgrades) {
        this.name = name;
        this.group = group;
        this.kurs = kurs;
        this.subjectgrades = subjectgrades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public double getSubjectgrades() {
        return subjectgrades;
    }

    public void setSubjectgrades(double subjectgrades) {
        this.subjectgrades = subjectgrades;
    }
    public static void checkStudentList(ArrayList<Students> list) {
        for(int i = 0; i < list.size(); ++i) {
            if (((Students)list.get(i)).getSubjectgrades() < 3.0) {
                list.remove(i);
            } else {
                ((Students)list.get(i)).setKurs(((Students)list.get(i)).getKurs() + 1);
            }
        }


    }

    @Override
    public String toString() {
        return "Студенты " +
                "Имя = " + name + " " +
                ", Группа = " + group + " " +
                ", Курс = " + kurs +
                ", Оценка = " + subjectgrades +
                '}';
    }

    public static void printStudents(List<Students> students1, int kurs) {
        System.out.println("Студенты с " + kurs + " курса:");
        Iterator var2 = students1.iterator();
        while(var2.hasNext()) {
            Students students = (Students) var2.next();
            if (students.getKurs() == kurs) {
                System.out.println(students);
            }
        }




    }
}
