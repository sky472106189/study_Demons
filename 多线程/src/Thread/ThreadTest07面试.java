package Thread;

/*
关于Thread.sleep()方法的一个面试题
    问题:第11行的sleep会让线程mythread进入休眠状态吗
    解答:不会,11行的代码会让当前线程进入休眠,也就是说main方法进入休眠.
*/
public class ThreadTest07面试 {
    public static void main(String[] args) throws InterruptedException {
        Thread mythread = new Mythread3();
        mythread.start();

        //调用sleep方法
        mythread.sleep(5000);

        System.out.println("Hello World");

    }
}
class Mythread3 extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<10000;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
