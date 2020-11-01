package 文件字符输入流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
    java.io.Reader
        java.io.InputStreamReader; 转换流(字节输入流-->字符输入流)
            java.io.FileReader;    文件字符输入流
*/
public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            //创建文件字符输入流
             fr = new FileReader("IO_Learn\\src\\文件字符输入流\\FileReaderTest01.java");

             //读
            System.out.println(fr.read());//这个方法读的是第一个字节的ANSCII值,因为第一个字节是p对应的ANSCII是112

            char[] chars = new char[1024];
            int temp;                                                    // while((fr.read(chars))!=-1){
            while((temp=(fr.read(chars)))!=-1) {                         //    System.out.println(chars);
                System.out.println(new String(chars,0,temp));     // }  这样写的错误原因在FileInputStreamTest03.java中有说
            }                                                            //具体原因是因为如果chars不能一次性读完文件内容的话,将会产生覆盖
                                                                         //比如要整个文件5个字节,byte[4],那么读取第二次的时候.还是会读取4个
                                                                         //但是后面空了的2个怎么办,就会把上面的对应覆盖下来.
                                                                         // 解决方法就是用一个变量是取到这个值,精准控制,
                                                                         // 而不是用实现静态初始化好的数组来固定读取

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null)
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
