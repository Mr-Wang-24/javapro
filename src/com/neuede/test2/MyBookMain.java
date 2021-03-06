package com.neuede.test2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyBookMain {
    public static MyBook[] books = new MyBook[200];
    public static List<MyBook> List = new ArrayList<>();
    public static File file = new File("d:/a/books");
    public static void main(String[] args) {
         if (!file.exists()){
             inputDate(List);
             save();
         }else {
             read();
         }

         menu();

    }

    public static void menu(){
        System.out.println("输出菜单项请选择你要进行的操作（请选择1-4之间的任意数字）：");
        System.out.println("1.添加图书");
        System.out.println("2.删除图书");
        System.out.println("3.查找图书（根据书名）");
        System.out.println("4.输出所有");
        System.out.println("5.退出系统");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1:
                addBook(List);
                break;
            case 2:
                System.out.println("请输入要删除的书名：");
                String name = scanner.next();
                deleteName(List,name);
                break;
            case 3:
                System.out.println("请输入要查找的书名：");
                String searchName = scanner.next();
                searchName(List,searchName);
                break;
            case 4:
                print(List);
                break;
            default:
                System.exit(1);
                break;
        }
    }

    public static void addBook(List<MyBook> books){
          Scanner scanner = new Scanner(System.in);
          System.out.println("请输入书名：");
          String name = scanner.next();
          System.out.print("请输入书价：");
          Double price = scanner.nextDouble();
          System.out.print("请输入出版社：");
          String press = scanner.next();
          System.out.print("请输入作者：");
          String author = scanner.next();
          System.out.print("请输入书的ISBN：");
          String bookIsbn = scanner.next();
          MyBook myBook = new MyBook(name,price,press,author,bookIsbn);
          books.add(myBook);
          save();
          menu();
    }

    public static void inputDate(List<MyBook> books){
        Scanner scanner = new Scanner(System.in);
        System.out.println("首次运行系统请输入初始化书籍的数量");
        int n = scanner.nextInt();
        for (int i = 0;i<=n;i++){
            MyBook myBook = new MyBook("书名"+i,Double.valueOf(String.valueOf(i)),"出版社"+i,"作者"+i,"ISBN号"+i);
            books.add(myBook);
        }
    }

    public static  void print(List<MyBook> books){
        for (int i = 0;i<books.size();i++){
            System.out.println(books.get(i));
        }
        menu();
    }

    public static void searchName(List<MyBook> books,String name){
        for (int i = 0;i<books.size();i++){
            MyBook myBook = books.get(i);
            if (myBook.getName().equals(name)){
                System.out.println(myBook);
                menu();
                return;
            }
        }
        System.out.println("此书不存在");
        menu();
    }

    public static void deleteName(List<MyBook> books,String name){
        for (int i = 0;i<books.size();i++){
            MyBook myBook = books.get(i);
            if (myBook.getName().equals(name)){
                books.remove(i);
                System.out.println("删除成功");
                save();
                menu();
                return;
            }
        }
        System.out.println("此书不存在，删除失败");
        menu();
    }

    public static void save(){
        OutputStream os = null;
        ObjectOutputStream oos = null;
        try {
            os = new FileOutputStream(file);
            oos = new ObjectOutputStream(os);
            oos.writeObject(List);
            oos.flush();
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (oos!=null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os!=null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void read(){
        InputStream is = null;
        ObjectInputStream ois = null;
        try {
            is = new FileInputStream(file);
            ois = new ObjectInputStream(is);
            List = (List<MyBook>)ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (is!=null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ois!=null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
