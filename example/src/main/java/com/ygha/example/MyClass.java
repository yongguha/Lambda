package com.ygha.example;

import java.util.function.IntSupplier;

public class MyClass {

    public static int method( final int x, int y){
        IntSupplier supplier = ()->{
            int result = x+y;
            return result;
        };

        int result = supplier.getAsInt();
        return result;
    }
    public static void main(String[] args){

        System.out.println(method(3,5));


    }

}