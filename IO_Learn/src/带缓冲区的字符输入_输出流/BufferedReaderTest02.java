package 带缓冲区的字符输入_输出流;

import com.sun.org.apache.regexp.internal.RE;

import java.io.*;

/*
    BufferedReader
*/
public class BufferedReaderTest02 {
    public static void main(String[] args) throws Exception{
        //创造带缓冲区的输入流(利用转换流,将字节流转换成字符流:Reader-->InputStream)
        FileInputStream fim = new FileInputStream("IO_Learn//test_2.txt");//文件字节输入流

        //开始转换
        InputStreamReader reader = new InputStreamReader(fim);  //  java.io.Reader
                                                                //      java.io.InputStreamReader  继承了Reader抽象类,所以也是Reader
        BufferedReader br = new BufferedReader(reader);

        String temp = null;
        while ((temp = br.readLine())!=null){
            System.out.println(temp);
        }

        //关闭最外层的流即可(装饰者模式)
        br.close();
    }
}
