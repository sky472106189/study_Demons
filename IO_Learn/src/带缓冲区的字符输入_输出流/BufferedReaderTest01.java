package 带缓冲区的字符输入_输出流;

import java.io.BufferedReader;
import java.io.FileReader;

/*
    字节
    BufferedInputStream
    BufferedOutputStream

    字符(纯文本)
    BufferedReader :带缓冲区的字符输入流
    BufferedWriter :          字符输出流
*/
public class BufferedReaderTest01 {
    public static void main(String[] args) throws Exception{
        //创建一个带缓冲区的字符输入流
        FileReader fr = new FileReader("IO_Learn//test_2.txt"); //创建一个文件字符输入流
        BufferedReader br = new BufferedReader(fr); //将文件字符输入流包装成带有缓冲区的字符输入流,reader是一个抽象类,不能直接构造,需要用抽象类的子类FileReader即可.

        //根据流出现的位置,流可以分为:包装流或者处理流  和  节点流.
        //FileReader fr是一个节点流
        //BufferedReader br 是一个包装流或者处理流

        //开始读
        String temp = null;
        while((temp=br.readLine())!=null){
            System.out.println(temp);
        }
        //关闭
        //注意:关闭的时候只需要关闭最外层的包装流.(这里有一个装饰者模式)
        br.close();
    }
}
