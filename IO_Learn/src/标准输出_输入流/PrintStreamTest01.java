package 标准输出_输入流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.io.OutputStream
        java.io.FilterOutputStream
            java.io.PrintStream : 标准输出流,默认打印到控制台,以字节方式
            java.io.PrintWriter :                            以字符方式
*/
public class PrintStreamTest01 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello World");

        PrintStream ps = System.out;
        ps.print("java");

        //改变输出方向
        System.setOut(new PrintStream(new FileOutputStream("IO_Learn//log.txt")));
        //再次输出
        System.out.println("哈哈");

        //通常使用这种方式记录日志
        //需求:记录日志,m1方法开始执行的时间和结束的时间,记录到log文件中
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss sss");
        System.out.println("m1方式开始执行的时间:"+sdf.format(new Date()));
        m1();
        System.out.println("m1方式结束执行的时间:"+sdf.format(new Date()));
    }

    public static void m1(){
        System.out.println("m1执行");
    }
}
