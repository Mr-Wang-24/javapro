package com.neuedu.test1;

public class HourlyEmployee extends ColaEmployee {
    private int hourSalary;
    private int hourNum;

    public HourlyEmployee(String name,int month,int hourSalary,int hourNum){
        super(name,month);
        this.hourSalary = hourSalary;
        this.hourNum = hourNum;
    }

    public double getSalary(int month){
        if (hourNum>160){
            return hourSalary*160+hourSalary*(hourNum-160)*1.5;
        }else {
            return  hourSalary*hourNum;
        }
    }
}
