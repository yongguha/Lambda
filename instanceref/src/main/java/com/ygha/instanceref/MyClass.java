package com.ygha.instanceref;

import java.util.function.BiFunction;
import java.util.function.Function;

class Member{
    private String name;
    private String id;

    public Member(String name, String id) {
        System.out.println("Member(String name, String id)");
        this.name = name;
        this.id = id;
    }

    public Member(String id) {
        System.out.println("run Member()");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}

public class MyClass {

    public static void main(String[] args){


        Function<String, Member> function = Member::new;
        function.apply("angenl");



        BiFunction<String, String, Member> function1 = Member::new;
        function1.apply("michael", "angel");

    }


}