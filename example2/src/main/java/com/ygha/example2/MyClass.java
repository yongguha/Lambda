package com.ygha.example2;

import java.util.function.Function;

public class MyClass {

    private static Student[] students = {
            new Student("Michael", 40, 50),
            new Student("Jane", 90, 80)
    };

    public static double getAverage(Function<Student, Integer> function){

        int sum = 0;
        for(Student student : students){
            sum = function.apply(student);
        }
        double average = sum/students.length;
        return average;
    }

    public static void main(String[] args){
        System.out.println("english score's average is :" + getAverage(t->t.getEnglishScore()) );


        System.out.println();
        System.out.println("math score's average is :" + getAverage(t->t.getMathScore()));



    }


}