package 类锁_面试题.Exam04;

/*
面试题:doOther方法执行的时候需要等待doSome方法结束吗?
答案:需要,因为静态方法是类锁,不管创建了几个对象,类锁只有一把.
*/
public class Exam04 {
    static {
        System.out.println("我擦嘞");
    }
    public static void main(String[] args) {
        Myclass mc1 = new Myclass();
        Myclass mc2 = new Myclass();

        Thread t1 = new MyThread(mc1);
        Thread t2 = new MyThread(mc2);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}

class MyThread extends Thread{
    private Myclass mc;
    public MyThread(Myclass mc){
        this.mc = mc;
    }

    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("t1")){
            mc.doSome();
        }
        if(Thread.currentThread().getName().equals("t2")){
            mc.doOther();
        }
    }
}

class Myclass{
    //synchronized出现在静态方法上是 类锁.
    public synchronized static void doSome(){
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }

    public synchronized static void  doOther(){
        System.out.println("doOther begin");

        System.out.println("doOther over");
    }
}
