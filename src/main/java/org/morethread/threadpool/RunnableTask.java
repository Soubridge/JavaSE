package org.morethread.threadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableTask {
    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //注意线程池.submit()是有返回值的
        Future<?> runnableTask = executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("任务执行完毕...");
            }
        });

        Object result = runnableTask.get();

        System.out.println("结果集为：" + result);

        executorService.shutdown();
    }




}
