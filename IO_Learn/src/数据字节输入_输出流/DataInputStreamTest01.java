package 数据字节输入_输出流;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamTest01 {
    public static void main(String[] args) throws Exception{
        //创建流
        DataInputStream dis = new DataInputStream(new FileInputStream("IO_Learn//test_4.txt"));

        //读
        //注意:要使用该流读取数据,必须提前知道该文件中数据的类型,顺序
        //读的顺序必须和写入的顺序相同
        byte b = dis.readByte();
        short s = dis.readShort();
        int i = dis.readInt();
        long l = dis.readLong();
        double d = dis.readDouble();
        boolean flag = dis.readBoolean();
        char c = dis.readChar();

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);
        System.out.println(flag);
        System.out.println(c);

        //关闭
        dis.close();
    }
}