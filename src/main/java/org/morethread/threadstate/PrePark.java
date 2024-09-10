package org.morethread.threadstate;
/**
 * LockSupport只允许进行一次预处理，多次unpark是无效的
 * */
import java.util.concurrent.locks.LockSupport;

public class PrePark {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread t1 = new Thread("t1"){
            @Override
            public void run(){
                System.out.println("running-before..."+(System.currentTimeMillis()-startTime));

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("park之前" + (System.currentTimeMillis()-startTime));

                //这里的park不起作用，main已经事先预处理过一次(unpark)
                LockSupport.park();
                //LockSupport.park();
                System.out.println("park之前" + (System.currentTimeMillis()-startTime));
                System.out.println("running-after..." + (System.currentTimeMillis()-startTime));
            }
        };
        t1.start();
        Thread.sleep(10);
        LockSupport.unpark(t1);
    }
}
