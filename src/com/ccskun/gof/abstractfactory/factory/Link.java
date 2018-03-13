package com.ccskun.gof.abstractfactory.factory;

/**
 * Created by ccskun on 2018/3/10.
 */
public abstract class Link extends Item {
    protected String url;
    public Link(String caption, String url) {
        super(caption);
        this.url=url;
    }
}
