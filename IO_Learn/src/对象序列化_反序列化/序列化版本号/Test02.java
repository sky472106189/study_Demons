package 对象序列化_反序列化.序列化版本号;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

//反序列化
public class Test02 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("IO_Learn\\user.dbf"));

        System.out.println(ois.readObject());
        ois.close();
    }
}
// 当User.java重新生成了一个新的.class文件,且没有重新序列化,而是直接反序列化,会报错如下
//Exception in thread "main" java.io.InvalidClassException:
// User; local class incompatible:
// stream classdesc serialVersionUID = 4411518455236717997,
// local class serialVersionUID = 5571696238523412468

