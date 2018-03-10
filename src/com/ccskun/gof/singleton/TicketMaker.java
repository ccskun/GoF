package com.ccskun.gof.singleton;

/**
 * Created by ccskun on 2018/3/10.
 */
public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();
    private int ticket = 1000;
    private TicketMaker(){}
    public static TicketMaker getInstance() {
        return ticketMaker;
    }
    public int getNextTicketNumber() {
        return ticket++;
    }
}
