package 定时器;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
使用定时器指定定时任务
*/
public class TimerTest {
    public static void main(String[] args) throws ParseException {
        //创建定时器对象
        Timer timer = new Timer();
        // Timer timer = new Timer(true); 守护线程的方式

        //指定定时任务
        //timer.schedule(定时任务,第一次执行时间,间隔多久执行一次-);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-yy-yy ss:ss:ss");
        Date date = sdf.parse("2020-03-22 14:36:00");
        timer.schedule(new LogTimerTask(),date,1000);
    }
}

//编写一个定时任务类
//假设这是一个记录日志的定时任务
class LogTimerTask extends TimerTask {
    @Override
    public void run() {
        //编写需要执行的任务
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-yy-yy ss:ss:ss");
        String time = sdf.format(new Date());
        System.out.println(time+":备份成功");
    }
}
