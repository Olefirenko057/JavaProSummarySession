package org.example.lesson05022024.task1;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] input = {{1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 0, 0, 0}};
        int[][] output = transpose(input);
        System.out.println(Arrays.deepToString(output));
        for (int i = 0; i < input.length; i++) {
            System.out.println(Arrays.toString(input[i]));
        }
        for (int i = 0; i < output.length; i++) {
            System.out.println(Arrays.toString(output[i]));
        }
    }

    public static int[][] transpose(int[][] input) {
        int[][] output = new int[input[0].length][input.length];
            for (int i = 0; i < input.length; i++) {
                for(int j = 0; j < input[i].length; j++) {
                    output[j][i] = input[i][j];
                }
            }

            return output;
    }
}
