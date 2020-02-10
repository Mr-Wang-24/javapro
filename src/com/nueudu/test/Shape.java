package com.nueudu.test;

public abstract class Shape {
    protected double area;
    protected double per;    //周长
    protected String color;

    public Shape(){

    }

    public Shape(String color){
        this.color = color;
    }

    public abstract void  getArea();

    public abstract void  getPer();

    public abstract void  showAll();
}
