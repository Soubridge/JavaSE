package org.morethread.basethread;
/**
 *守护线程用于做一些辅助工作(清理垃圾、监控状态),只要有存在一个用户线程在运行中，守护线程就不会停止
 * */
public class DaemonThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<20000000; i++){
                    System.out.println("守护线程:"+i);
                }
            }
        });
        t1.setDaemon(true);
        Thread t2 = new Thread(()->{
            for(int i=0; i<200000000; i++){
                System.out.println("用户线程:"+i);
            }
        });
        t1.start();
        t2.start();
    }
}
