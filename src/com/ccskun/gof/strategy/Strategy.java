package com.ccskun.gof.strategy;

/**
 * Created by ccskun on 2018/3/11.
 */
public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
