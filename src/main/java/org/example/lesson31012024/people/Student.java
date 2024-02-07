package org.example.lesson31012024.people;

import org.example.lesson31012024.Subjects;
import org.example.lesson31012024.people.Person;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    public List<Subjects> subjects = new ArrayList<>();

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "subjects=" + subjects +
                '}';
    }
}
