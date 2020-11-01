package 工厂模式.工厂方法模式;

/*
    车辆工厂--工厂方法模式
    能动态扩展了
    满足了开闭原则
    此例子动态扩展了 "奔驰" ,并且没有更改原代码

    缺点:多一个车,多一个扩展类,显得麻烦
*/
public interface CarFactory {
    Car getCar();
}
