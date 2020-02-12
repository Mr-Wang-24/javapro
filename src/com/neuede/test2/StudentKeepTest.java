package com.neuede.test2;

import java.io.*;

public class StudentKeepTest {
    public static void main(String[] args) {
        /*序列化
        Student student = new Student();
        student.setID(10);
        student.setName("张三");
        student.setAge(20);
        student.setGrade("卓越一班");
        File file = new File("d:/student");
        OutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.flush();
            outputStream.flush();
            System.out.println("保存完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (objectOutputStream!=null)
                    objectOutputStream.close();
                if (outputStream!=null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/


        //反序列化
        File file = new File("d:/student");
        InputStream inputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            inputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(inputStream);
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (objectInputStream!=null)
                  objectInputStream.close();
                if (inputStream!=null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


}
