package Collection.List;

import java.util.ArrayList;
import java.util.List;

/*
ArrayList集合：
    1.默认初始化容量10
    2.集合底层是一个Object[]数组
    3.构造方法
        new ArrayList();
        new ArrayList(int initialCapacity);
    4.ArrayList集合的扩容:
        原容量的1.5倍,.
        ArrayList集合底层是数组,怎么优化?
            尽可能少的扩容,因为数组扩容效率比较低,建议在使用ArrayList集合
            的时候,预估计个数,给定初始化容量
    5.优缺点和数组一样:
        检索效率高,增删改效率低
*/
public class ArrayListTest01 {
    public static void main(String[] args) {
        //默认初始化容量是10
        List list = new ArrayList();
        //集合size()方法是获取当前集合中元素的个数,不是获取集合的容量.
        System.out.println(list.size());//0

        //指定初始化容量,20
        List list2 = new ArrayList(20);
        System.out.println(list2.size());//0
    }
}
