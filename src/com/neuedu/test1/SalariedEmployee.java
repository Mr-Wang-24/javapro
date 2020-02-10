package com.neuedu.test1;

public class SalariedEmployee extends ColaEmployee{
    double monthSalary;

    public SalariedEmployee(String name,int month,double monthSalary) {
        super(name,month);
        this.monthSalary=monthSalary;
    }

    public double getSalary(int month){
        return monthSalary;
    }
}
