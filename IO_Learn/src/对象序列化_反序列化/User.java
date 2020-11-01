package 对象序列化_反序列化;

import java.io.Serializable;
//该接口是一个"可序列化"的
//该接口没有任何方法,是一个标识接口
//像这样的接口还有:java.lang.Cloneable;可克隆的

/*
    标识接口的作用:起到标志的作用
    JVM如果看到该对象实现某个特殊的接口,会对它特殊待遇.
*/
public class User implements Serializable{
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
