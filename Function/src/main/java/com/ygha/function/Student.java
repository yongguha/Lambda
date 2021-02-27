package com.ygha.function;

public class Student{
    String name;
    int englishScore;
    int mathScore;
    String address;

    public Student(String name, int englishScore, int mathScore, String address) {
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }
}