package ThreadSafe2;

/*
银行账户(使用线程同步机制)
    线程同步机制的语法:
        synchronized(){
            //线程同步代码块.
        }
        synchronized后面小括号中的数据相当关键.
        这个数据必须是多线程共享的数据,才能达到多线程排队.

        ()小括号写什么
            那要看你想让哪些线程同步
            假设有t1,t2,t3,t4,t5,5个线程,
            你只需要t1,t2,t3排队,t4,t5不需要排队,怎么办?
            你一定要在()中写一个t1,t2,t3共享的对象.而这个
            对象对于t4,t5来说不是共享的.

    在java语言中,任何一个对象都有"一把锁",其实这把锁就是标记.(只是把它叫做锁)
    100个对象,100把锁,1个对象1把锁.

    以下代码的执行原理?
        1.假设t1和t2线程并发,开始执行以下代码的时候,肯定有一个先一个后.
        2.假设t1先执行了,遇到了synchronized,这个时候自动找"后面共享对象"的对象锁.
        找到之后,并占有这把锁,然后锁定执行同步代码块中的程序,在程序执行过程中,一直
        都是占有这把锁的.直到同步代码块结束,这把锁才会释放.
        3.假设t1已经占有这把锁,此时t2也遇到synchronized关键字,也会去占有后面共享
        对象的这把锁,结果这把锁被t1占用,t2只能在同步代码块外面等待t1结束,直到t1把
        同步代码块执行结束了,t1会归还这把锁,此时t2终于等到这把锁,然后t2占有这把锁
        之后,进入同步代码块执行程序.

        这样就达到了线程排队执行,线程同步机制.
        这里需要注意的是:这个共享对象一定要选好了.这个共享对象一定是你需要排队执行的
        这些线程对象所共享的.

*/
public class Account {
    private String actno;
    private double money;
    private AccountThread accountThread;
    Object o1 = new Object();

        /*
        这里的共享对象:账户对象
        账号对象是共享的,那么this就是账户对象
        */
    //取款方法
    public void withdraw(double money){
        Object o2 = new Object();
        synchronized (this) {
            //synchronized (o1) { 没问题
            //synchronized (o2) { 不可以 o2是局部变量,不是共享的
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (this.getMoney() - money >= 0) {
                this.setMoney(this.getMoney() - money);
            }
            else{
                System.out.println("余额不足");
            }

        }

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
