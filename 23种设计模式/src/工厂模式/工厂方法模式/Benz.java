package 工厂模式.工厂方法模式;

/*
    动态扩展了奔驰车
*/
public class Benz implements Car {
    @Override
    public void name() {
        System.out.println("奔驰");
    }
}
