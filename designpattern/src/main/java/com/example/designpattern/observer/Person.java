package com.example.designpattern.observer;


import java.util.Observable;
import java.util.Observer;

public class Person implements Observer {
    private String name;
    public Person(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Cup){
            Cup cup = (Cup)o;
            System.out.println(name+"关注的杯子价格已更新为："+cup.getPrice());
        }
    }
}