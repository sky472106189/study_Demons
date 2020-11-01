package Collection.Set.TreeSet自定义比较方法;

import java.util.Iterator;
import java.util.TreeSet;

/*
1.TreeSet集合底层实际上是一个TreeMap
2.TreeMap集合底层是一个二叉树.
3.放到TreeSet集合key中的元素,等同于放到TreeMap集合key部分了.
4.TreeSet集合中的元素:无序不可重复,但是可以按照元素的大小顺序自动排序,称为可排序集合.
5.TreeSet默认升序.
*/
public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("zhangsan");
        treeSet.add("lisi");
        treeSet.add("xiaoming");
        treeSet.add("wangwu");

        Iterator<String> it = treeSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
