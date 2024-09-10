package org.morethread.basethread;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo {
    public static void main(String[] args) throws Exception{
        sync();
        async();
    }

    public static void async() throws ExecutionException, InterruptedException {
        long startTime = System.currentTimeMillis();
        Api api = new Api();
        FutureTask<String> task1 = new FutureTask<String>(new Callable<String>() {
            @Override
            public String call(){
                return api.sendMessage();
            }
        });
        FutureTask<String> task2 = new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() {
                return api.upload();
            }
        });
        new Thread(task1).start();
        new Thread(task2).start();

        System.out.println(task1.get());
        System.out.println(task2.get());

        System.out.println("异步花费时间：" + (System.currentTimeMillis()-startTime));
    }
    public static void sync() {
        //同步调用
        long startTime = System.currentTimeMillis();
        Api api = new Api();

        String msgResult = api.sendMessage();
        String ulResult = api.upload();

        System.out.println("发送短信：【" + msgResult + "】");
        System.out.println("上传文件：【" + ulResult + "】");

        System.out.println("同步花费时间：" + (System.currentTimeMillis()-startTime));
    }

}
