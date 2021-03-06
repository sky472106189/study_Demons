import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/*
    文件复制
    文件字符输入流输出流
    只能复制纯文本文件
*/
public class Copy02 {
    public static void main(String[] args) throws Exception {
        //开启读和写流
        FileReader fis = new FileReader("IO_Learn//src//Copy02.java");
        FileWriter fws = new FileWriter("IO_Learn//test_2.txt");

        //开始复制
        int temp;
        char[] chars = new char[512];
        while((temp=fis.read(chars))!=-1){
            fws.write(chars,0,temp);
        }

        //刷新
        fws.close();
        //关闭
        fis.close();
        fws.close();
    }
}
