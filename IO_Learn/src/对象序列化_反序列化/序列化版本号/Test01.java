package 对象序列化_反序列化.序列化版本号;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


//序列化
public class Test01 {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("IO_Learn\\user.dbf"));

        User u = new User();

        oos.writeObject(u);

        oos.flush();

        oos.close();
    }
}
