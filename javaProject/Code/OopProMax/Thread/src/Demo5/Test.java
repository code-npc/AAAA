package Demo5;

public class Test {
    /**
     * 不会写，有点难写！！！！！
     * @param args
     */
    public static void main(String[] args) {
        // 模拟读者和写者问题，利用线程通信完成
        // 要求：
        // 允许多个读者可以同时对文件执行读操作。
        //只允许一个写者往文件写信息。
        //任一写者在完成写操作之前不允许其他读者或写者工作。
        //写者执行写操作前，应该让已有的读者或者写者全部退出。
        OnlyFile of = new OnlyFile();

        new Thread(() -> {
            {
                while (true) {
                    of.read();
                }
            }
        }, "读者1").start();

        new Thread(()->{
            {
                while (true) {
                    of.read();
                }
            }
        },"读者2").start();

        new Thread(()->{
            {
                while (true) {
                    of.read();
                }
            }
        },"读者3").start();

        new Thread(()->{
            {
                while (true) {
                    of.write();
                }
            }
        },"写者1").start();

        new Thread(()->{
            {
                while (true) {
                    of.write();
                }
            }
        },"写者2").start();
    }
}
