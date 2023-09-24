package thread.ThreadMethod4;

public class Test {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();
//
//        t1.start();
//        t2.start();
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());

    }
}
