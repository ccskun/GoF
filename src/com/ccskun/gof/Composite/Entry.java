package com.ccskun.gof.Composite;

import com.sun.deploy.trace.FileTraceListener;

/**
 * Created by ccskun on 2018/3/11.
 */
public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    protected abstract void printList(String prefix);
    public Entry add(Entry entry) throws FileTreatMentException {
        throw new FileTreatMentException();
    }
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
