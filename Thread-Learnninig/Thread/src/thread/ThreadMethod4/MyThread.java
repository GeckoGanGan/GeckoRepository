package thread.ThreadMethod4;

public class MyThread extends Thread{
    @Override
    public void run() {
        //线程要执行的方法
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName()+"------>MyThread running");
        }
    }
}
