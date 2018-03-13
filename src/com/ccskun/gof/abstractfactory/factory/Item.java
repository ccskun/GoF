package com.ccskun.gof.abstractfactory.factory;

/**
 * Created by ccskun on 2018/3/10.
 */
public abstract class Item {
    protected String caption;
    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHtml();
}
