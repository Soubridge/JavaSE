package org.morethread.threadsafe.waitandnotify;
/**
 * wait：让线程进入等待状态(执行权交给其他线程)、交出锁对象(其他非wait状态的同步代码就可以用这个锁对象了)
 * notify：把锁的使用权交给某个wait状态的同步代码块
 * 注意wait、notify的使用有两个限制条件：①必须在被同步的代码中、②使用的对象必须为同步该代码块的锁对象
 * 因为两个操作都是把锁交给其他的同步代码块，前提是自己得有锁，有的这把锁恰恰就是同步代码的对象锁
 * */
public class WaitThreadTest {
    public static void main(String[] args) {
        Shower shower = new Shower();
        new Thread(()->{
            try {
                shower.show1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(()->{
            try {
                shower.show2();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
