package com.nueudu.test;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(){

    }

    public Rectangle(double width,double height,String color){
        super();
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void getArea() {
        area = width * height;
    }

    @Override
    public void getPer() {
        per = (width + height) * 2;
    }

    @Override
    public void showAll() {
        System.out.println("矩形面积为:"+area+",周长为:"+per+"，颜色为:"+color);
    }
}
