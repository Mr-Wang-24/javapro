package com.nueudu.test;

public class MyTest1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4,"blue");
        Circle circle = new Circle(2,"red");

        rectangle.getArea();
        rectangle.getPer();
        rectangle.showAll();

        circle.getArea();
        circle.getPer();
        circle.showAll();
    }
}
