package com.ygha.lib;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

interface MyfuncionalInterface {
    public void method(int x);
}

interface MyInterface{
    public int method(int x, int y);
}


public class MyClass {

    public static void main(String[] args){

        MyfuncionalInterface fi = (x)->{System.out.println(x);};
        fi.method(5);

        MyInterface mi = (x,y)->x+y;

        int result = mi.method(5,4);
        System.out.println(result);
    }
}