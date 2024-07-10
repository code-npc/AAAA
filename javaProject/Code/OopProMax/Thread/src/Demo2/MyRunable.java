package Demo2;

public class MyRunable implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("子线程1："+(i+1));
        }
    }
}
