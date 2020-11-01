package Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
测试List接口常用的方法
    1.List集合存储的元素特点:有序可重复
        有序:List集合存储的元素有下标.
            从0开始,以1递增.
        可重复:存储一个1,还可以再存储1.
    2.List既然是Collection接口的子接口,必然有它独特的方法.
        以下只列出List特有且常用的方法:
            void add(int index,E element)
            E  get(int index)
            int indexOf(Object o)
            int lastIndexOf(Object o)
            E remove(int index)
            E set(int index,E element)
*/
public class ListTest01 {
    public static void main(String[] args) {
        List list = new ArrayList();

        //默认都是向集合末尾添加元素
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("C");
        list.add("D");

        //在列表的指定位置插入指定元素
        //使用不多,效率较低
        list.add(1,"KING");

        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //根据下标获取元素
        Object obj = list.get(0);
        System.out.println(obj);

        //因为有序:有下标;所以List集合有自己比较特殊的遍历方式
        //即:通过下标遍历
        for(int i = 0;i<list.size();i++)
            System.out.println(list.get(i));

        //获取指定对象第一次出现处的索引
        System.out.println(list.indexOf("KING"));//1

        //获取指定对象最后一次出现处的索引
        System.out.println(list.lastIndexOf("C"));//4

        //删除指定下标位置的元素
        list.remove(0);
        System.out.println(list.size());//5

        //修改指定位置元素
        list.set(1,"Pro_King");
        System.out.println(list.get(1));
    }
}
