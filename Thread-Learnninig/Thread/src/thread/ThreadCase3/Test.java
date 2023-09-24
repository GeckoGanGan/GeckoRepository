package thread.ThreadCase3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

            /*
            * 1、创建一个类实现Callable接口
            * 2、重写run方法
            * 3、创建实现类对象(任务)
            * 4、创建FutureTask对象，将实现类对象作为参数传递，管理任务的结果
            * 5、创建Thread对象，将ThreadTask对象作为参数传递
            * 6、调用start方法
            * */

        //创建任务对象
        MyCallable my = new MyCallable();
        //创建ThreadTask对象
        FutureTask<Integer> ts = new FutureTask<>(my);
        //创建线程对象
        Thread thread = new Thread(ts);
        thread.start();
        System.out.println(ts.get());

    }
}
