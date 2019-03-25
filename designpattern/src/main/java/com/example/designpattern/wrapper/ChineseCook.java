package com.example.designpattern.wrapper;

public class ChineseCook implements Cook {
    @Override
    public void cookDinner() {
        System.out.println("中国人做晚饭");
    }
}
