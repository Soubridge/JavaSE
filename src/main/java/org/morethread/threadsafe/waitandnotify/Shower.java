package org.morethread.threadsafe.waitandnotify;

public class Shower {
    int count = 1;
    public void show1() throws InterruptedException{
        for(int i=0; i<100; i++){
            synchronized (Object.class){
                while(count == 1){
                    Thread.sleep(10);
                    System.out.print("犯");
                    System.out.print("我");
                    System.out.print("中");
                    System.out.print("华");
                    System.out.print("者");
                    System.out.println();
                    count = 2;
                    Object.class.notify();    //先把其他随便一个线程叫醒，避免wait之后无线程执行
                }
                synchronized (String.class){
                    System.out.println("线程1请求等待,交出执行权");
                    Object.class.wait();
            }

            }
        }
    }

    public void show2() throws InterruptedException{
        for(int i=0; i<100; i++){
            synchronized (Object.class){
                while(count == 2){
                    Thread.sleep(10);
                    System.out.print("虽");
                    System.out.print("远");
                    System.out.print("必");
                    System.out.print("诛");
                    System.out.println();
                    count = 1;
                    Object.class.notify(); //也有可能把线程1一叫醒执行权就被线程1抢走了，但是这有什么关系呢？，本来也是通过wait线程2给线程1的，只不过少了wait步骤而已
                }

                synchronized (Integer.class){   //如果这里也是String.class就会死锁，因为我想拿String.class的锁，但是这把锁被一个正处于wait的线程拿着
                    System.out.println("线程2请求等待,交出执行权");
                    Object.class.wait();
                }
            }
        }
    }
}
