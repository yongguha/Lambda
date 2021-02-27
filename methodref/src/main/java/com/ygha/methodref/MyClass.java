package com.ygha.methodref;

import java.util.function.IntBinaryOperator;

class Calculator{
    public static int staticMethod(int x, int y){
        return x+y;
    }

    public int instanceMethod(int x, int y){
        return x+y;
    }
}


public class MyClass {



    public static void main(String[] args){
        IntBinaryOperator operator;
        operator = Calculator::staticMethod;
        operator.applyAsInt(3,5);

        Calculator obj = new Calculator();
        operator = obj::instanceMethod;
        operator.applyAsInt(3,5);

    }
}