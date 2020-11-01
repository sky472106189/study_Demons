package 装饰者模式;

public class B extends A{
    //重写代码,但是请注意:在原代码的基础之上扩展.
    //不推荐的方式:继承.
    public void m1(){
        System.out.println("扩展代码1");
        super.m1();//用super保证原代码的基础
        System.out.println("扩展代码2");
    }
}
