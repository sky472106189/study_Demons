package 泛型;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


/*
JDK5.0之后推出的新特性:泛型

    使用泛型的好处:
        1.集合中存储的元素类型统一了
        2.从集合中取出的元素类型是泛型指定的类型,能减少大量的强制类型转换.

    缺点:
        导致集合中存储的元素缺乏多样性.
        大多数业务中,集合中元素的类型还是统一的,所以这种泛型特性被大家认可
*/
public class GenericTest01 {
    public static void main(String[] args) {
/*        //不适用泛型,分析程序存在缺点
        List mylist = new ArrayList();

        //准备对象
        Animal d = new Dog();
        Animal b = new Bird();

        //添加对象
        mylist.add(d);
        mylist.add(b);

        //遍历对象,同时让狗跑,让鸟飞
        Iterator it = mylist.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            if(obj instanceof Dog){
                ((Dog) obj).dogRun();
            }else if (obj instanceof Bird){
                ((Bird) obj).fly();
            }
        }*/


        //使用泛型机制
        //使用泛型<Animal>之后,表示list集合中只允许存储Animal类型的数据
        List<Animal> mylist = new ArrayList<Animal>();

        Dog d = new Dog();
        Bird b = new Bird();
        mylist.add(d);
        mylist.add(b);

        Iterator<Animal> it = mylist.iterator();
        while(it.hasNext()){
            Animal a = it.next();
            if(a instanceof Bird){
                ((Bird) a).fly();
            }else if (a instanceof Dog){
                ((Dog) a).dogRun();
            }
        }

    }
}
class Animal{}
class Dog extends Animal{
    public void dogRun(){
        System.out.println("遛狗");
    }
}
class Bird extends Animal{
    public void fly(){
        System.out.println("鸟儿飞");
    }
}