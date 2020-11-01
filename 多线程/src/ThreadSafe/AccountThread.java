package ThreadSafe;

public class AccountThread extends Thread{

    private Account act;

    public AccountThread(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
        //假设取款50
        act.withdraw(50);
        System.out.println(Thread.currentThread().getName()+"还剩余额:"+act.getMoney());
    }
}
