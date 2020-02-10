package com.nueudu.test;

import java.util.ArrayList;
import java.util.List;

public class MyTest2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(51);
        list.add(1,10);
        List list2 = new ArrayList();
        list2.add("sb");
        list2.add("xb");
        System.out.println(list.addAll(list2));
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(list.contains("sb"));
        System.out.println(list.indexOf("xb"));
    }
}
