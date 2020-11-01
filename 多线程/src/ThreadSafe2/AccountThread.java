package ThreadSafe2;

public class AccountThread extends Thread{
    private Account act;
    boolean run = true;
    public AccountThread(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
        //假设取款1001
        if (run) {
            act.withdraw(1001);
            System.out.println(Thread.currentThread().getName() + "还剩余额:" + act.getMoney());
        }else{
            Thread.yield();
            return;
        }
    }
}
