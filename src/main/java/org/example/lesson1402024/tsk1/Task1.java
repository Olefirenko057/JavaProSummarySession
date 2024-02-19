package org.example.lesson1402024.tsk1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    //1. Дан список из числовых данных.
    //С помощью итератора:
    //a). Напечатать только четные числа из списка.
    //b). Удалить из списка все числа, заканчивающиеся на 0.
    //c). Составить список квадратов чисел.
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(5,615,100,500,25,71,105,1000));
        // 1 task
        Iterator<Integer> iterator = integers.iterator();
        while(iterator.hasNext()) {
            Integer currentInt = iterator.next();
            if(currentInt % 2 == 0) {
                System.out.println(currentInt);
            }
        }
        // 2 task
        iterator = integers.iterator();
        while(iterator.hasNext()) {
            Integer currentInt = iterator.next();
            if(currentInt % 10 == 0 || currentInt == 0) {
                iterator.remove();
            }
        }
        System.out.println(integers);
        // 3 task
        iterator = integers.iterator();
        List<Integer> powNumbers = new ArrayList<>();
        while(iterator.hasNext()) {
            Integer currentInt = iterator.next();
            powNumbers.add(currentInt * currentInt);
        }
        System.out.println(integers);
        System.out.println(powNumbers);
    }


}
