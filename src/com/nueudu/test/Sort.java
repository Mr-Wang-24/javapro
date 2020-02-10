package com.nueudu.test;

public class Sort {
    public static void main(String[] args) {
        int [] array = {1,6,4,22,36,12,9};
        int flag = 0;
        for(int i = 0;i<array.length-1;i++){
            for (int j = 0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag++;
                }
            }
            if (flag==0){
                break;
            }
        }
        for (int k = 0;k<array.length;k++){
            System.out.println(array[k]);
        }
    }
}
