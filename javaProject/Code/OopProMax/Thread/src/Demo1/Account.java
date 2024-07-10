package Demo1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private double cash;
    private Lock lock = new ReentrantLock();//获取锁对象
    public Account(double cash) {
        this.cash = cash;
    }

    public Account() {
    }

    public double getCash() {
        return cash;
    }


    public void setCash(double cash) {
        this.cash = cash;
    }

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }
}
