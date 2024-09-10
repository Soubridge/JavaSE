package org.morethread.threadsafe.waitandnotify;
/**
 * thread.Interrupt()之后程序还是正常运行的，也是可以进行wait()交锁的，此时会唤醒线程，将thread的中断状态改回false，但是会抛InterruptException错误
 * 同理，中断状态下join，sleep同样会触发该异常
 * 这也很好理解，既然中断状态改了，你的监视器就应该发现(并停止线程"活动")，那现在woc我wait线程的时候竟然没被阻拦，那说明并没有实际停止啊，那我就把状态改回来呗
 * */
public class InterruptWaitTest {
    public static void main(String[] args) {
        new Thread(()->{
            synchronized (Object.class){
                System.out.println("before:" + Thread.currentThread().isInterrupted());

                Thread.currentThread().interrupt();

                System.out.println("after Interrupt:" + Thread.currentThread().isInterrupted());

                try {
                    Object.class.wait();
                } catch (InterruptedException e) {
                    //throw new RuntimeException(e);
                    System.out.println("after wait:" + Thread.currentThread().isInterrupted());
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
