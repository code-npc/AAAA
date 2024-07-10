package Demo1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        // 小红和小明两个线程，同时从共享账户Account中取钱，会发现，出现了线程安全问题。
        // 如何解决线程安全问题？
        // 有三种解决方案：
        // 方案一： 同步代码快
        // 方案二： 同步方法
        // 方案三： Lock锁

        Account acc = new Account(100000);
        Thread xh = new MyThread(acc,"小红：",100000,acc.getLock());
        xh.start();
        Thread xm = new MyThread(acc,"小明：",100000,acc.getLock());
        xm.start();


        Account acc1 = new Account(100000);
        Thread xh1 = new MyThread(acc,"小黑：",100000,acc1.getLock());
        xh1.start();
        Thread xm1 = new MyThread(acc,"小白：",100000,acc1.getLock());
        xm1.start();
    }
}
