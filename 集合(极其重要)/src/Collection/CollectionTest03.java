package Collection;

import java.util.*;

/*
    迭代器的使用
*/
public class CollectionTest03 {
    public static void main(String[] args) {
        //创建集合对象
        Collection list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());//存进去1234,取出来也是1234,List接口下的都是有序可重复
        }
        System.out.println("=============================");
        Collection set = new TreeSet();
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            //存进去2341,取出来却使1234,Set接口下的都是无序不可重复的,只不过TreeSet会从小到大排序
            //注意:HashSet并不会进行排序,是进行了hashCode()方法计算.由于SUN公司的方法很精妙
            //所以会给程序员一种HashSet会自动排序的错觉
            //这里引申了一个问题,既然HashSet靠hashCode()方法,那么TreeSet存自定义类是如何进行排序的呢?
            //这里就需要加入一个知识点Comparable方法
        }

    }

}
