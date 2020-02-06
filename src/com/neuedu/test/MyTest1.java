package com.neuedu.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class MyTest1 {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        Date startarray = new Date();
        for (int i = 0;i<1000000;i++){
            arrayList.add(0,i);
        }
        Date endarray = new Date();
        System.out.println("ArrayList添加用时="+(endarray.getTime()-startarray.getTime()));
        Date startLinkedList = new Date();
        for (int i = 0;i<1000000;i++){
            linkedList.add(0,i);
        }
        Date endLinkedList = new Date();
        System.out.println("LinkedList添加用时="+(endLinkedList.getTime()-startLinkedList.getTime()));
    }
}
