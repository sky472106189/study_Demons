package 工厂模式.简单工厂模式;

/*
    顾客来买车
*/
public class Customer {
    public static void main(String[] args) {

        //以前的方式
        Car car1 = new BMW();  //顾客一个人做出了宝马,那还需要买吗?现实世界中车是有很多原件的(构造方法中的属性参数),所以顾客直接造出来是不现实的
        Car car2 = new Tesla();//因此,我们顾客需要是面向工厂,告诉工厂需求,工厂进行加工制造.顾客不需要关心工厂是怎么实现的
        car1.name();
        car2.name();

        //使用工厂创建
        Car car3 = CarFactory.getCar("宝马");//顾客告诉工厂"我要宝马"
        Car car4 = CarFactory.getCar("特斯拉");//顾客告诉工厂"我要特斯拉"
        car3.name();
        car4.name();
    }
}
