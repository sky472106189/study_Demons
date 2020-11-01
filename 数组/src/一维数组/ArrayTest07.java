package 一维数组;

/**
 * Created by 15173 on 2020/3/6.
 * 一维数组的深入,数组的存储类型为:引用数据类型
 * 对于数组来说,实际上只能存储每个java对象的"内存地址",数组中存储的每个元素是"引用".
 */
public class ArrayTest07  {
    public static void main(String[] args) {
        //创建一个Animal类型的数据
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = new Animal();
        Animal[] animals = {a1,a2,a3};

        //遍历
        for (int i = 0 ; i<animals.length;i++){
            animals[i].move();
        }
        System.out.println("=============================");
        //动态初始化一个长度为2的Animal类型数组
        Animal[] ans = new Animal[2];
        ans[0] = new Animal();
        //ans[1] = new Product(); 报错,Animal类型数组只能放Animal类

        //Animal数组中可以存放Cat类型的数据,因为Cat是一个Animal.
        //Cat是Animal的子类
        ans[1] = new Cat();

        //创建一个Animal类型的数组,数组当中存储Cat和Bird
   /*   Cat c = new Cat();
        Bird b = new Bird();
        Animal[] anis = {c,b}; 这样写也行*/
        Animal[] anis = {new Cat(),new Bird()};//该数组中存储了两个对象的内存地址

        for(int i = 0; i <anis.length;i++){
            //这个取出来的可能是Cat,也可能是Bird,不过肯定是个Animal
            //如果调用的方法是父类中存在的方法不需要向下转型,直接使用父类型引用调用即可.
            //anis[i]
            Animal an = anis[i];
            an.move();//猫在走猫步 anis[0]是猫类
                      //鸟儿飞翔   anis[1]是鸟类

            //调用子对象特有方法的话,需要向下转型.
            //因为Animal类没有sing(),和catchMouse()方法
            if(anis[i]instanceof Cat){
                //anis[i].catchMouse();直接调用会报错,因为编译器认为他是Animal类型,要强转
                Cat c1 = (Cat) anis[i];
                c1.catchMouse();
            }else if(anis[i] instanceof Bird){
                Bird b1 = (Bird) anis[i];
                b1.sing();
            }

        }

    }
}
class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}
class Product{
}
//Cat是子类继承Animal
class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("猫在走猫步");
    }
    //特有方法
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
//Bird子类
class Bird extends Animal{
    public void move(){
        System.out.println("鸟儿飞翔");
    }
    public void sing(){
        System.out.println("鸟儿在唱歌");
    }
}