package com.ygha.lib3;

import java.util.function.Consumer;

public class MyClass {

    public static void main(String[] args){

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {

                System.out.println(s+"8");
            }
        };

        consumer.accept("java");


        Consumer<String> consumer1 = (x)->{
            System.out.println(x+"8");
        };
        consumer1.accept("java");
    }



}