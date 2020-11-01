package Thread;

/*
合理的终止线程执行
*/
public class ThreadTest10 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable4 r = new MyRunnable4();
        Thread t = new Thread(r);
        t.start();

        //主线程5秒后终止支线程t
        Thread.sleep(1000*5);

        r.run = false;
    }
}
class MyRunnable4 implements Runnable{

    boolean run = true;
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            if(run) {
                System.out.println(Thread.currentThread().getName() + "--->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else
                //终止当前线程.
                return;
        }
    }
}
