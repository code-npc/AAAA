package Demo4;

import java.util.ArrayList;
import java.util.List;

public class Desk {
    private List<String > list = new ArrayList<>();

    public synchronized void put() {
        String name = Thread.currentThread().getName();
        try {
            if (list.size()==0){
                list.add(name+ "做的包子");
                System.out.println(name+ "做了个包子");
                Thread.sleep(3000);
                this.notifyAll();
                this.wait();
            }else {
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void get() {
        String name = Thread.currentThread().getName();
        try {
            if (list.size()==1){
                System.out.println(name+"吃掉了"+list.get(0));
                Thread.sleep(2000);
                list.clear();
                this.notifyAll();
                this.wait();
            }else {
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
