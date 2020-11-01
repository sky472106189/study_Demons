package 工厂模式.简单工厂模式;

/*
    车辆工厂--简单工厂模式

    缺点:没有满足开闭原则
        如果要添加一个车型,且不更改原工厂的前提,会很麻烦
*/
public class CarFactory {
    public static Car getCar(String Car){

        if(Car.equals("宝马")){
            return new BMW();
        }else if (Car.equals("特斯拉")){
            return new Tesla();
        }else
            return null;

    }
}
