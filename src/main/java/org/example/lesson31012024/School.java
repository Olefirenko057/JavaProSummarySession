package org.example.lesson31012024;

import org.example.lesson31012024.people.Student;
import org.example.lesson31012024.people.Teacher;

public class School {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Ivan",29,Subjects.MATH);
        Student student1 = new Student("Ihor",17);
        teacher1.teach(student1);
    }
}
