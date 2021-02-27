package com.commax.behaviorparam2;

public class Student {
    String name;
    String home;
    int age;
    String sex;

    public Student(String name, String home, int age, String sex) {
        this.name = name;
        this.home = home;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getHome() {
        return home;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}
