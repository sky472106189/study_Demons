package 反射_IO_Properties联合应用;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
    IO+反射+配置文件 进行解耦
    降低程序之间的依赖
*/
public class Test01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("反射\\src\\反射_IO_Properties联合应用\\classInfo.properties");

        p.load(fis);
        String str = p.getProperty("className");
        fis.close();

        Class c = Class.forName(str);
        System.out.println(c.newInstance());

    }
}
