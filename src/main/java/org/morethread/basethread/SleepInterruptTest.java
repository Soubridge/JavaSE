package org.morethread.basethread;

public class SleepInterruptTest {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    //System.out.println(e.getMessage());
                    //e.printStackTrace();
                    throw new RuntimeException(e);
                }
                System.out.println("线程t1运行完成...");
            }
        },"t1");

        t1.start();

        Thread.sleep(50);   //确保t1线程先运行起来
        t1.interrupt();

        Thread.sleep(10); //让main线程睡一会，确保上面的t1.interrupt已经生效了
        System.out.println(t1.isInterrupted());
        //打印的结果还是false，说明在sleep状态下的t1的中断状态没有被改变，但是就停在了sleep的地方，后面也不会继续执行(当时处理了就继续运行)
        //如果在sleep、wait、join状态下用thread.interrupt()，在线程thread的sleep(..)处会触发异常，如果没有即时处理，这个线程就会在这里
        //停止运行(但是中断状态还是false)->其实不处理也是false，如果处理了，thread还是可以继续运行
    }
}
