package org.morethread.threadsafe.synchronizeds;
/**
 * 不管线程1、2谁抢到执行权，在把方法完完整整执行完之前，不会把时间片(执行权)交出去
 * */
public class SynchronizedFunction {
    public static void main(String[] args) {
        Shower shower = new Shower();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<1000; i++){
                    shower.print1();
                }
            }
        }).start();

        new Thread(){
            @Override
            public void run(){
                for(int i=0; i<1000; i++){
                    shower.print2();
                }
            }
        }.start();
    }
}
