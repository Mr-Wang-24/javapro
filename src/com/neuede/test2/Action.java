package com.neuede.test2;

import java.util.ArrayList;
import java.util.Scanner;

public class Action {
    Scanner scanner = new Scanner(System.in);

    public static void inputDate() {
    }

    public static void deleteName() {
    }

    public static void search() {
    }

    /*
    添加书籍
     */
    public void inputDate(ArrayList<MyBook> books, int n){
        for(int i=0;i<n;i++){
            System.out.println("请输入第"+(i+1)+"本书的信息");
            System.out.print("请输入书名：");
            String name = scanner.next();
            System.out.print("请输入书价：");
            Double price = scanner.nextDouble();
            System.out.print("请输入出版社：");
            String press = scanner.next();
            System.out.print("请输入作者：");
            String author = scanner.next();
            System.out.print("请输入书的ISBN：");
            String bookIsbn = scanner.next();
            MyBook book = new MyBook();
            book.setName(name);
            book.setPrice(price);
            book.setPress(press);
            book.setAuthor(author);
            book.setBookIsbn(bookIsbn);
            books.add(book);
        }
    }
    /*
    显示全部书籍
     */
    public void print(ArrayList<MyBook> books){
        if(books.size()==0){
            System.out.println("书籍数量为零，请添加书籍！");
        }else{
            for(MyBook book:books){
                System.out.println("第"+(books.indexOf(book)+1)+"本书的全部信息");
                System.out.println("书名:"+book.getName());
                System.out.println("单价:"+book.getPrice());
                System.out.println("出版社:"+book.getPress());
                System.out.println("作者:"+book.getAuthor());
                System.out.println("书的ISBN:"+book.getBookIsbn());
            }
        }

    }
    /*
    查找书籍
     */
    public void search(ArrayList<MyBook> books,String name){
        int size = books.size();
        for(MyBook book:books){
            String Name =book.getName();
            if(Name.equals(name)){
                System.out.println("书名:"+book.getName());
                System.out.println("书价:"+book.getPrice());
                System.out.println("出版社:"+book.getPress());
                System.out.println("作者:"+book.getAuthor());
                System.out.println("书的ISBN:"+book.getBookIsbn());
                break;
            }else if(books.indexOf(book)==books.size()-1){
                System.out.println("此书不存在！");
            }
        }
    }
    /*
    删除指定书籍
     */
    public void deleteName(ArrayList<MyBook> books,String name){
        for(MyBook book:books){
            if(book.getName().equals(name)){
                books.remove(book);
                System.out.println("删除成功！");
                break;
            }else if(books.indexOf(book)==books.size()-1){
                System.out.println("没有此书，删除失败！");
            }
        }
    }
}

