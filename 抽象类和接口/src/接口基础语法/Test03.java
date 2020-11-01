package 接口基础语法;

/*
    接口和接口之间支持多继承,那么一个类可以同时实现多个接口吗?

        对于计算机来说,一个机箱上有多个接口,一个接口是键盘的,
        一个接口是鼠标的,一个接口是电源的,一个接口是显示器的......

    重点(*****):一个类可以同时实现多个接口.

    这种机制弥补了java中的哪个缺陷?
        java中类和类只支持单继承.实际上单继承是为了简单而出现的.
        现实世界中多继承,java中的接口弥补了单继承带来的缺陷.

    之前有一个结论:
        无论向上转型还是向下转型,两种类型之间必须要有继承关系,
        没有继承关系编译器会报错.(这句话不适用于接口)
        最终实际上和之前还是一样,需要加instanceof运算符进行判断
        向下转型养成好习惯:转型之前先if+instanceof进行判断.

*/
public class Test03 {
    public static void main(String[] args) {
        //多继承的多态用法
        A1 a = new D1();
        B1 b = new D1();
        C1 c = new D1();

        a.m1();
        //直接a.m2();会报错,因为a只能在编译阶段读取A1中的方法,但是m2在编译阶段是B1接口的方法,所以需要强转

        //但是要注意:接口和接口之间在进行强制类型转换的时候,没有继承关系,也可以强转.
        //运行的时候可能报错:ClassCastExcepetion异常.
        if (a instanceof B1) {
            B1 b1 = (B1) a;
            b1.m2();
        }
        K k1 = (K) a; //运行报错,ClassCastException.因为接口K和类D1没有实现关系

    }
}
interface A1{
    void m1();
}
interface B1{
    void m2();
}
interface C1{
    void m3();
}
interface K{
}
class D1 implements A1,B1,C1{
    //非抽象的类实现接口(接口中的方法都是抽象方法)
    //抽象方法不能存在于非抽象类中
    //所以要全部覆盖
    @Override
    public void m1() {
    }

    @Override
    public void m2() {
        System.out.println("m2.....");
    }

    @Override
    public void m3() {
    }
}