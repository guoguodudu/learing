package com.example.designpattern.observer;


import java.util.Observable;

public class Cup extends Observable {
    private float price;

    public Cup(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        this.setChanged();//通知，数据已改变
        this.notifyObservers();
    }
}