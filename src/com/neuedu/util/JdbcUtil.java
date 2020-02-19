package com.neuedu.util;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUtil {
    private static final String URL="jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8";
    private static final String USERNAME ="root";
    private static final String PASSWORD ="password";
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    static Connection getConnecton()  {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    //封装通用的增删改查
    public static int executeUpdate(String sql,Object... params) {
        int result = 0;
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = getConnecton();
            pstmt = con.prepareStatement(sql);
            if (params!=null){
                for (int i = 0;i<params.length;i++){
                    pstmt.setObject(i+1,params[i]);
                }
            }
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(con,pstmt);
        }
        return result;
    }
    //封装通用查询
    public static <T>List<T> executeQuery(String sql,Class<T> clz,Object... params){
        //Student 继承 Object
        List<T> list = new ArrayList<>();
        Connection con = getConnecton();
        PreparedStatement pstmt = null;
        ResultSet  rs = null;
        try {
            pstmt = con.prepareStatement(sql);
            if (params!=null){
                for (int i = 0;i<params.length;i++){
                    pstmt.setObject(i+1,params[i]);
                }
            }
            rs = pstmt.executeQuery();
            while (rs.next()){
                //创建一个T类型的对象
                //该方法是反射class对象 调用 无参构造来创建对象
                T t = clz.newInstance();
                //通过字段名 从rs中拿值 复制到对象的属性上
                //获取属性的集合
                Field[] fields =  clz.getDeclaredFields();
                /*rs.getInt("deptno");
                rs.getString("dname");
                rs.getString("loc");*/
                for (Field f: fields){
                    Object value = rs.getObject(f.getName());
                    //打开权限
                    f.setAccessible(true);
                    f.set(t,value);
                }
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return list;

    }
    //封装关闭方法
    static void close(Connection con,PreparedStatement pstmt){
        try {
            if (pstmt!=null)
                pstmt.close();
            if (con!=null)
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    static void close(Connection con, PreparedStatement pstmt, ResultSet rs){
        try {
            if (rs!=null)
               rs.close();
            close(con,pstmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
