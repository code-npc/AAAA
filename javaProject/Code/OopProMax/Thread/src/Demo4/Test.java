package Demo4;

public class Test {
    public static void main(String[] args) {
        //线程通信，这是一个模拟生产者消费者的模型
        Desk desk = new Desk();

        //创建三个厨师线程，两个吃货线程
        // 这里用runnable的匿名内部类的方法创建线程对象

        new Thread(()-> {
            {
                while (true) {
                    desk.put();
                }
            }
        },"厨师1").start();

        new Thread(()-> {
            {
                while (true) {
                    desk.put();
                }
            }
        },"厨师2").start();

        new Thread(()-> {
            {
                while (true) {
                    desk.put();
                }
            }
        },"厨师3").start();

        new Thread(()-> {
            {
                while (true) {
                    desk.get();
                }
            }
        },"吃货1").start();

        new Thread(()-> {
            {
                while (true) {
                    desk.get();
                }
            }
        },"吃货2").start();
    }
}
