package org.morethread.threadsafe.synchronizeds;

public class Shower {
    //其实这两个同步方法大体是一样的，print1同步方法用的锁对象也是this，print2又用this同步了方法的所有代码块
    public synchronized void print1(){
        System.out.print("犯");
        System.out.print("我");
        System.out.print("中");
        System.out.print("华");
        System.out.print("者");
        System.out.println();
    }

    public void print2(){
        synchronized (this){
            System.out.print("虽");
            System.out.print("远");
            System.out.print("必");
            System.out.print("诛");
            System.out.println();
        }
    }
}
