package org.example.lesson07022024.task5;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {2,8,6,7,9};
        int[] arr2 = {1,3,5,7};
        boolean result = isSorted(arr);
        System.out.println(result);
        boolean result2 = isSorted(arr2);
        System.out.println(result2);
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
