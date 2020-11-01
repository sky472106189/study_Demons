package Collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    关于集合元素的remove
        重点:当集合的结构发生改变时,迭代器必须重新获取,如果还是用以前老的迭代器,会出现
        异常:java.util.ConcurrentModificationException

        重点:在迭代集合元素的过程中,不能调用集合对象的remove方法,删除元素:
            c2.remove(o);迭代过程中不能这样
            会出现异常:java.util.ConcurrentModificationException

*/
public class CollectionTest06 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        //注意:此时获取的迭代器,指向的是那时集合中没有元素状态下的迭代器
        //一定要注意:集合结构只要发生改变,迭代器必须重新获取.
        //Iterator it = c.iterator();

        c.add(1);//Integer类型
        c.add(2);
        c.add(3);

        Iterator it = c.iterator();
        while(it.hasNext()){
            //编写代码时next()方法返回类型必须是Object
            //Integer i = it.next();
            Object obj = it.next(); //可以看做是Object obj = new Integer(1); 多态!
            System.out.println(obj);
        }

        Collection c2 = new ArrayList();
        c2.add("abc");
        c2.add("def");
        c2.add("xyz");

        Iterator it2 = c2.iterator();
        while(it2.hasNext()){
            Object o = it2.next();
            //删除元素
            //删除元素之后,集合的元素发生变化,应该重新获取迭代器java.util.ConcurrentModificationException
            //c2.remove(o);
            //解决方法:调用迭代器的remove()方法
            it2.remove();//删除的一定是迭代器指向的当前元素
            System.out.println(o);
        }
        System.out.println(c2.size());//0
    }
}
