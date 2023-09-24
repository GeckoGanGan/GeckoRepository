package thread.ThreadCase2;

public class Test {
    public static void main(String[] args) {

        /*
        * 1、创建一个类实现Runnable接口
        * 2、重写run方法
        * 3、创建实现类对象
        * 4、创建Thread对象，将实现类对象作为参数传递
        * 5、调用start方法
        * */


        //创建任务对象
        Thread02 thread02 = new Thread02();
        //创建线程
        Thread thread1 = new Thread(thread02);
        thread1.setName("线程1");
        Thread thread2 = new Thread(thread02);
        thread2.setName("线程2");

        //开启线程
        thread1.start();
        thread2.start();
    }
}
