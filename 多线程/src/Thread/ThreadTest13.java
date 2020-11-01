package Thread;

/*
线程合并
    public final void join()
                    throws InterruptedException
    等待该线程执行结束。
*/
public class ThreadTest13 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main begin");
        //尝试用匿名内部类
        Thread t = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i = 0; i < 100;i++){
                    System.out.println(Thread.currentThread().getName()+"--->"+i);
                }
            }
        });
        t.start();
        //合并线程
        t.join();//t合并到当前线程(主线程)中,当前线程(main)受阻塞.t线程执行直到结束.
        System.out.println("main over");

    }
}
class MyRunnable7 implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}