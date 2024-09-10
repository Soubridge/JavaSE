package org.morethread.basethread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableThreadTest {
    public static void main(String[] args) throws Exception{
        MyCallable myCallable = new MyCallable();

        FutureTask<String> task1 = new FutureTask<>(myCallable);
        FutureTask<String> task2 = new FutureTask<>(myCallable);

        FutureTask<String> task3 = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "直接这样写也没啥问题、因为是函数式接口，甚至可以用lambda表达式也可以";
            }
        });

        new Thread(task1).start();
        new Thread(task2).start();

        Object result_1 = task1.get();
        Object result_2 = task2.get();

        System.out.println("执行结果：【" + result_1 + "】");
        System.out.println("执行结果：【" + result_2 + "】");
    }
}
