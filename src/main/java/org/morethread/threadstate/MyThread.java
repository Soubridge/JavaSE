package org.morethread.threadstate;

public class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println(this.getName() + ": start...");
        System.out.println(this.getName() + ": end...");
    }
}
