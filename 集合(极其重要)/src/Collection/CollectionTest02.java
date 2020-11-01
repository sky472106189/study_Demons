package Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
    迭代器的使用(重点:*****)
        Iterator<E> iterator()
    该方法来自于Collection的父接口Iterable

    迭代器适用于所有的Collection以及子类使用
    Map不能使用迭代器
*/
public class CollectionTest02 {
    public static void main(String[] args) {
        Collection c = new HashSet();
        //添加元素
        c.add(1);
        c.add("你好");
        c.add(252);
        c.add("我是谁");
        c.add(new Object());
        //对集合c进行迭代(遍历)
        //第一步:获取集合对象的迭代器对象Iterator
        Iterator it = c.iterator();
        //第二步,通过迭代器对象it开始迭代(遍历)集合
        /*
        boolean hasNext() 如果仍有元素,则返回true.
        Object next() 返回迭代的下一个元素
        */
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
