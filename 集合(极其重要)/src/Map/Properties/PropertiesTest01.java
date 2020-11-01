package Map.Properties;

import java.util.Properties;

/*
    Properties是一个Map集合,继承自HashTable.
    Properties的key和value都是String类型.
    Properties被称为属性类对象
    Properties是线程安全的.
*/
public class PropertiesTest01 {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("username","zhangsan");
        p.setProperty("password","123");

        //通过key获取value
        String username = p.getProperty("username");
        String password = p.getProperty("password");
        System.out.println(username);
        System.out.println(password);
    }

}
