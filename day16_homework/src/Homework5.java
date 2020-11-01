/**
 * Created by 15173 on 2020/3/5.
 *
 * 编写Java程序用于显示人的姓名和年龄.
 * 定义一个人类Person该类中应该有两个私有属性姓名name和年龄age
 * 定义构造方法用来初始化成员变量.再定义显示display方法将姓名和年龄打印出来.
 * 在main方法中创建人类的实例然后将信息显示
 */
public class Homework5 {
    public static void main(String[] args) {
        Person zs = new Person("张三",15);
        Person xh = new Person("小红",16);
        zs.display();
        xh.display();
    }
}

class Person{
    private String name;
    private int age;

    public Person(){}

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void display(){
        System.out.println("该人的姓名:"+name+"年龄:"+age);
    }
}