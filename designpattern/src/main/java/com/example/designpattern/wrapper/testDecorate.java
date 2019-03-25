package com.example.designpattern.wrapper;

public class testDecorate {

    public static void testDecorate() {
        Cook cook0 = new WashHandsCook(new ChineseCook());

        cook0.cookDinner();
    }

    public static void main(String[] args) {
        testDecorate();

    }

}
