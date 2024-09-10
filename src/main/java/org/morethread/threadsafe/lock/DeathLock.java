package org.morethread.threadsafe.lock;
/**
 * 当出现以下顺序时：①线程1拿到s1锁、②线程2拿到s2锁、③线程1请求s2锁(此时s2锁被线程2占用..需等待s2结束)、④线程2请求s1锁(此时s1锁被线程1占用..需等s1结束)
 * 这样就照成s1、s2互等对面先释放资源，死锁
 * */
public class DeathLock {
    public static void main(String[] args) {
        String s1 = "s1";
        String s2 = "s2";

        new Thread(new Runnable() {
            @Override
            public void run(){
                while(true){
                    synchronized (s1){
                        System.out.println("线程1请求s1对象锁");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        synchronized (s2){
                            System.out.println("线程1请求s2对象锁.....................");
                        }
                    }
                }
            }
        },"线程1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (s2){
                        System.out.println("线程2请求s2对象锁");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        synchronized (s1){
                            System.out.println("线程2请求s1对象锁.....................");
                        }
                    }
                }
            }
        },"线程2").start();
    }
}
