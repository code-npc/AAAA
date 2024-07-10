package Demo2;

public class MyThread1 extends Thread{
    public MyThread1(String name){
        super(name);
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(name+ " 子线程1："+(i+1));
        }
    }
}
