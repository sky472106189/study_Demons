package ThreadSafe3;

/*
银行账户
    在实例方法上使用 synchronized 修饰

    缺点:1.synchronized 出现在实例方法上,一定锁的是this
    所以这种方式不灵活.
         2.synchronized 出现在实例方法体上,表示整个方法都需要同步.
    可能会无故扩大同步的范围,导致程序的执行效率降低,所以这种方式不常用.

    优点:代码写得少,节俭了.

*/
public class Account {
    private String actno;
    private double money;

    //取款方法
    public synchronized void withdraw(double money) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if ((this.getMoney() - money) >= 0) {
            this.setMoney(this.getMoney() - money);
        }
        else
            System.out.println("余额不足");
    }

    //存款方法
    public void saveMoney(double money){
        this.setMoney(this.getMoney()+money);
    }

    @Override
    public String toString() {
        return "账户:"+this.getActno()+",余额:"+this.getMoney()+".";
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Account(String actno,double money) {

        this.actno = actno;
        this.money = money;
    }

    public Account() {

    }
}
