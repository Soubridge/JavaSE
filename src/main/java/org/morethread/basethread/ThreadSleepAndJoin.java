package org.morethread.basethread;
/**
 * 注意：Thread.sleep()是Thread的静态方法，因为线程本身在类创建前就有了(硬件)，线程类只是把这个线程交给某个活儿(类)用，具体这个活儿
 * 叫什么，执行什么内容这些就是线程实例决定的东西了.(Ps:这个线程执行我，我在里面想停咋办呢，只能用类静态方法，比如在main内也可用sleep)
 * main方法和t1用的不是同一个线程
 * 【线程处于sleep阶段，执行权被其他线程join走了，这个sleep将继续计时】这里是错误的，执行权只能由实例本身join走，sleep状态怎么join走呢？
 * 注意：join是一个Thread实例用的方法，优先只是针对这个实例优先★★★★★★★★★★
 * */
public class ThreadSleepAndJoin {
    public static void main(String[] args) throws InterruptedException{
        final long startTime = System.currentTimeMillis();
        Thread t1 = new Thread(()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            long endTime1 = System.currentTimeMillis();
            System.out.println("在时间【"+(endTime1-startTime)+"】醒的");
        });
        Thread t2 = new Thread(()->{
            for(int i=0; i<10; i++){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("t2:"+i);
            }
        });
        t1.start();
        t2.start();
    }
}
