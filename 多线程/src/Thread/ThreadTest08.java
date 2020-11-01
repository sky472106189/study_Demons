package Thread;

/*
终止线程的睡眠.sleep
*/
public class ThreadTest08 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new MyRunnable2());
        t.start();

        //希望5秒之后,t线程醒来
        Thread.sleep(1000*5);
        //终止t线程睡眠(依靠的java异常处理机制)
        t.interrupt();

    }
}
class MyRunnable2 implements Runnable{
    //重点:run()方法中的异常,不能throws,只能try catch
    //因为run()方法在父类中没有抛出任何异常,子类不能比父类抛出更多的异常.
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--->begin");
        //睡眠1年
        try {
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"--->end");

    }
}
