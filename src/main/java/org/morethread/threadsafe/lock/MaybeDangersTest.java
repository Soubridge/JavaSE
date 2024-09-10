package org.morethread.threadsafe.lock;
/**
 *ArrayList是先执行完存数在size++【element[size++]=e】,若在存完数还未来得及size++线程的执行权就被抢走，若这时候正好在扩容的临界状态
 *虽然满了，但是没执行size++，下次加入的时候就会没扩容硬加，导致会出现数组越界的情况出现
 * 线程不安全：ArrayList\LinkList\HashMap
 * 线程安全：vector\stack\hashtable
 * */
import java.util.ArrayList;

public class MaybeDangersTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<100; i++){
            new Thread(()->{
                for(int ii=0; ii<100; ii++){
                    list.add(1);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();
        }
    }
}
