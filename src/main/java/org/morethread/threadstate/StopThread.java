package org.morethread.threadstate;
/**
 * stop()退出线程会把执行到一半的线程终止，并且把拿到的锁交出去可能会造成严重后果，可以用interrupt()中断，然后线程体自检的方法终止线程执行
 * */
public class StopThread {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread t1 = new Thread("t1"){
            @Override
            public void run(){
                //在循环的外层用的synchronized，这样必然要把这个循环搞完
                synchronized (Object.class){
                    while(true){
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("t1..." + (System.currentTimeMillis()-startTime));
                        if(this.isInterrupted()){
                            //Object.class.notify();
                            try {
                                Object.class.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
        };

        Thread t2 = new Thread("t2"){
            @Override
            public void run(){
                System.out.println("t2进入...");
                while(true){
                    synchronized (Object.class){
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("t2......");
                    }
                }
            }
        };

        t1.start();
        Thread.sleep(1000);
        t2.start();

        Thread.sleep(3000);
        t1.interrupt();
    }
}
