package 对象序列化_反序列化;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
    反序列化
*/
public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws Exception{
        //创建反序列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("IO_Learn\\test_5.txt"));

        //反序列化
        Object o = ois.readObject();
        System.out.println(o); //这里的toString是多态,编译阶段是Object的,运行阶段现实的是User的

        //关闭
        ois.close();
    }
}
