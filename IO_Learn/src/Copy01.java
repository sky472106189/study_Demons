import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by 15173 on 2020/3/7.
 */

/*
    关于文件的复制粘贴
    将test_1.txt文件的内容复制到test_2.txt中
*/
public class Copy01 {
    public static void main(String[] args) throws Exception {

        //输入流
        FileInputStream fis = new FileInputStream("IO_Learn//src//文件字符输入流//FileReaderTest01.java");
        //输出流
        FileOutputStream fos = new FileOutputStream("IO_Learn//test_2.txt");

        byte[] bytes = new byte[1024];
        int temp;
        while((temp=fis.read(bytes))!=-1){
            fos.write(bytes,0,temp);
        }

        //刷新
        fos.flush();

        //关闭
        fis.close();
        fos.close();

    }
}
