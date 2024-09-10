package org.morethread.basethread;
/**
 * thread.priority()并不是10比1必定优先执行，只不过是个优先级而已
 * [类方法]同样Thread.Yield()也是将线程礼让出去，但是若是没有其他线程用执行权可能还会回来
 * */
public class PriorityAndYieldTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0; i<1000; i++){
                    System.out.println("线程1：" + i);
                    //if(i == 10) Thread.yield();
                }
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0; i<1000; i++){
                System.out.println("线程2：" + i);
            }
        });
//        t1.setPriority(1);
//        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
