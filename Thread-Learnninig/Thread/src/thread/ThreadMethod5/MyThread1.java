package thread.ThreadMethod5;

public class MyThread1 extends Thread{
    public MyThread1() {
    }

    public MyThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"------>MyThread1 running");
        }
    }
}
