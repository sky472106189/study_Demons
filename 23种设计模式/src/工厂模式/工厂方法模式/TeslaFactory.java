package 工厂模式.工厂方法模式;

/*

*/
public class TeslaFactory implements CarFactory{

    @Override
    public Car getCar() {
        return new Tesla();
    }
}
