/*
1.有时候SUN公司自带的异常不够用,我们要学会自定义异常

2.java中如何自定义异常
    两步:
        第一步:编写一个类继承Exception或者RuntimeException
        第二步:提供两个构造方法,一个无参数,一个带有String参数的
        (死记硬背即可,八股文编程)
*/
public class DiyException01 extends Exception{ //编译时异常
    public static void main(String[] args) {
        //创建异常对象(只new了异常对象,并没有手动抛出)
        ExceptionMyself01 e1 = new ExceptionMyself01("用户名不能为空");

        //打印异常堆栈信息
        e1.printStackTrace();

        //获取异常简单描述信息
        String msg = e1.getMessage();
        System.out.println(msg);
    }
}

class ExceptionMyself01 extends Exception{
    public ExceptionMyself01(){}

    public ExceptionMyself01(String name){
        super(name);
    }
}