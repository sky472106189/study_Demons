package 工厂模式.工厂方法模式;

/*
    客户买车
*/
public class Customer {
    public static void main(String[] args) {
        Car car1 = new BMWFactory().getCar();
        Car car2 = new TeslaFactory().getCar();
        car1.name();
        car2.name();

        //动态扩展了奔驰后,客户去下单
        Car car3 = new BenzFactory().getCar();
        car3.name();
    }

}
