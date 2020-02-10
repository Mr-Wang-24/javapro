package com.neuedu.test1;

public abstract class ColaEmployee {
    String name;
    int  month;

    public ColaEmployee(){

    }

    public ColaEmployee(String name,int month){
        this.name = name;
        this.month = month;
    }

    public double getSalary(int month){
          return 0;
    }
}
