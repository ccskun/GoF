package com.ccskun.gof.singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();;
    private Singleton() {
        System.out.println("成生了一个实例。");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
