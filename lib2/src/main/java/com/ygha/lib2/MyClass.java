package com.ygha.lib2;

interface MyFunctionalInterface{
    public void method();
}

class ThisExample{
    public int outterField = 10;
    class Inner{
        int innerField = 20;

        void method(){
            MyFunctionalInterface fi = ()->{

                System.out.println("outterField:" + outterField);
                System.out.println("outterField:" + ThisExample.this.outterField+"\n");

                System.out.println("innerField:" + innerField);
                System.out.println("innerField:" + this.innerField+"\n");
            };
            fi.method();
        }
    }
}


public class MyClass {

    public static void main(String[] args){

        ThisExample example = new ThisExample();
        ThisExample.Inner inner = example.new Inner();
        inner.method();


    }

}