package 文件字节输入流;

import java.io.FileInputStream;


/*Created by 15173 on 2020/3/4.
  使用public int read() 读取数据
  以下程序存在缺点,频繁访问磁盘,伤害磁盘,并且效率低.*/

public class FileInputStreamTest02 {
    public static void main(String[] args) throws Exception{

        //创建流
        FileInputStream fis = null;
        fis = new FileInputStream("IO_Learn\\test_1.txt");

        //开始读
//        while (true) {
//            int temp = fis.read();
//            if (temp == -1) break;
//            System.out.println(temp);

        //升级循环
        int temp;
        while ((temp=fis.read())!=-1){
            char char1 = (char) temp;//将ANSCII码值转换为相应的字符
            System.out.print(char1+":");
            System.out.println(temp);
        }

        //关闭
        fis.close();

    }
}
