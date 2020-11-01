package 工厂模式.工厂方法模式;

/*

*/
public class BMWFactory implements CarFactory{

    @Override
    public Car getCar() {
        return new BMW();
    }
}
