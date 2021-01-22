package 类锁_面试题.Exam01;

/*
面试题:doOther方法执行的时候需要等待doSome方法结束吗?
答案:不需要
*/
public class Exam01 {
    public static void main(String[] args) {
        Myclass mc = new Myclass();
        Thread t1 = new MyThread(mc);
        Thread t2 = new MyThread(mc);
        t1.setName("t1");
        t2.setName("t2");

        try {
            t1.start();
            Thread.sleep(1000);
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
    public  void doSome(){
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }

    public  void  doOther(){
        System.out.println("doOther begin");

        System.out.println("doOther over");
    }
}
