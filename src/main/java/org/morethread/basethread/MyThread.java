package org.morethread.basethread;
/**
 * 初体验，将任务封在Thread类的run方法中
 * */
public class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public MyThread(Runnable runnable){
        super(runnable,"在初始化myThread时，给了名字(父类Thread本来就有的属性)");
        System.out.println("在初始化时返回父类的名字"+super.getName());
    }
//    @Override
//    public void run(){
//        for(int i=0; i<1000; i++){
//            System.out.println("MyThread...");
//        }
//    }
}
