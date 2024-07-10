package Demo6;

import java.util.concurrent.*;

public class Demo6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 了解并使用线程池创建线程
/*参数列表：
            this(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue,
                    Executors.defaultThreadFactory(), defaultHandler);
                    */
        /*      参数1: 核心线程的数量
                参数2：最大线程数量
                参数3：临时线程存活时间
                参数4：临时线程存活时间的单位
                参数5：线程池的任务对垒
                参数6：线程池的线程工厂
                参数7：线程池的任务拒绝策略

                */
        ExecutorService es = new ThreadPoolExecutor(3,5,1
                ,TimeUnit.SECONDS,new ArrayBlockingQueue<>(4),Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        es.execute(() ->{
            {
                String name = Thread.currentThread().getName();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name+"执行了");
            }
        });

        Future<String> submit = es.submit(new Callable<String>() {

            @Override
            public String call() throws Exception {
                String name = Thread.currentThread().getName();
                return name+"执行了";
            }
        });

        System.out.println(submit.get());

        es.shutdown();

    }
}
