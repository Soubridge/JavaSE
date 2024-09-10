package org.morethread.basethread;
/**
 * 输出的是MyThread和main交替，myThread中run的内容、main中的两个是同时进行的
 * 线程可以使用全局静态变量(main方法外的、资源)，如果想用main方法内的，只能用final变量，不能更改值
 * */
public class ThreadTest {
    static int num = 0;
    public static void main(String[] args) {
//        MyThread myThread = new MyThread("初体验线程");
//        myThread.start();     //thread.start()在此处开启一条新的线程，和main线程争夺执行权
//        System.out.println(myThread.getName());
//
//        for(int i=0; i<1000; i++){
//            System.out.println("main...");
//        }

        //匿名内部类
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("用匿名内部类搞了一个runnable接口的实现");
//            }
//        };
//        //lambda表达式，这里甚至不需要new runnable接口
//        Runnable runnable = ()->{
//            System.out.println("这才是lambda表达式创建的runnable接口实现");
//        };
//        MyThread myThread = new MyThread(runnable);
//        myThread.start(); //注意：调用MyThread的重写后的run方法
//        System.out.println(myThread.getName());

//        final int nums = 0;
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(200);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                num = 1;   //注意num的声明
//            }
//        });
//        t1.start(); //t1线程被阻塞了，但是main用的线程正常运行，可以用.jion解决，先让t1执行完，不过这样是不是失去了多线程的意义？
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(num);


    }
}
