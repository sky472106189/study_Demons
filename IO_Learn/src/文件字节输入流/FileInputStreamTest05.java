package 文件字节输入流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by 15173 on 2020/3/7.
 */
public class FileInputStreamTest05 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("IO_Learn//test_1.txt");

        System.out.println(fis.available()); //输出6, 显示的是文件剩余字节数

        System.out.println(fis.read());//97

        System.out.println(fis.available());//输出5 ,证实了显示的是剩余的字节数.

        //跳过2个字节
        fis.skip(2);
        System.out.println(fis.available());//3

        fis.close();

    }
}
