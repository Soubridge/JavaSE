package org.morethread.threadsafe.synchronizeds;

public class SaleTicket {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket,"上海南站");
        Thread t2 = new Thread(ticket, "上海北站");
        Thread t3 = new Thread(ticket,"上海站");

        t1.start();
        t2.start();
        t3.start();
    }
}
