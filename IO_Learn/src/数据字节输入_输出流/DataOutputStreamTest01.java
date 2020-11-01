package 数据字节输入_输出流;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
    java.io.OutputStream
        java.io.FilterOutputStream
            java.io.DataOutputStream  数据字节输出流
            可以将内存中的"int i = 10;"写入到硬盘文件中,
            写进去的不是字符串,写进去的是二进制数据
            带类型
    写进去的文件就因为是二进制,所以普通方式打不开,需要用对应的DataInputStream
*/
public class DataOutputStreamTest01 {
    public static void main(String[] args) throws Exception{
        //创造流
        FileOutputStream fos = new FileOutputStream("IO_Learn//test_4.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        //准备数据
        byte b = 10;
        short s = 11;
        int i = 12;
        long l = 1500L;
        double d = 1.23;
        boolean flag = false;
        char c = 'a';

        //写
        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeDouble(d);
        dos.writeBoolean(flag);
        dos.writeChar(c);

        //刷新
        dos.flush();
        //关闭
        dos.close();
    }
}
