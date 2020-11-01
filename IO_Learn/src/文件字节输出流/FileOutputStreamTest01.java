package 文件字节输出流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by 15173 on 2020/3/7.
 */
/*
    java.io.OutputStream;
        java.io.FileOutputStream;文件字节输出流

        将计算机内存中的数据写入硬盘文件中
*/
public class FileOutputStreamTest01 {

    public static void main(String[] args) {


        FileOutputStream fos = null;
        try {
            //1.创建文件字节输出流
            fos = new FileOutputStream("IO_Learn//test_2.txt");

            //以追加的方式写入
            //fos = new FileOutputStream("IO_Learn//test_2.txt",true);

            //2.开始写()
            fos.write(98);//指定的字节写入此 98字节写入的是b
            String msg = "Hello,World";
            byte[] bytes = msg.getBytes();
            fos.write(bytes);
            //将byte[]数组一部分写入
            fos.write(bytes,0,2);

            //推荐写完后刷新
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    //关闭
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
