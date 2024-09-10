package org.morethread.threadstate;
/**
 * run方法调试中分为All和Thread调试
 * All：调试该线程时其他线程会正常运行完成(只要点一下F8其他同步线程就会进入运行)
 * Thread：每条线程都是独立的调试，某线程执行run方法时其他线程会被停止
 * */
public class ThreadTiaoShi {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("t1");
        MyThread t2 = new MyThread("t2");

        t1.start();
        t2.start();
    }
}
