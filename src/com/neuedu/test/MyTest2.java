package com.neuedu.test;

import com.neuedu.pojo.Dept;
import com.neuedu.pojo.Emp;
import com.neuedu.pojo.Student;
import com.neuedu.util.JdbcUtil;
import com.neuedu.web.StudentWeb;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Neuedu on 2020/2/6.
 */
public class MyTest2 {
    public static void main(String[] args) {
        /*StudentWeb studentWeb = new StudentWeb();
        studentWeb.showmain();
        studentWeb.input();*/


        Class clz =  Student.class;
        //调用该类的无参构造创建一个对象
        //clz.newInstance();
        //List<Emp> list = JdbcUtil.executeQuery("", Emp.class);
        List<Emp> list = JdbcUtil.executeQuery("select empno,ename,job,mgr,sal,deptno from emp", Emp.class);
        System.out.println(list);
    }
}
