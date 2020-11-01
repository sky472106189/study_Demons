package ThreadSafe;
/*
测试类
没使用线程同步机制,多线程对同一个账户进行取款,出现线程安全问题.
*/
public class Test {
    public static void main(String[] args) {
        Account act = new Account("1",1000);

        //开启两个线程,操作同一个数据
        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}
