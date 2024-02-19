package org.example.lesson07022024.task5;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    //8. Написать метод, который выдает из исходного двумерного массива массив максимумов столбцов.
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,1},
                       {4,5,6,3},
                       {1,4,2,7}
                        };
        System.out.println(Arrays.toString(maxValues(arr)));

    }

    public static int[] maxValues(int[][] arr2d) {
        int[][] revertedArray = new int[arr2d[0].length][arr2d.length];
        for (int i = 0; i < revertedArray.length; i++) {
            for (int j = 0; j < revertedArray[i].length; j++) {
                revertedArray[i][j] = arr2d[j][i];
            }
        }
        int[] biggestValues = new int[revertedArray.length];
        for (int i = 0; i < revertedArray.length; i++) {
            int maxValue = revertedArray[i][0];
            for (int j = 1; j < revertedArray[i].length; j++) {
                if(maxValue < revertedArray[i][j]) {
                    maxValue = revertedArray[i][j];
                }
            }
            biggestValues[i] = maxValue;
        }
        return biggestValues;
    }
//    public static int[] maxArray(int[][] arr2d) {
//        int[] maxValues = new int[arr2d[0].length];
//        for (int i = 1; i < arr2d.length - 1; i++) {
//            int maxVal = arr2d[i][i];
//            if(maxVal <  arr2d[i+1][i]) {
//                maxVal = arr2d[i+1][i];
//            }
//            maxValues[i] = maxVal;
//        }
//        return maxValues;
//    }
}
