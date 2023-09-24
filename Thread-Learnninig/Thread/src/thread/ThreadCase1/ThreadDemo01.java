package thread.ThreadCase1;

public class ThreadDemo01 {
    public static void main(String[] args) {
        /*
        * 创建线程的第一种方式
        * 1、创建一个类，继承Thread类
        * 2、重写run方法
        * 3、创建子类对象，调用start方法
        * */
        MyThread thread1 = new MyThread();
        thread1.setName("thread1");
        MyThread thread2 = new MyThread();
        thread2.setName("thread2");
        thread1.start();
        thread2.start();
    }
}
