package org.morethread.threadstate;

import java.util.concurrent.locks.LockSupport;

public class ParkWaitTest {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread t1 = new Thread("t1"){
            @Override
            public void run(){
                System.out.println("park-before: " + (System.currentTimeMillis()-startTime));
                LockSupport.park();
                System.out.println("running...: " + (System.currentTimeMillis()-startTime));
                //System.out.println(this.isInterrupted());

                //按道理来说应该停这里，但是并没有，因为此时中断状态为true，park已经不能用了
                LockSupport.park();

                //可以用先清除中断状态，恢复成false
                System.out.println("中断状态：" + Thread.interrupted() + " 已恢复");
                LockSupport.park();
            }
        };
        t1.start();
        Thread.sleep(1000);
        //在LockSupport.park()状态下，线程的中断状态是false，说明park并不影响中断状态
        System.out.println("t1中断状态：" + t1.isInterrupted());    //false
        t1.interrupt();
        //interrupt可以中断处于park状态下的线程，能起到unpark的效果，并且中断状态也是true，这个过程中还不会报错
        System.out.println("t1中断状态：" + t1.isInterrupted());    //true
        //下面中断状态是false的原因是：t1线程已经执行完毕，回复未start的默认中断状态false
        Thread.sleep(1000);
        System.out.println("t1中断状态：" + t1.isInterrupted());    //false
    }
}
