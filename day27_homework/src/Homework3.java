import java.util.ArrayList;
import java.util.List;

/*
使用生产者和消费者模式实现，交替输出：
    假设只有两个线程,输出以下结果:
        t1->1
        t2->2
        t1->3
        t2->4
        ...
    要求:交替输出，并且t1线程负责输出奇数,t2线程负责输出偶数
*/
public class Homework3 {
    public static void main(String[] args) {
        Num num = new Num();
        num.setI(2);

        Thread t1 = new Thread(new thread1(num));
        Thread t2 = new Thread(new thread2(num));
        t1.setName("t1奇数线程");
        t2.setName("t2偶数线程");

        t1.start();
        t2.start();

    }
}
//t1线程，负责奇数
class thread1 implements Runnable{
    private Num num;

    public thread1(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while(true){
            synchronized (num){
                if(num.i%2!=0){
                    //输出
                    System.out.println(Thread.currentThread().getName()+"-->"+num.i);
                    num.i++;
                    try {
                        //输出了之后就唤醒t1奇数线程
                        num.notify();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //执行到这,说明是偶数,开始沉睡
                    try {
                        num.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

//t2线程，负责偶数
class thread2 implements Runnable{
    private Num num;

    public thread2(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while(true){
            synchronized (num){
                if(num.i%2==0){
                    //输出
                    System.out.println(Thread.currentThread().getName()+"-->"+num.getI());
                    num.setI(num.getI()+1);
                    try {
                        //输出了之后就唤醒
                        num.notify();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //执行到这,说明是偶数，沉睡
                    try {
                        num.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
class Num{
    static int i;

    public void setI(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }
}
