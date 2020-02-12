package com.neuede.test2;

public class MyThread {
    public static int a = 0;
    public static void main(String[] args) {
        /*
        MyThread1 t1 = new MyThread1();
        t1.start();
        MyThread1 t2 = new MyThread1();
        t2.start();
         */

        /*
        MyThread2 t2 = new MyThread2();
        Thread t = new Thread(t2);
        t.start();
         */

        /*
        MyInterface add = new MyInterface() {           //匿名内部类
            @Override
            public int method(int a, int b) {
                return a+b;
            }
        };
        */

        /*
        System.out.println(method(3, 5, new MyInterface() {
            @Override
            public int method(int a, int b) {
                return a+b;
            }
        }));
        */

        /*
        System.out.println(method(10,5,(a,b)->{
            return a+b;
        }));
        */

        /*线程的内部匿名类
        Thread t1 = new Thread(new Runnable() {
        @Override
            public void run() {
                for (int i = 1;i<20;i++){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"线程输出："+i);
                }
            }
        });
        t1.start();
         */

        for (int i = 0;i<5000;i++){
            Thread t = new Thread(()->{
                a++;
            });
            t.start();
        }
        System.out.println(a);
    }
    public static int method(int a,int b ,MyInterface myInterface){
        return myInterface.method(a,b);
    }
}
