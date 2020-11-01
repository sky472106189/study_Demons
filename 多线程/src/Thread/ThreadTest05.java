package Thread;

/*
1.获取线程对象的名字
    线程对象.getName()
2.修改线程对象的名字
    线程对象.setName("线程名字")
3.怎么获取当前线程对象
    Thread t = Thread.currentThread()
    返回值t就是当前线程
4.线程没有设置名字,默认名字(了解)
    Thread-0
    Thread-1
    Thread-2
    ...
*/
public class ThreadTest05 {
    public static void main(String[] args) {
        //currentThread就是当前线程对象
        //出现在main方法中,当前线程就是主线程
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName()); //main

        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();
        //设置线程名字,不设置就是默认Thread-0
        t1.setName("ttt");
        //获取线程名字
        System.out.println(t1.getName());
        //启动两个线程
        t1.start();
        t2.start();//t2默认线程名Thread-1
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i<100;i++){
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
