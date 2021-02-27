package com.ygha.function;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class MyClass {

    private static List<Student> list = Arrays.asList(

            new Student("john", 90, 56, "seoul"),
            new Student("michael", 70, 66, "pusan")
    );

    public static void printString(Function<Student, String> function){

        for(Student student : list){
            System.out.println(function.apply(student)+"");
        }

    }

    public static void printEnglishScore(ToIntFunction<Student> function){
        for(Student student : list){
            System.out.println(function.applyAsInt(student)+"");
        }
    }

    public static void printAddress(Function<Student, String> function){
        for(Student student : list){
            System.out.println(function.apply(student) + "");
        }
    }

    public static void main(String[] args){

        printString(t->t.getName());
        System.out.println();
        printEnglishScore(t->t.getEnglishScore());
        System.out.println();
        //printAddress(t->t.getAddress());
        printString(t->t.getAddress());

    }





}