/**
 * Created by 15173 on 2020/3/5.
 */

/*抽象类:

        类到对象是实例化,对象到类是抽象.

        1.什么是抽象类
          类和类之前具有共同特征,将这些共同特征提取出来,形成的就是抽象类
          类本身是不存在的,所以抽象类无法创建对象(无法实例化,无法new).

        2.抽象类属于什么类型
          抽象类属于引用数据类型(String).

        3.抽象类怎么定义
          语法:
               [修饰符列表] abstract class 类名{
                    类体;
               }

        4.抽象类无法实例化,无法创建对象,所以抽象类是用来被继承的

        5.final和abstract不能联合使用,这个两个关键字是对立的.

        6.抽象类的子类也可以是抽象类

        7.抽象类虽然无法被实例化,但是抽象类有构造方法,这个构造方法是供子类使用的

        8.抽象类关联到抽象方法的概念.什么是抽象方法?
            抽象方法表示没有实现的方法,没有具体的方法,例如:
                public abstract void dosome()
                抽象方法特点:
                    特点1:没有方法体,以分号结尾.
                    特点2:前面修饰符列表中有abstract

        9.抽象类中不一定有抽象方法,但抽象方法必须出现在抽象类中.
*/
public class AbstractTest01 {
    public static void main(String[] args) {
        // 错误:Accout是抽象的,无法实例化
        //Accout act = new Accout();

        new CreditAccout();
    }
}

//错误:非法的修饰符组合:abstract final
/*final abstract class Accout{

}*/

abstract class Accout{

    //非抽象方法
    public void dosome(){}
    //抽象方法
    public abstract void withdraw();
}



//子类继承抽象类,且必须实现抽象类中的抽象方法
class CreditAccout extends Accout{
    public void withdraw() {

    }
}

//抽象类的子类也可以是抽象类
/*
abstract class CreditAccout1 extends Accout{
}*/
