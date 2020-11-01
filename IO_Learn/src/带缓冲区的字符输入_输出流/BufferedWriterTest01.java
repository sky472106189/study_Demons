package 带缓冲区的字符输入_输出流;

import java.io.*;

/*
    BufferedWriter
*/
public class BufferedWriterTest01 {
    public static void main(String[] args) throws Exception{
        //创建带有缓冲区的字符输出流
        //BufferedWriter bw = new BufferedWriter(new FileWriter("IO_Learn//test_3.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("IO_Learn//test_3.txt")));

        //开始写
        String str = "我是中国人";
        bw.write(str);
        //写入一个行分隔符
        bw.newLine();
        bw.write("我很骄傲");

        //刷新
        bw.flush();
        //关闭
        bw.close();
    }
}
