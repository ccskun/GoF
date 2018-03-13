package com.ccskun.gof.abstractfactory.factory;

import java.util.ArrayList;

/**
 * Created by ccskun on 2018/3/10.
 */
public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();
    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item) {
        tray.add(item);
    }
}
