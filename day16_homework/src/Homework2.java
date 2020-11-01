/**
 * Created by 15173 on 2020/3/5.
 *
 * 请定义一个交通工具(Vehicle)类
 *      其中有属性:
 *      速度(speed)
 *      体积(size)等等
 *      方法移动(move())
 *      设置速度(setSpeed(int speed))
 *      加速speedUp()
 *      减速speedDown()等等.
 *
 *      最后在测试类Vehicle中的main()中实例化一个交通工具对象
 *      并通过方法给它初始化speed,size的值并且打印出来.
 *      另外调用加速减速的方法对速度进行改变.
 */
public class Homework2 {

    public static void main(String[] args) {
        //通过无参构造方法创建对象
        Vehicle bw = new Vehicle();
        //通过set方法给属性赋值
        bw.setSize(500);
        bw.setSpeed(120);

        //通过有参构造方法创建对象
        //Vehicle bw = new Vehicle(120,500);
        bw.move();
        bw.speedDown(50);
        bw.move();
        bw.speedUp(100);
        bw.move();
    }
}

 class Vehicle{
    private double speed;
    private double size;

     public Vehicle(){
     }

     public Vehicle(double speed, double size){
         this.speed = speed;
         this.size = size;
     }


     public double getSpeed() {
         return speed;
     }

     public void setSpeed(double speed) {
         this.speed = speed;
     }

     public double getSize() {
         return size;
     }

     public void setSize(double size) {
         this.size = size;
     }

    public void speedUp(int speed){
        this.speed +=speed;
    }

    public void speedDown(int speed){
        this.speed -=speed;
    }

    public void move(){
        System.out.println("正在移动,当前速度:"+speed);
    }
}
