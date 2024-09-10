package org.morethread.threadsafe.waitandnotify;

public class WaitInterruptTest {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            while(true){
                synchronized (Object.class){
                    System.out.println("交出执行权进入等待状态、交出Object的对象锁");
                    try {
                        Object.class.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        t.start();
        //main线程先小睡一下，确保线程0进入wait状态
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            t.interrupt();
        }catch(RuntimeException e){
            e.printStackTrace();
        }
    }
}
