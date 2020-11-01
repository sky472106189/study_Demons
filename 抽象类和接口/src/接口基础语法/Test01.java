package 接口基础语法;

/**
 * Created by 15173 on 2020/3/5.
 */

/*
    接口:
        1,接口也是引用数据类型
        2.接口是完全抽象的,(抽象类是半抽象的)也可以说接口是特殊的抽象类.
        3.接口怎么定义?语法是什么?
            [修饰符列表] interface 接口名{}
        4.接口支持多继承,一个接口可以继承多个接口
        5.接口中值只包含两部分内容,一部分是常量,另一部分是抽象方法.
        6.接口中所有元素都是public修饰的.(都是公开的)
        7.接口中定义抽象方法时,public abstract 可以省略
        8.接口中的方法都是抽象方法,所以接口中的方法不能有方法体
        9.接口中的常量public static final 可以省略.
*/
public class Test01 {
    public static void main(String[] args) {
        System.out.println(MyMath.Pi);
    }
}
//定义接口
interface A{
}
interface B extends A {
}
//接口支持多继承
interface C extends A,B{
}
//我的数学接口
interface MyMath{

    //常量
    public static final double PI = 3.1415926;
    //public static final 可以省略
    double Pi = 3.1415926;

    //抽象方法
    public abstract void sum(int n1,int n2);

    //接口当中既然都是抽象方法,那么在编写代码的时候,public abstract 能否省略?
    int sum1(int a ,int b);

    //接口中的方法可以有方法体吗?
    //错误:接口抽象方法不能带有主体
/*    void dosome(){

    }*/
}