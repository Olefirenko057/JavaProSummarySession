package org.example.lesson07022024.task5;

import java.util.Arrays;

public class Task3 {
    //Написать метод, который выдает из исходного массива массив всех значения, делящихся на заданное число q.
    public static void main(String[] args) {
        int[] ints = {4,50,32,15,20,3};
        int[] sortedArray = sortedArray(ints,4);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] sortedArray(int[] arr,int q) {
        int[] sortedArray = new int[arr.length];
        int count = 0;
        for (int element : arr) {
            if(element % q == 0) {
                sortedArray[count++] = element;
            }
        }
        return Arrays.copyOf(sortedArray,count);
    }
}
