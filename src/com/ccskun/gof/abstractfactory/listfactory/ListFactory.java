package com.ccskun.gof.abstractfactory.listfactory;

import com.ccskun.gof.abstractfactory.factory.*;
/**
 * Created by ccskun on 2018/3/11.
 */
public class ListFactory extends Factory {
    public Link createLink (String caption, String url) {
        return new ListLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
