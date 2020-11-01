package 接口基础语法;

import java.awt.datatransfer.FlavorListener;

/*
    继承和实现都存在的话,代码应该怎么写?
        extends 关键字在前
        implements 关键字在后

*/
public class Test04 {
    public static void main(String[] args) {
        //创建对象(表面看Animal类没起作用)
        Flyable f = new Cat();//多态
        f.fly();

        //同一个接口
        Flyable f2 = new pig();
        f2.fly();//调用用一个fly()方法,最后的执行效果不同
    }
}

//动物类,父类
class Animal{

}

//可飞翔的接口(是一对翅膀)
//能插拔的就是接口.(没有接口怎么插拔呢)
//内存条插到主板上,他们之间有接口,内存条可以更换
//接口通常提取的是行为动作.
interface Flyable{
    void fly();
}

//动物类子类,猫类
//Flyable是一个接口,是一对翅膀的接口,用过接口插到猫身上,让变得可以飞翔
class Cat extends Animal implements Flyable{
    public void fly(){
        System.out.println("飞猫起飞,翱翔太空的一只猫,很神奇");
    }
}

//蛇类,如果你不想让它飞,可以不实现Flyable接口
//没有实现这个接口表示你没吃翅膀.没有给你翅膀,你肯定不能飞
class snake extends Animal{

}

class pig extends Animal implements Flyable{
    public void fly(){
        System.out.println("我是一只会飞的猪");
    }
}

class fish implements Flyable{  //没继承Animal默认继承Object
    public void fly(){
        System.out.println("我是飞鱼");
    }
}