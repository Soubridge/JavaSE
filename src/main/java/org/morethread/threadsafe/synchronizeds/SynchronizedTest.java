package org.morethread.threadsafe.synchronizeds;
/**
 * 因为对象是有内置锁的，在同步代码块加对象锁，相当于借用了对象的内置锁，
 * */
public class SynchronizedTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<1000; i++){
                    synchronized (String.class){
                        System.out.print("犯");
                        System.out.print("我");
                        System.out.print("中");
                        System.out.print("华");
                        System.out.print("者");
                        System.out.println();
                    }

                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<1000; i++){
                    synchronized (String.class){
                        System.out.print("虽");
                        System.out.print("远");
                        System.out.print("必");
                        System.out.print("诛");
                        System.out.println();
                    }
                }
            }
        }).start();
    }
}
