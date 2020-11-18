package com.atguigu.spring.bean;

/**
 * @author darren
 * @create 2020-11-18 22:20
 */
public class Student {
    private String name;
    private String age;
    private String height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Student() {
        super();
    }

    public Student(String name, String age, String height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
