package com.commax.behaviorparam;


import com.sun.javafx.scene.control.skin.VirtualFlow;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface ApplePredicate{
    public boolean test(Apple apple);
}

class AppleWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        if(apple.getWeight()>50)
            return true;
        else
            return false;
    }
}

class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        if(apple.getColor().equalsIgnoreCase("GREEN"))
            return true;
        else
            return false;
    }
}
/*
interface DevicePredicate{
    boolean test(DeviceInfo deviceInfo);
}

 */


public class MyClass {


    /*
    filterDevice(deviceInofs, s->s.getNickName().equals)


    public static List<DeviceInfo> filterDevice(List<DeviceInfo> devices, DevicePredicate p){
        List<DeviceInfo> result = new ArrayList<>();
        for(DeviceInfo deviceInfo : devices){
            if(p.test(deviceInfo))
                result.add(deviceInfo)
        }
        return result;
    }

     */



    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(p.test(apple))
                result.add(apple);
        }
        return result;
    }

    public static void main(String[] args){
        List<Apple> inventory = Arrays.asList(
                new Apple(80, "RED"),
                new Apple(80, "GREEN"),
                new Apple(50, "BLUE")
        );


        //List<Apple> greenApples =
                filterApples(inventory, new AppleGreenColorPredicate()).stream()
                .forEach(s->System.out.println(s));


        List<Apple> weightApples = filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return false;
            }
        });

        List<Apple> greenLambdaApple = filterApples(inventory, (apple)->apple.getColor().equalsIgnoreCase("GREEN")) ;

    }
}