package org.morethread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsTest {
    public static void main(String[] args) {
        //首先获得一个线程池对象executorService,用Executors.newFixedThreadPool(n)
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        //executorService.submit(Runnable task),需要向线程池提供Runnable接口的实现对象
        MyRunnable task = new MyRunnable();
        executorService.submit(task);
        executorService.submit(task);
        executorService.submit(task);
        //关闭线程池
        executorService.shutdown();
    }
}
