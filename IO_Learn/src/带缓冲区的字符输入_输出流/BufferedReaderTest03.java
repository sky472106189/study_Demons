package 带缓冲区的字符输入_输出流;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    接受用户键盘输入
    现在有in.readLine()方法,所以这个示范不是很有必要,但是可以知晓System.in 是一个InputStream类
*/
public class BufferedReaderTest03 {
    public static void main(String[] args) throws Exception {
    /*    //以前的方式
        Scanner s = new Scanner(System.in);  //System.in 是一个标准的输入流,默认接受键盘输入,是InputStream类

        String str = s.next(); //执行到此,等待用户输入

        System.out.println("您输入了:"+str);*/

        //使用BufferedReader接受用户的输入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //接受输入,每一次都读一行
        String str = br.readLine();
        System.out.println("你输入了:"+str);

        //关闭
        br.close();
    }
}