package 对象序列化_反序列化.序列化版本号;

import java.io.Serializable;
//因为User实现了Serializable接口,JVM会特殊待遇,给该类添加一个属性
//static final long serialVersionUID = 4411518455236717997;
//具体看视屏吧,解释起来有点复杂
public class User implements Serializable {
    String name;
}
