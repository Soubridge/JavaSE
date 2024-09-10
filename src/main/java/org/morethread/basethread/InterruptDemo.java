package org.morethread.basethread;
/**
 * 生产菜包，一段时间后生产一个肉包，然后继续生产菜包
 * */
public class InterruptDemo {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(()->{
            long startTime = System.currentTimeMillis();
            while(System.currentTimeMillis()-startTime < 5){
                //if(Thread.currentThread().isInterrupted()){
                if(Thread.interrupted()){
                    System.out.println((System.currentTimeMillis()-startTime) + "：生产肉包");
                }else{
                    System.out.println((System.currentTimeMillis()-startTime) + "：生产菜包");
                }
            }
        });

        t1.start();
        Thread.sleep(3);
        t1.interrupt();
    }
}
