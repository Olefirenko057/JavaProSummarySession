package org.example.lesson12022024.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfStudents {
    //Task 1. Имеется заданный список имен студентов:
    //List<String> names = Arrays.asList("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, "");
    //
    //a) Напечатать список имен студентов со словом student в начале
    //b) Написать метод findNameStartingWith(), который бы возвращал список имен, начинающихся на определенную букву
    //c) Написать метод printNamesLongerThan(), который находил бы имена, в которых количество букв больше n и печатал их в CAPSLOCK

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, "");
        printStudents(names);
        System.out.println(findNameStartingWith(names,'t'));
        printNamesLongerThan(names,3);
    }


    public static void printStudents(List<String> strings) {
        for (String name : strings) {
            if(name != null && !name.isEmpty()) {
                System.out.println("student " + name);
            }
        }
    }
   public static List<String> findNameStartingWith(List<String> strings, char firstLetter) {
        List<String> namesStartingWithNeededLetter = new ArrayList<>();
        for (String name : strings) {
            if(name != null && !name.isEmpty() && (name.charAt(0) == firstLetter || name.toLowerCase().charAt(0) == firstLetter)) {
                namesStartingWithNeededLetter.add(name);
            }
        }
        return namesStartingWithNeededLetter;
   }


    public static void printNamesLongerThan(List<String> strings,int n) {
        for (String name : strings) {
            if(name != null && !name.isEmpty() && name.length() > n) {
                System.out.println("student " + name.toUpperCase());
            }
        }
    }

}
