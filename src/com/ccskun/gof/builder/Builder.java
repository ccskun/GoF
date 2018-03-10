package com.ccskun.gof.builder;

public abstract class Builder {
    // 编写标题
    public abstract void makeTitle(String title);
    // 编写字符串
    public abstract void makeString(String str);
    // 编写条目
    public abstract void makeItems(String[] items);
    public abstract void close();
}
