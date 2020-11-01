package Thread;

/*
强行终止线程的执行
    stop()方法缺点:容易丢失数据,因为这种方式是直接将线程直接杀死了.
    线程没有保存的数据就会丢失,不建议使用
*/
public class ThreadTest09 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new MyRunnable3());

        //主线程休眠5秒后.终止t线程
        Thread.sleep(1000*5);
        //终止t线程
        //t.stop();已过时,不建议使用

    }
}
class MyRunnable3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
            try {
                Thread.sleep(1000 * 1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
