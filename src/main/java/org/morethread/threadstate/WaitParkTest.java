package org.morethread.threadstate;
/**
 * wait && park
 * wait可以协调多线程【执行顺序...】，如果这个方法需要其他线程执行其他方法得到的结果[注意其他方法也得用相同的锁对象]，那么可以将这个锁对象先wait出去，等计算结果的完事回来再给开开
 * wait 只能在 同步代码块/同步方法 中用，而且调用者用这个“同步”的锁对象， park就没有这个限制，在线程体run中直接用即可，而且park是LockSupport类的静态方法
 * 线程在synchronized中用wait时，需要交出对象锁的所有权，也会造成线程失去执行权，park会使线程处于等待状态但不会释放锁
 * 中断wait状态的线程会抛InterruptedException异常，而中断park不会出现异常而且能成功(true)
 * */
import java.util.concurrent.locks.LockSupport;

public class WaitParkTest {
    public static void main(String[] args) {
        Thread t1 = new Thread("t1"){
            @Override
            public void run(){
                while(true) {
                    synchronized (Object.class) {
                        System.out.println("t1-before...");
                        LockSupport.park();
                        System.out.println("t1-after...");
                    }
                }
            }
        };

        Thread t2 = new Thread("t2"){
            @Override
            public void run(){
                while(true){
                    synchronized (Object.class){
                        System.out.println("t2...");
                    }
                }
            }
        };

        t1.start();
        t2.start();

        LockSupport.unpark(t1);
    }
}
