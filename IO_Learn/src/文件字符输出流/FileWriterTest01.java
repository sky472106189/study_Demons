package 文件字符输出流;

import java.io.FileWriter;
import java.io.IOException;

/*
    java.io.Writer
        java.io.OutputStreamWriter      转换流(字节输出流-->字符输出流)
            java.io.FileWriter          文件字符输出流
*/
public class FileWriterTest01 {
    public static void main(String[] args) throws Exception {
        //创造流
        //FileWriter fws = new FileWriter("IO_Learn//test_3.txt");覆盖
        FileWriter fws = new FileWriter("IO_Learn\\test_3.txt");//追加
        fws.write("呜呜呜!!!");

        //将char数组一部分写入
        char[] chars = {'我','是','中','国','人'};
        fws.write(chars,0,5);

        //刷新
        fws.flush();
        //关闭
        fws.close();

    }
}
