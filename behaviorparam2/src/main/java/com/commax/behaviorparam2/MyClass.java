package com.commax.behaviorparam2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class MyFilter {
    public static <T> List<T> myfilter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<>();

        for(T t : list){
            if(p.test(t)){
                result.add(t);
            }
        }
        return result;
    }
}
interface Predicate<T>{
    boolean test(T t);
}

public class MyClass {

    public static void main(String[] args){

        List<Apple> inventory = Arrays.asList(
                new Apple("HongOk",80, "RED"),
                new Apple("Busa",50, "GREEN"),
                new Apple("HongOk",80, "RED")
        );

        List<Student> studentList = Arrays.asList(
            new Student("michael", "pusan", 12,"male"),
            new Student("jim", "seoul", 14,"female"),
                new Student("kane", "pusan", 21,"female"),
                new Student("Joe", "seoul", 20,"male")
        );

        List<Apple> red = MyFilter.myfilter(inventory, s->s.getColor().equals("RED"));
        MyFilter.<Apple>myfilter(inventory, s->s.getName().equals(""));

        List<Apple> redApples = MyFilter.myfilter(inventory, (apple)->"RED".equals(apple.getColor()));
        List<Apple> weightApples = MyFilter.myfilter(inventory, (apple)->apple.getWeight()>50);
        System.out.println("--------------------------------------------------------------");
        weightApples.stream().forEach(s->System.out.println(s.getName()));


        System.out.println("--------------------------------------------------------------");
        MyFilter.myfilter(studentList,(student->student.getHome().equals("pusan"))).stream()
                .forEach(s->System.out.println(s.getName()));

        System.out.println("--------------------------------------------------------------");
        studentList.stream().filter(s->s.getHome().equals("seoul")).collect(Collectors.toList())
                .forEach(s->System.out.println(s.getName()));






    }


}