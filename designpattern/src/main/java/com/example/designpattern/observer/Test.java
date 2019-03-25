package com.example.designpattern.observer;

public class Test {
    public static void main(String[] args) {
        Cup cup = new Cup(3000);
        Person p1 = new Person("生命壹号");
        Person p2 = new Person("生命贰号");
        cup.addObserver(p1);
        cup.addObserver(p2);
        System.out.println("第一轮促销");
        cup.setPrice(2988);
        System.out.println("第二轮促销");
        cup.setPrice(2698);

        cup.deleteObserver(p2);
        System.out.println("第三轮促销");
        cup.setPrice(1998);
    }
}