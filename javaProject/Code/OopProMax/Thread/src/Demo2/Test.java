package Demo2;

public class Test {
    public static void main(String[] args) throws Exception{
//        目标：掌握三种创建线程的方法
//        方式1：创建子类，让其继承Thread类，重现run方法，最后调用start方法，创建线程
//        Thread th = new MyThread1("自定义线程名字");
//        th.start();

        // 方式2： 创建子类重写runable接口，重写run方法，创建对应的任务对象 ，交给Thread对象处理，最后调用start方发，启动线程

//        Runnable target = new MyRunable();//创建任务对象
//        Thread th = new Thread(target);
//        th.start();
//        new Thread(target).start();
        // 方式2的匿名内部类方式写法。   更加简洁
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 3; i++) {
//                    System.out.println("子线程1："+(i+1));
//                }
//            }
//        }).start();

        // 由于以上两种方式，都无法获取线程的返回值，所以就有了，第三种创建线程的方法
        // 方式3： 创建子类，实现callable接口，重写call方法，创建FutureTask任务对象，
        /*Callable<String> mc = new MyCallable(100);
        FutureTask<String > ft = new FutureTask<>(mc);
        Thread th = new Thread(ft, "线程1");
        th.start();
        String name1 = th.getName();
        String s = ft.get();
        System.out.println(name1+ ":  " + s);


        Callable<String> mc1 = new MyCallable(200);
        FutureTask<String > ft1 = new FutureTask<>(mc1);
        Thread th1 = new Thread(ft1, "线程2");
        th1.start();
        String name11 = th1.getName();
        String s1 = ft1.get();
        System.out.println(name11+ ":  " + s1);*/



        String name = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(name+"："+i);
        }

    }

}
