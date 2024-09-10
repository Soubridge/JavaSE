package org.morethread.basethread;
/**
 * 中断线程只是将线程的中断状态设置为true，并没有停止线程运行，可以通过isInterrupt()获取线程中断状态来停止线程运行
 * 线程的中断状态默认为false，可以用thread.interrupt()方法将其改为true
 * thread.isInterrupted()仅返回中断状态，thread.interrupted()返回当前中断状态并重置为false
 * */
public class InterruptThread {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                while(true){
                    //获取线程状态
                    boolean interrupted = Thread.currentThread().isInterrupted();
                    if(interrupted){
                        System.out.println("线程中断状态【" + interrupted + "】...");
                        System.out.println("释放资源...");
                        break;
                    }else{
                        System.out.println("线程中断状态【" + interrupted + "】...");
                    }
                }
            }
        },"t1");
//        t1.start();
//        System.out.println(t1.isInterrupted());
//        t1.interrupt();
//        System.out.println(t1.isInterrupted());

//        t1.start();
//        Thread.sleep(1);  //这里先把main线程睡1ms,让t1线程正常跑,然后
//        t1.interrupt();


    }
}
