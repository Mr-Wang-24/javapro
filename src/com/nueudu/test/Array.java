package com.nueudu.test;

public class Array {
    public static void main(String[] args) {
        // 从一个数组里面拿3个数 任意组合  能组合多少个  打印
        /*int n = 0;
        int [] array = {1,2,3,4};
        for (int i=1;i<array.length;i++){
            for (int j:array){
                for (int k:array){
                    if ( i==j|i==k|j==k ){
                        continue;
                    }else {
                        System.out.println(100*i+10*j+k*1);
                        n++;
                    }

                }
            }
        }
        System.out.println("个数是："+n);
        */

        /*1-100之间的偶数和*/
        /*
        int sum = 0;
        for(int i = 1;i <= 100;i++){
            if (i%2==0){
                sum+=i;
            }
            System.out.println(sum);
        }
        */


        //计算m的n次方
        /*int m = 5;
        int n = 3;
        int s = 1;
        for (int i =0;i<n;i++){
            s=s*m;
        }
        System.out.println(s);
        */


        //计算100-999之间的水仙花数      1^3+5^3+3^3=153     153
        /*for (int i = 100;i<=999;i++){
            //取百位
            int a = i/100;
            //取十位
            int b = i/10%10;
            //取个位
            int c = i%10;
            if (a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }
        */


        //取两个正整数 计算最大公约数和最小公倍数
        //
        int x = 6;
        int y = 12;
        int max = 1;
        int min = max(x,y);
        for (int i = 1;i<=x && i<=y;i++){
            if (x%i==0&&y%i==0){
                max = i;
            }
        }
        for (int i = min; i<=x*y;i++){
            if (i%x==0&&i%y==0){
                min = i;
                break;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    public static int max(int a ,int b){
        return  (a>b)?a:b;
    }
}
