package 文件字节输入流;

import java.io.FileInputStream;
import java.io.*;
/*
    public int read(byte[] b);
    方法解读:每次读取之前在内存中准备一个byte数字,每次读取多个字节存储到byte数组中.
    一次读取多个字节,不是单字节读取了

    效率高
 */
public class FileInputStreamTest03 {

    public static void main(String[] args) throws Exception {

        //1.创建输入流
        FileInputStream fis = null;
        fis = new FileInputStream("IO_Learn\\test_1.txt");

        //2.开始读
        //准备一个byte数字
        byte[] bytes = new byte[4];//每一次最多读取4个字节

        //int read(byte[] bytes);该方法返回的int类型的值代表的是,这次读取了多少个字节.
        int i1 = fis.read(bytes); //i1=4    此时byte数组已经读进去了4个数,只不过调用这个方法会返回4,显示4个数值读进去了.
        System.out.println(new String(bytes));//abcd
        //将byte数组转换成字符串,byte没有重写toString方法
        //String(byte[] bytes)
        //通过使用平台的默认字符集解码指定的字节数组来构造新的 String 。

/*******************重点关注这个示范:*******************************/
        int i2 = fis.read(bytes); //2
        //System.out.println(new String(bytes));//efcd
        // 输出不符合逻辑.因为按byte[4]是要读取4个,但是只读取了2个
        // 那么ef覆盖掉了ab,但是后面两个没有值,于是被cd反覆盖了

        //用public String(byte[] bytes,int offset,int length)方法可以避免此错误
        System.out.println(new String(bytes,0,i2));//ef

        int i3 = fis.read(bytes); //-1 已经到达文件的末尾,返回-1

        System.out.println(i1); //读到abcd,显示i1=4,4个字节
        System.out.println(i2); //读取ef,显示i2=2
        System.out.println(i3); //读取完毕.显示i3=-1

        //关闭
        fis.close();
    }
}
