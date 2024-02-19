package org.example.lesson07022024.task5;

import java.util.Arrays;

public class Main {
    //5. Написать метод generateMatrix(), который будет создавать матрицу размера m на n, у которой
    //а). На главной диагонали будут единицы, остальные значения 0.
    //Input: n = 3, m = 3
    //Output:
    //	1 0 0
    //	0 1 0
    //	0 0 1
    //б). На побочной диагонали будут единицы, остальные значения 0.
    //Input: n = 4, m = 3
    //Output:
    //	0 0 0
    //	0 0 1
    //	0 1 0
    //	1 0 0
    //6. Написать метод, который проверяет, является ли массив отсортированным.
    public static void main(String[] args) {
        int[][] result = generateMatrix(6,4);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }


        int[][] result2 = generateMatrix2(6,4);
        for (int i = 0; i < result2.length; i++) {
            System.out.println(Arrays.toString(result2[i]));
        }

    }

    public static int[][] generateMatrix(int m,int n) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length && i < arr[0].length; i++) {
               arr[i][i] = 1;
        }
        return arr;
    }

    public static int[][] generateMatrix2(int n, int m) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length && i < arr[0].length; i++) {
            arr[arr.length - 1 - i][i] = 1;
        }
        return arr;
    }
}
