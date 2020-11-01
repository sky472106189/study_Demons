package Thread;

/*
阻塞状态
关于线程的sleep方法
    static void sleep(long millis)
    1.静态方法
    2.参数是毫秒
    3.作用:让当前线程进入休眠,进入"阻塞状态",放弃当前占有CPU片,让给其他线程使用.
        这段代码运行在A线程,A线程就会进入休眠;
        这段代码运行在B线程,B线程就会进入休眠;
    4.Thread.sleep()
        间隔特定的时间,去执行一段特定的代码,每隔x时间执行一次
*/
public class ThreadTest06 {
    public static void main(String[] args) throws InterruptedException {
        //当前线程休眠5秒
        Thread.sleep(2000);
        //5秒之后执行
        System.out.println("hello world");

        for(int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"---->"+i);
            Thread.sleep(1000);
        }
    }
}
