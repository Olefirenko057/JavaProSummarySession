package org.example.lesson31012024.people;

import org.example.lesson31012024.Subjects;
import org.example.lesson31012024.people.Person;
import org.example.lesson31012024.people.Student;

public class Teacher extends Person {
    private Subjects subject;

    public Teacher(String name, int age,Subjects subject) {
        super(name, age);
        this.subject = subject;
    }

    public void teach(Student student) {
        System.out.println(getName() + " is teaching " + student.getName() + " " + subject);
        System.out.println(student.getName() + " before studying " + student);
        student.subjects.add(subject);
        System.out.println(student.getName() + " after studying " + student);
    }
}
