package com.ccskun.gof.templatemethod;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDispaly('H');
        AbstractDisplay d2 = new StringDispaly("Hello world!");
        AbstractDisplay d3 = new StringDispaly("你好！世界。");
        d1.display();
        d2.display();
        d3.display();
    }

}
