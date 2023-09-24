package thread.ThreadCase2;

public class Thread02 implements Runnable{
    @Override
    public void run() {
        //线程要执行的方法
        //获取当前线程对象
        //Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"------>MyThread running");
        }
    }
}

