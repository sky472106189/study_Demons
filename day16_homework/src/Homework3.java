/**
 * Created by 15173 on 2020/3/5.
 * 在程序中经常要对时间进行操作但是并没有时间类型的数据
 * 那么我们可以自己实现一个时间类来满足程序中的需要
 * 定义名为MyTime的类其中应有三个整型成员时hour分minute秒second
 * 为了保证数据的安全性这三个成员变量应声明为私有
 * 为MyTime类定义构造方法以方便创建对象时初始化成员变量
 * 再定义display()方法用于将时间信息打印出来
 * 为MyTime类添加以下方法
 *      addSecond(int sec)
 *      addMinute(int min)
 *      addHour(int hou)
 *      subSecond(int sec)
 *      subMinute(int min)
 *      subHour(int hou)
 */
public class Homework3 {
    public static void main(String[] args) {
        Mytime m1 = new Mytime(0,0,0);
        m1.addSecond(3600);
        m1.display();
    }
}

class Mytime{
    private int hour;
    private int minute;
    private int second;

    public Mytime() {
    }

    public Mytime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void addSecond(int sec){
        int newSec = (this.second +=sec);
        if(newSec <60){
             this.second = newSec;
        }else if (newSec ==60){
            addMinutes(1);
            newSec =1;
            this.second = newSec;
        }else  {
            int min = newSec/60;
            int sec1 = newSec%60;
            addMinutes(min);
            this.second = sec1;
        }

    }

    public void addMinutes(int min) {
        int newMin = (this.minute +=min);
        if(newMin<60){
            this.minute = newMin;
        }
        else if(newMin==60){
            addHour(1);
            this.minute = 1;
        }
        else {
            int hour = newMin/60;
            int min1 = newMin%60;
            addHour(hour);
            this.minute = min1;
        }
    }

    public void addHour(int hour) {
        int newHour = (this.hour +=hour);
        if(newHour<24){
            this.hour = newHour;
        }
        else if(newHour==24){
            this.hour = 1;
        }
        else {
            int hour1 = newHour/24;
            this.hour = hour1;
        }
    }

    public void display(){
        System.out.println("时:"+hour+"分:"+minute+"秒:"+second);
    }

}
