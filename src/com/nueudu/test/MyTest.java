package com.nueudu.test;

public class MyTest {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setSex('公');
        d1.setAge(100);
        char sex = d1.getSex();
        int age = d1.getAge();
        System.out.println(sex);
        System.out.println(age);
    }
}
