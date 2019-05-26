package com.ccskun.gof.templatemethod;

public class CharDispaly extends AbstractDisplay {
    private char ch;
    public CharDispaly(char ch) {
        this.ch = ch;
    }
    public void open() {
        System.out.print("<<");
    }
    public void print() {
        System.out.print(ch);
    }
    public void close() {
        System.out.println(">>");
    }
}
