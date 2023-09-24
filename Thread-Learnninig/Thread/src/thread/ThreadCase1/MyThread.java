package thread.ThreadCase1;

public class MyThread extends Thread{
    @Override
    public void run() {
        //线程要执行的方法
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"------>MyThread running");
        }
    }
}
