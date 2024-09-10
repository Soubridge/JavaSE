package org.morethread.threadsafe.synchronizeds;
/**
 * 多个任务对同一资源的写操作造成的安全性问题
 * 为什么会不安全：具体在这个例子里，可能在打印完 还未--时,执行权就被抢走了，造成其他线程拿到线程是未--的状态，导致同一张票被被卖了两次
 * 如果能保证造成不安全的几步(打印【回复执行状态】+改变量)是一个线程一口气完成的，这样就不会出错了，这就是Hi同步代码块思想
 * */
public class Ticket implements Runnable{
    private Integer tickets = 1000;
    private Object obj = new Object();

    @Override
    public void run(){
        while(true){
            //synchronized(){}
            synchronized (obj){
                if(tickets <= 0) break;
                System.out.println(Thread.currentThread().getName() + "正在卖第：" + (1001-tickets) + "张票");
                tickets--;
            }
        }
    }
}
