package com.neuede.test2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test1 {
    public static void main(String[] args) {
       /* 斐波那契数列
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        for (int i = 2;i<10;i++){
            list.add( list.get(i-1)+list.get(i-2));
        }
        System.out.println(list);
        */


       //一个球从100米高度落下，每次落地后反弹到原高度的一半，求第10次落地后 反弹多高
//       double a = 100;
//        for (int i = 1;i<=10;i++){
//            a = a/2;
//        }
//        System.out.println(a);


        //一个整数 加100后是一个完全平方数 再加168也是一个完全平方数 该数是多少
//        for (int i = 1; i < 1000; i++) {
//            int m = (int) Math.sqrt((i + 100));
//            int n = (int) Math.sqrt((i + 100 + 168));
//            if (m * m == i + 100 && n * n == i + 100 + 168) {
//                System.out.println("这个数是" + i);
//            }
//        }


        //n个人围坐在一个圈子里 从1开始报数 报到3的时候 离开  最后剩下的是第几个人
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圈子人数：");
        int n = sc.nextInt();
        for (int i = 1;i<=n;i++){
            list.add(i);
        }
        System.out.println(list);
    }
}
