package org.morethread.threadstate;
/**
 * 线程的挂起LockSupport.park(thread)只能在线程体(run)中进行，只能由其它线程唤醒LockSupport.unpark()
 * */

import java.util.concurrent.locks.LockSupport;

public class ParkTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread("t1"){
            @Override
            public void run(){
                System.out.println("running-before...");
                LockSupport.park();
                System.out.println("running-after...");
            }
        };
        t1.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                LockSupport.unpark(t1);
            }
        }).start();

        //Thread.sleep(1000);

        //LockSupport.unpark(t1);
    }
}
