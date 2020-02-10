package com.nueudu.test;

public class Search {
    public static void main(String[] args) {
        int [] array = new int [1000];
        for (int i = 0;i<array.length;i++){
            array[i]=i+1;
        }
        search(array,120);

    }
    public static int search(int []array,int value){
        int min = 0;
        int max = array.length-1;
        int count = 0;
        while (min<=max){
            count++;
            int mid = (min+max)/2;
            if (value<array[mid]){
                max = mid - 1;
            }else if(value>array[mid]){
                min = mid + 1;
            }else {
                System.out.println("查找了"+count+"次");
                return mid;
            }
        }
        return -1;
    }
}
