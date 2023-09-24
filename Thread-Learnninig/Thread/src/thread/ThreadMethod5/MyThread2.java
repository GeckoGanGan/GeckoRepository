package thread.ThreadMethod5;

public class MyThread2 extends Thread{
    public MyThread2() {
    }

    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            //Thread.currentThread()获取当前线程对象
            System.out.println(Thread.currentThread().getName()+"------>MyThread2 running");
        }
    }
}
