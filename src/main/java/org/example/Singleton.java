package org.example;

import java.util.Random;

public class Singleton {
    private static Singleton instance;
    private int id;

    public int getId() {
        System.out.println(id);
        return id;
    }

    public Singleton() {
        this.id = (int)(Math.random() * 101);
    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void showMessage() {
        System.out.println("Test singleton!");
    }
}
