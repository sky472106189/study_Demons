package Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
深入Collection集合的contains方法:
    boolean contains(Object o) 判断集合中是否包含某个对象o,包含:true,不包含:false
*/
public class CollectionTest04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add(new String("你好"));
        String str = new String("我也好");
        c.add(str);

        System.out.println(c.size());  //2

        String x = new String("你好");
        System.out.println(c.contains(x));//true,因为contains底部调用了equals()方法,而String重写了equals方法,所以是true

        c.clear();
        c.add(new Animal());

        Animal s1 = new Animal();
        System.out.println(c.contains(s1));//false,
        // 为什么跟上面一样的示范,但是却返回false呢
        //原因很简单
        //因为Animal这个类没有重写equals()方法,默认调用的是Object类的equals()方法
        //Object类的equals()方法比较的是内存地址,而c.add()的
        //因此返回false
    }
}
class Animal{}
