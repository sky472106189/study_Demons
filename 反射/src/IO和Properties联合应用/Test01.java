package IO和Properties联合应用;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
    IO+Properties

    dbinfo这样的文件我们称作配置文件,
    配置的文件的作用:使程序更加灵活.

    注意:一般在程序中可变的东西不要写死,推荐写到配置文件中.运行同样的程序,得到不同的结果!

    像dbinfo这样一个具有特殊内容的配置文件,我们又叫做:属性文件.
    java规范中要求属性文件以.properties

    属性文件中要求
        key和value之间可以使用"空格","冒号","等号".
        如果"空格","等号","冒号"同时出现,按最前的作为分隔符.
*/
public class Test01 {
    public static void main(String[] args) throws IOException {
        //1.创建属性对象
        Properties p = new Properties();//和Map一样,只不过key和value只能存储字符串类型.
                                        //key不能重复,重复则value覆盖
        //2.创建流
        FileInputStream fis = new FileInputStream("反射\\src\\IO和Properties联合应用\\dbinfo");

        //3.将fis流中的所有数据加载到属性对象中
        p.load(fis);//现在属性对象中有(key=username,value=scoot)

        //关闭
        fis.close();

        //通过key获取value
        String v = p.getProperty("username");

        System.out.println(v);
    }
}
