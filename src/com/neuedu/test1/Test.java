package com.neuedu.test1;

public class Test {
    public static void main(String[] args) {
        ColaEmployee[] array = {
                new SalariedEmployee("月薪员工", 6, 30000),
                new HourlyEmployee("时薪员工", 5, 100, 300),
                new SalesEmployee("提成员工", 3, 7000000, 0.3)
        };


        for (int i = 0; i < array.length; i++) {
            new payWage().getSalary(array[i],7);
        }
    }

    public static class payWage {
        //	打印出某月某个员工的工资数额
        public void getSalary(ColaEmployee emp,int month) {
            System.out.println(emp.name + "在" + month +
                    "月的月薪为" + emp.getSalary(month)+"元");
        }
    }
}
