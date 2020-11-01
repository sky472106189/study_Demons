package Collection;


import java.util.ArrayList;
import java.util.Collection;

/*
深入Collection集合的remove方法:
    boolean remove(Object o) 从集合中删除一个元素o,删除成功:true;删除失败/没该元素:false
*/
public class CollectionTest05 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new String("你好"));

        String str = new String("你好");

        c.remove(str);
        System.out.println(c.size());//0
        //说明remove也调用了equals()方法.

        c.clear();
        c.add(new Human());

        Human h = new Human();

        c.remove(h);
        System.out.println(c.size());//1 ,Human类没重写equals方法
    }
}
class Human{}