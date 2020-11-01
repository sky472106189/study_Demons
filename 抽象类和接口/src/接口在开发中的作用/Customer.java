package 接口在开发中的作用;

/**
 * Created by 15173 on 2020/3/6.
 */
public class Customer {
    //顾客手里有菜单
    //Customer has a FoodMenu(这句话什么意思:顾客有一个菜单)
    //记住:以后凡是能够用has a 来描述的,统一以属性的方式存在.
    //实例变量,属性
    //面向抽象编程,面向接口编程,降低程序的耦合度,提高程序的扩展力.
    private FoodMenu foodMenu;    //要养成封装的好习惯

    //如果以下这样写,就表示写死了,没有可插拔,只能吃中餐或者西餐
    //ChinaCooker cc;
    //AmericaCooker ac;

    //构造方法
    public Customer(){
    }
    public Customer(FoodMenu foodMenu){
        this.foodMenu = foodMenu;
    }

    //setter and getter
    public void setFoodMenu(FoodMenu foodMenu){
        this.foodMenu = foodMenu;
    }
    public FoodMenu getFoodMenu(){
        return foodMenu;
    }

    //提供点菜的方法
    public void order(){
        //先拿到菜单才能点菜
          //调用get方法拿到菜单
        FoodMenu fm = this.getFoodMenu();
          //也可以不调用get方法,因为在本类中私有的属性是可以访问的
        foodMenu.shiZiChaoJiDan();
        foodMenu.yuXiangRouSi();

    }
}

/*
    Cat is a Animal,但凡满足is a的表示都可以设置为继承.
    Customer has a FoodMenu,但凡是满足has a的表示都以属性的形式存在.
*/

/*

//自己类
Myself has a Friend
class Myself{
    //你这个对象，应该有一个朋友对象的电话号码.
    //电话号码就是一个对象的内存地址,联系你朋友的时候,打电话.
    //f是一个引用,f默认值为null,是null表示,你没有朋友.
    Friend f;

    //你通过构造方法给你一个朋友
    public Myself(Firend f){
        this.f = f;
    }

    public static void main(String[] args){
        //创建朋友对象
        Friend friend = new Friend();

        //创建对象的同事交朋友
        Myself m = new Myself(friend);

        //创建自己对象
        //目前还没有交朋友
        Myself m = new Myself();
        //交朋友
        m.f = friend;//把朋友的地址给了你.
    }
}
//朋友类
class Friend{

}
*/