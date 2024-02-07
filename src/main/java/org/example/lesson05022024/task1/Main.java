package org.example.lesson05022024.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>(456);
        System.out.println(box1.get());
        System.out.println(box1.remove());
        System.out.println(makeList(array));
        Arrays.toString(stringArr);
        reverseArray(stringArr);

        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 0, 0, 0}};
        for (int ar[] : arr) {
            for (int el : ar) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
        transpose(arr);
    }

    public static Integer[] array = {1, 2, 3, 4, 6};
    public static String[] stringArr = {"one", "two", "three", "four", "five"};

    public static <Item> List<Item> makeList(Item[] arr) {
        List<Item> list = new ArrayList<>();
        for (Item item : arr) {
            list.add(item);
        }
        return list;
    }

    public static void reverseArray(String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    //4. Создать метод transpose(), который будет транспонировать матрицу (заменять строки на столбцы).
    ////        Input:
    ////        1 2 3 4
    ////        5 6 7 8
    ////        9 0 0 0
    ////        Output:
    ////        1 5 9
    ////        2 6 0
    ////        3 7 0
    ////        4 8 0

    public static int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 0, 0, 0}};

    public static void transpose(int[][] twoDimArr) {
        int[][] changed = new int[4][3];
        int count = 0;
        for (int ar[] : twoDimArr) {
            for (int i = 0; i < ar.length; i++) {
                changed[i][count] = ar[i];
            }
            count++;
        }
        for (int[] arrChanged : changed) {
            for(int el : arrChanged) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}


