package thread.ThreadMethod6;

public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        //设置礼让线程
        Thread.yield();
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"------>MyThread running");
        }

    }
}
