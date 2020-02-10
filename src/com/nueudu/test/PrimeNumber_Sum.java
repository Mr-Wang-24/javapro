package com.nueudu.test;

public class PrimeNumber_Sum {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 2; i <= 100; i++){
            int x = 0;
            for(int j = 2;j < i;j++){
                if(i%j == 0){
                    x++;
                }
            }
            if(x == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
