package Demo1;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class  MyThread extends Thread{
    private Account acc;
    private double money;
    private Lock lock;
    public MyThread(Account acc,String name,double money,Lock lock){
        super(name);
        this.acc = acc;
        this.money = money;
        this.lock = lock;
    }
    @Override
    public void run() {
        getMoney(acc,money);
    }

    private void getMoney(Account acc,double money) {


        String name = Thread.currentThread().getName();
        /*synchronized (acc) { //选择acc 作为同步锁，因为acc是唯一的，this并不唯一，所以不能使用
            if(money > acc.getCash()){
                System.out.println(name + " 余额不足！");
            }else {
                double a = acc.getCash() - money;
                System.out.println(name + "取钱成功，余额为："+ a);
                acc.setCash(a);
            }*/

        try {
            lock.lock();
            if(money > acc.getCash()){
                System.out.println(name + " 余额不足！");
            }else {
                double a = acc.getCash() - money;
                System.out.println(name + "取钱成功，余额为："+ a);
                acc.setCash(a);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}
