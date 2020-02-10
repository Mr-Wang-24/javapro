package com.nueudu.test;

public class Circle extends Shape {
    double radius;

    public Circle(){

    }

    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void getArea() {
        area = radius * radius * 3.14;
    }

    @Override
    public void getPer() {
        per = radius * 3.14 * 2;
    }

    @Override
    public void showAll() {
        System.out.println("圆的面积为:"+area+",周长为:"+per+"，颜色为:"+color);
    }
}
