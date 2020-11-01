package 接口基础语法;

/*
    接口的基础语法
        1.类和类之间叫做继承,接口和类之间叫做实现.
        别多想:你仍然可以将"实现"看做"继承".
        继承使用extendes关键字完成
        实现使用implements关键字完成

        2.(*****)当一个非抽象的类实现接口的话,必须将接口中的所有
        抽象方法全部实现(覆盖/重写)

        3.接口中的方法都是抽象的,只存在常量,不存在变量
*/
public class Test02 {
    public static void main(String[] args) {
        //错误:MyMath_1是抽象的;无法实例化
        //new MyMath();

        //能使用多态吗?可以.
        MyMath_1 m1 = new MyMathImp1(); //编译的时候用的接口,运行的时候用的对象
        //调用接口里面的方法(面向接口编程)
        int result1 =m1.sub(10,20);
        System.out.println(result1);
        int result2 =m1.sum(10,20);
        System.out.println(result2);

    }
}

//接口=特殊的抽象类=完全抽象的
interface MyMath_1{
    double PI = 3.1415926;
    int sum(int a,int b);
    int sub(int a,int b);
}
//编写一个非抽象类
//一个非抽象的类继承抽象类,必须将抽象类中的抽象方法实现了.
class MyMathImp1 implements MyMath_1{

    //以下是错误的,正在尝试分配更低的访问权限;以前为public
    //因为在父类中sum是public的,继承实现sum方法必须更开放(public已是最开放)
/*    int sum(int a, int b) {
        return a+b;
    }*/

    //必须重写/覆盖/实现接口中的所有方法(通常叫实现)
    public int sum(int a, int b) {
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }
}

//抽象类实现接口,因为接口中的方法都是抽象的,所以不需要重写.
abstract class MyMathImp2 implements MyMath_1{

}