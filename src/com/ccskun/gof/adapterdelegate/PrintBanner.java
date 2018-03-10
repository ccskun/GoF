package com.ccskun.gof.adapterdelegate;

/**
 * Created by ccskun on 2018/3/9.
 */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }
    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithStrong();
    }
}
