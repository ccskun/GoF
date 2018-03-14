package com.ccskun.gof.visitor;

/**
 * Created by ccskun on 2018/3/13.
 */
public class FileTreatmentException extends RuntimeException {
    public FileTreatmentException () {}

    public FileTreatmentException(String msg) {
        super(msg);
    }
}
