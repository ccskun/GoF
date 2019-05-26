package com.ccskun.gof.templatemethod;

/**
 * Created by ccskun on 2018/3/9.
 */
public class StringDispaly extends AbstractDisplay {
    private String string;
    private int width;
    public StringDispaly(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }
    public void open() {
        printLine();
    }
    public void print() {
        System.out.println("|" + string + "|");
    }
    public void close() {
        printLine();
    }
    private void printLine() {
        System.out.print("+");
        for (int i=0; i<width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
