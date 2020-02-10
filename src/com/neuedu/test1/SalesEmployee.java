package com.neuedu.test1;

public class SalesEmployee extends ColaEmployee {
    private int monthSales;//月销售额
    private double royaltyRate;//提成率

    public SalesEmployee(String name, int month,int monthSales,double royaltyRate) {
        super(name, month);
        this.monthSales = monthSales;
        this.royaltyRate = royaltyRate;
    }

    public double getSalary(int month){
        return monthSales * royaltyRate;
    }
}
