package com.ccskun.gof.abstractfactory.listfactory;

import com.ccskun.gof.abstractfactory.factory.Item;
import com.ccskun.gof.abstractfactory.factory.Page;

import java.util.Iterator;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title,author);
    }

    @Override
    public String makeHtml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<html><head><title>" + title + "</title></head>\n");
        builder.append("<body>\n");
        builder.append("<h1>" + title + "</h1>\n");
        builder.append("<ul>\n");
        Iterator it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            builder.append(item.makeHtml());
        }
        builder.append("</ul>");
        builder.append("<hr><address>" + author + "</address>");
        builder.append("</body></html>\n");
        return builder.toString();
    }
}
