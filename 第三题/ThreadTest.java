package org.example;

import java.util.concurrent.locks.LockSupport;

public class ThreadTest {
    static Thread t1 = null,t2 = null;

    public static void main(String[] args) {
        int [] aI = {1,3,5,7,9};
        int [] ac = {2,4,6,8,10};
        t1 = new Thread(()->{
            for (Integer c : aI) {
                System.out.println(c);
                LockSupport.unpark(t2);//叫醒t2
                LockSupport.park();//t1阻塞
            }
        });

        t2 = new Thread(()->{
            for (Integer c : ac) {
                LockSupport.park();//t2阻塞
                System.out.println(c);
                LockSupport.unpark(t1);//叫醒t1
            }
        });
        t1.start();
        t2.start();
    }
}
