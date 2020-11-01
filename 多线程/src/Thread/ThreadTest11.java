package Thread;

/*
关于线程的优先级
       实例方法:
             void setPriority(int newPriority) 设置线程的优先级
             int getPriority() 获取线程优先级
             最低优先级1,默认优先级是5,最高优先级是10;
             注意:优先级比较高的获取CPU时间片可能多一些,但也不完全是.
*/
public class ThreadTest11 {
    public static void main(String[] args) {
        System.out.println("最高优先级"+Thread.MAX_PRIORITY);
        System.out.println("最低优先级"+Thread.MIN_PRIORITY);
        System.out.println("默认优先级"+Thread.NORM_PRIORITY);

        //获取当前线程对象的优先级
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName()+"线程的优先级"+currentThread.getPriority());

        Thread t = new Thread(new MyRunnable5());
        t.start();
    }
}
class MyRunnable5 implements Runnable{
    @Override
    public void run() {
        //获取线程优先级
        System.out.println(Thread.currentThread().getName()+"线程的优先级"+Thread.currentThread().getPriority());
    }
}
