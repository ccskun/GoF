package com.ccskun.gof.adapterdelegate;

public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithStrong() {
        System.out.println("*" + string + "*");
    }
}
