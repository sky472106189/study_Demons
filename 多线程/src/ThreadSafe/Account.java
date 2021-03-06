package ThreadSafe;

/*
银行账户
*/
public class Account {
    private String actno;
    private double money;

    //取款方法
    public void withdraw(double money){
        if ((this.getMoney() - money)>=0)
            this.setMoney(this.getMoney() - money);
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
