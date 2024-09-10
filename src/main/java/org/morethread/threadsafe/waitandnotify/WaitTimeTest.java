package org.morethread.threadsafe.waitandnotify;
/**
 * 使用wait()线程交出执行权进入等待状态，但是等计时器到点就会自动收回线程执行权
 *
 * */
public class WaitTimeTest {
    public static void main(String[] args) {
        new Thread(()->{
            while(true){
                synchronized (Object.class){
                    System.out.println("线程1...before");
                    try {
                        Object.class.wait(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("线程1...end");
                }
            }
        }).start();

        new Thread(()->{
            while(true){
                synchronized (Object.class){
                    System.out.println("线程2...");
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
