package org.example.lesson12022024.task1.task2;

import org.example.lesson12022024.task1.ListOfStudents;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Student {
    private String name;
    private String surname;
    private int grade;

    public Student(String name, String surname, int grade) {
        this.name = name;
        this.surname = surname;
        if(grade <= 0 || grade > 5) {
           grade = 1;
        }
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade=" + grade +
                '}';
    }
}
  class Main {
      public static void main(String[] args) {
          List<Student> students = new ArrayList<>();
          students.add(new Student("Mark","Johnson",3));
          students.add(new Student("Eva","Brown",2));
          students.add(new Student("Tom","Vans",4));
          students.add(new Student("Rebeca","Stark",4));
          students.add(new Student("Steven","Klark",1));
          students.add(new Student("Ivan","Olic",1));
          students.add(new Student("Emre","Hosul",5));
          students.add(new Student("Lina","Jackson",3));
          students.add(new Student("Toni","Kadar",2));
          students.add(new Student("Nemanja","Orsic",3));
          students.add(new Student("Viktoria","Necid",5));

          System.out.println(distributeStudentsByGrades(students));
          countTotalAmount(distributeStudentsByGrades(students));
      }

      public static List<List<Student>> distributeStudentsByGrades(List<Student> students) {
          List<Integer> grades = new ArrayList<>();
          for (Student student : students) {
              if(!grades.contains(student.getGrade())) {
                  grades.add(student.getGrade());
              }
          }
          Collections.sort(grades);

          List<List<Student>> studentsGrades = new ArrayList<>();
          for (int i = 0; i < grades.size(); i++) {
              List<Student> studentsOfGrade = new ArrayList<>();
              for (int j = 0; j < students.size(); j++) {
                  if(grades.get(i) == students.get(j).getGrade()) {
                      studentsOfGrade.add(students.get(j));
                  }
              }
              studentsGrades.add(studentsOfGrade);
          }
          return studentsGrades;
      }

      private static void countTotalAmount(List<List<Student>> studentGradesList) {
          int studentsQuantity = 0;
          for (List<Student> students : studentGradesList) {
              studentsQuantity += students.size();
          }
          System.out.println("There are " + studentsQuantity + " students in the school");
      }


      //Task 3.
      //Имеется список студентов, распределенных по отдельным классам List<List<Student>> studentGrades
      //- Написать метод countTotalAmount(), который считает общее число студентов
      //- Написать метод countAmountWithName(), который считает количество студентов в школе с заданным именем name.
  }
