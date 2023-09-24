package thread.ThreadMethod5;

public class Test {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("女神");
        MyThread2 t2 = new MyThread2("备胎");

        //设置守护进程
        t2.setDaemon(true);

        t1.start();
        t2.start();



    }
}
