package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;//JUC包下，属于java的并发包，新特性

/*
实现线程的第三种方式：
    实现Callable接口
    优点：可以获取到线程的执行结果并返回值
    缺点：效率比较低。在获取t线程结果时，当前线程受阻塞，因此效率低较低。
*/
public class ThreadTest14 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //1.创建一个"未来任务类"对象
        //参数非常重要，需要给一个Callable接口实现对象
        FutureTask futureTask = new FutureTask(new Callable() {
            @Override
            //call方法相当于run方法，只是多了一个返回值
            public Object call() throws Exception {
                //模拟执行
                System.out. println("call method begin");
                Thread.sleep(1000*10);
                System.out.println("call method end");
                int a = 100;
                int b = 200;
                return a+b;//自动装箱(300结果变成Integer)
            }
        });
        //创建线程
        Thread t = new Thread(futureTask);
        //开启线程
        t.start();

        //这是在主线程中
        //如何在主线程获取t线程的返回结果呢?
        //结论：FutureTask会导致"当前线程阻塞"
        Object obj = futureTask.get();
        System.out.println("执行结果:"+obj);

        //main方法这里的程序要想执行必须等get方法结束
        //而get方法可能需要很久
        //因为get方法是为了拿t线程的执行结果
        //t线程的执行是要时间的
        System.out.println("Hello World");
    }
}
