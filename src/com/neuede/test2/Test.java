package com.neuede.test2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("欢迎进入图书管理系统！！！！");
        System.out.print("请输入1-4中的任一个数字:");
        menu();
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        if (a==1){
            System.out.println("添加图书：");
            Action.inputDate();
        }else if (a==2){
            System.out.println("删除图书：");
            Action.deleteName();
        }else if (a==3){
            System.out.println("查找图书（根据用户名）：");
            Action.search();
        } else if (a == 4) {
            System.out.println("退出系统");
            System.exit(0);
        }

    }
}
