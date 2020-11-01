package 对象序列化_反序列化;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
    java.lang.Object
        java.io.OutputStream
            java.io.ObjectOutputStream :序列化JAVA对象到硬盘  (Serial)
            java,io,ObjectInputStream :将硬盘中的数据"反序列化"到JVM内存 (DeSerial)

        Compile 编译 (java-->class)
        DeCompile 反编译(class-->java)
*/
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws Exception{
        //创建JAVA对象
        User u1 = new User("刘德华");

        //创建输出流(序列化流)(JVM中的java对象状态保存到硬盘中)
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("IO_Learn\\test_5.txt"));

        //写
        oos.writeObject(u1);

        //刷新
        oos.flush();

        //关闭
        oos.close();
    }
}
