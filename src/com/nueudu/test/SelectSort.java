package com.nueudu.test;

public class SelectSort {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 9, 12, 6, 50, 22, 40};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
        for (int k = 0;k<array.length;k++){
            System.out.println(array[k]);
        }
    }
}
