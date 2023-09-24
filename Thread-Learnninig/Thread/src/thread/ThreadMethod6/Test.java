package thread.ThreadMethod6;

public class Test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("线程1");
        MyThread t2 = new MyThread("线程2");


        t1.start();
        t2.start();
    }
}
