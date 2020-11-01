package Collection.List;

import java.util.*;

/*
线程安全的Vector
    1.底层也是一个数组.
    2.初始化容量:10
    3.怎么扩容的?
        扩容之后是原容量的2倍
       ArrayList是原容量的1.5倍

    4.Vector的所有方法都是线程同步的,都带有synchronized关键字
    是线程安全的,效率比较低,使用较少了.

    5.怎样将一个线程不安全的ArrayList集合转换成线程安全的呢?
        使用集合工具类:
            java.util.Collections;(不是Collection,多了一个s)

*/
public class VectorTest {
    public static void main(String[] args) {
        Vector<Object> vector = new Vector<>();
        vector.add(123);
        vector.add(456);
        vector.add("xyz");
        //因为Vector底层是数组,有序可重复,所以能用下标
        for(Object obj : vector){
            System.out.println(obj);
        }
        //当然用迭代器也行
        Iterator<Object> it = vector.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //转换线程安全级
        List mylist = new ArrayList();//非线程安全的
        //变成线程安全的
        Collections.synchronizedList(mylist);//完成
        mylist.add(111);
        mylist.add(222);
        mylist.add(13311);

    }
}
