package com.ccskun.gof.visitor;

/**
 * Created by ccskun on 2018/3/13.
 */
public interface Element {
    public abstract void accept(Visitor v);
}
