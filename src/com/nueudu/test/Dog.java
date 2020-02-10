package com.nueudu.test;

public class Dog {
   private int age ;
   private char sex;

    public void setSex(char sex) {
        if(sex == '男' || sex == '女'){
           this.sex = sex;
        }else{
            System.out.println("性别输入错误");
        }
    }

    public char getSex() {
            return sex;
    }

    public void setAge(int age) {
        if(age >= 0 && age <=100) {
            this.age = age;
        }else{
            System.out.println("年龄输入错误");
        }
    }

    public int getAge() {
        return age;
    }
}
