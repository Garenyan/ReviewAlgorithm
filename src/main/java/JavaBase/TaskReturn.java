package JavaBase;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by garen on 2018/7/12.
 */
public class TaskReturn {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TaskReturn taskReturn = new TaskReturn();
        //创建一个线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        // 创建两个有返回值的任务
        Callable c1 = taskReturn.new MyCallable("A");
        Callable c2 = taskReturn.new MyCallable("B");

        List<Future> futures = new ArrayList<Future>();

        futures.add(executorService.submit(c1));
        futures.add(executorService.submit(c2));

        for (Future future : futures)
        {
            System.out.println(future.get().toString());
        }
        //ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();
    }

    class MyCallable implements Callable{
        private  String name;
        MyCallable(String name)
        {
            this.name = name;
        }

        public Object call() throws Exception {
            return name + "返回的内容";
        }
    }
}
