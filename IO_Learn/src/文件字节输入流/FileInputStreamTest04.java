package 文件字节输入流;

import java.io.FileInputStream;

/*
升级循环
*/
public class FileInputStreamTest04 {

    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("IO_Learn\\test_1.txt");

        //循环读取
        byte[] bytes = new byte[1024];//每次读取1kb

//        while(true){
//            int temp = fis.read(bytes);
//            if (temp==-1) break;
//
//            //将bytes数组中有效的数据转换成字符串
//            System.out.println(new String(bytes,0,temp));//abcdef
//        }

        //升级循环
        int temp;
        while((temp=fis.read(bytes)) != -1){
            System.out.println(new String(bytes,0,temp));
        }

        fis.close();
    }
}
