package com.nueudu.test;

public class LeapYear {
    public static void main(String[] args) {
        int year = 1998;
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("是闰年");
        }else{
            System.out.println("不是闰年");
        }
    }
}
