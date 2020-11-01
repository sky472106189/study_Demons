package Thread;

/*
让位:当前线程暂停,回到就绪状态.
        静态方法:
             static void yield()
             暂停当前正在执行的线程对象,并执行其他线程
             此方法不属于阻塞.让当前的线程让位.让给其他线程使用
             yield()方法的执行会让当前线程从"运行状态"回到"就绪状态"
             注意:在回到就绪状态之后,有可能还会再次抢到
*/
public class ThreadTest12 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable6());
        t.start();

        for(int i = 1;i<=10000;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
class MyRunnable6 implements Runnable{
    @Override
    public void run() {
        for(int i = 1;i<=10000;i++){
            //每100个让位一次
            if(i%100==0){
                Thread.yield();//当前线程暂停,让给主线程
            }
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
