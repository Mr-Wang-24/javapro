package com.neuede.test2;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 2L;
    private int ID;
    private String Name;
    private int Age;
    private String Grade;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Grade='" + Grade + '\'' +
                '}';
    }
}
