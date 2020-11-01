/**
 * Created by 15173 on 2020/3/5.
 */

/*
    抽象类:
        1.抽象类不一定有抽象方法,但抽象方法必须出现在抽象类中
        2.重要结论:(*****五颗星,必须记住)
            一个非抽象的类继承抽象类,必须将抽象类中的抽象方法实现了.
            这是java语法上强行规定的,必须的,不然编译器就报错了.

 */
public class AbstractTest02 {
    public static void main(String[] args) {
        //能不能对抽象类使用多态?能!
        //父类型引用指向子类型对象
        Animal a = new bird();//这就是面向抽象编程(向上转型)
        //以后都是调用a.xxx
        //a的类型是Animal,Animal是抽象的
        //面向抽象编程,不要面向具体编程,降低程序的耦合度,提高程序的扩展力.
        //这种编程思想符合OCP原则.

        /*
            分析以下:
                编译的时候这个move()方法是谁的? Animal
                运行的时候这个move()方法又是谁的? bird
        */
        a.move();
    }
}
//动物类(抽象类)
abstract class Animal{

    //抽象方法
    public abstract void move();
}

class bird extends Animal{

    //需要将从父类继承过来的抽象方法进行覆盖/重写,或者也叫做"实现"
    public void move() {
        System.out.println("鸟儿在飞翔");
    }
}

//如果子类是抽象类,抽象方法不需要重写/覆盖/实现
abstract class cat extends Animal{
}
/*
    分析:
        Animal是父类,并且是抽象类
        Animal这个抽象类中有一个抽象方法move();

        Bird是子类,并且是非抽象的.
        Bird继承Animal之后,会将抽象方法继承过来.
*/