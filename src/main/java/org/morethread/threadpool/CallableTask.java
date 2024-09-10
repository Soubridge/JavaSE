package org.morethread.threadpool;

import java.util.concurrent.*;

public class CallableTask {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<String> callableTask = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(2000);
                return "callableTask is return...";
            }
        });
        String result = callableTask.get();
        System.out.println("结果集为：" + result);
        executorService.shutdown();
    }
}
