package com.ccskun.gof.adapterdelegate;

/**
 * Created by ccskun on 2018/3/9.
 */
public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner("World");
        print.printWeak();
        print.printStrong();
    }
}
