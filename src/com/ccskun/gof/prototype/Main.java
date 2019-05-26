package com.ccskun.gof.prototype;

/**
 * Created by ccskun on 2018/3/10.
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderLinePen upen = new UnderLinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen); //放到Manager的集合属性中
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }
}
