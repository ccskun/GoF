package com.ccskun.gof.abstractfactory.listfactory;

import com.ccskun.gof.abstractfactory.factory.Link;

/**
 * Created by ccskun on 2018/3/11.
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption,url);
    }
    public String makeHtml() {
        return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
