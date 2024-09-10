package org.morethread.threadstate;
/**
 * New: 线程被创建还未.start()
 * Runnable: 可运行状态(此刻正运行 or 只要拿到时间片就可运行)
 * Blocked: Runnable->Blocked(线程拿到时间片了，但被锁对象权不在自己手里，故状态改变)，Blocked->Runnable(有锁权的线程调用了锁对象.wait把对象锁交出来，正好被自己拿到了)
 *          若有锁权的线程wait了，会有一众的Blocked状态的线程竞争锁权，只有拿到锁对象权的才会变回Runnable状态
 * Waiting: ①Object.class.wait(不带时间版) ②thread.join(不带时间版) ③LockSupport.park()
 *          ①wait不带时间，先当于把锁对象权让出去了，自己是Waiting状态，比Bocked优先级还低，只能是有某个有锁对象权的用.notify给它从Wait改成Blocked，参与拿锁权竞争
 *          ②thread.join(),让thread先运行完本线程由Waiting->Runnable，如果join在同步代码块中进行，也是会释放锁的，不过释放的特制thread.join()中的对象thread的锁权【注意：如果锁thread.join的和thread中的锁是相同的锁，且不是thread，这个锁不会被释放且死锁死锁】
 *          ③LockSupport.park() 线程体内运行LockSupport.park()时，线程由Runnable->Waiting，在其他线程执行LockSupport.unpark(thread)时，由Waiting->Runnable
 * Timed Waiting: ①Object.class.wait(带时间版) ②Thread.sleep(默认带时间) ③Thread.join(带时间版)
 *                进入Timed Waiting状态，需要等待时间结束等系统自动唤醒
 * Terminated:线程体运行完成 or 异常终止
 * */
public class StateThread {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread t1 = new Thread("t1"){
            @Override
            public void run(){
                synchronized (String.class){
                    //线程t1睡眠500ms后wait交对象锁权
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        String.class.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread t2 = new Thread("t2"){
            @Override
            public void run(){
                synchronized (String.class){
                    while(true){
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        String.class.notify();
                    }
                }
            }
        };
        t1.start();
        t2.start();
        //Thread.sleep(10);
        //俩线程刚启动，t1正常启动还没进入sleep，查它的状态是Runnable，如果睡眠再查就是Timed_Waiting
        //           t2拿到时间片，运行发现没有String.class的对象锁权，t2线程自动变成Blocked对象锁阻塞状态，即使t1 sleep也不会交出对象锁权
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        Thread.sleep(520);
        //500ms时t1wait交锁对象权变为Waiting状态，t2获得锁对象权进入Runnable运行状态
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        Thread.sleep(500);
        //t2用了String.class对象的notify，将t1从Waiting状态解救出来，
        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }
}
