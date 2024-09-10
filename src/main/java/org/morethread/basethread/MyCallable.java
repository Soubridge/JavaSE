package org.morethread.basethread;
/**
 * 不同于Runnable类，Callable针对的是有返回值的任务
 * 需要将任务用FutureTask类封装，然后new Thread(task)交付给线程运行
 * 结果可以用task.get()获取【其实我感觉跟线程要更合理，这里是跟Future实例要的，应该是运行完线程把结果给了Future实例task】
 * */
import java.util.concurrent.Callable;

public class MyCallable implements Callable {

    @Override
    public String call() throws Exception {
        for(int i=0; i<1000; i++){
            System.out.println(Thread.currentThread().getName() + "【" + i + "】");
        }
        return "执行任务成功";
    }
}
