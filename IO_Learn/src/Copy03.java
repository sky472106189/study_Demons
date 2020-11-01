import java.io.*;

/*
    带有缓冲区的字符输入流输出流完成复制
*/
public class Copy03 {
    public static void main(String[] args) throws Exception{
        //创造输入流(读)
        BufferedReader br = new BufferedReader(new FileReader("IO_Learn//test_2.txt"));
        //创造输出流(写)
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("IO_Learn//test_3.txt")));

        //开始复制
        String temp;
        while((temp=br.readLine())!=null){
            bw.write(temp);
            bw.newLine();
        }

        //刷新
        bw.flush();
        //关闭
        br.close();
        bw.close();
    }
}
