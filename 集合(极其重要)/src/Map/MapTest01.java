package Map;

import java.util.*;

/*
java.util.Map接口中常用的方法:
    1.Map和Collection没有继承关系
    2.Map集合以key和value的键值对存储数据
        key和value都是引用数据类型.
        key和value都是存储对象的内存地址.
        key起到主导的地位,value是key的附庸品.
    3.Map接口中常用的方法
        V put(K key,V value):想Map集合中添加键值对
        V get(Object key):通过key,获取value
        void clear():清空Map集合
        boolean containsKey(Object key):判断Map中是否包含某个key
        boolean containsValue(Object value):判断Map中是否包含某个value
        boolean isEmpty():判断Map集合中元素个数是否为0;
        Set<K> keySet():获取Map集合所有的key
        Collection<V> values():获取Map集合中所有的value
        V remove(Object key):通过key删除value
        int size():获取Map集合中键值对的个数

        Set<Map.Entry<K,V>> entrySet():将Map集合转换成Set集合
            假设现在有一个Map集合,如下所示:
                map1集合
                key             value
                ---------------------
                1               zhangsan
                2               wangwu
                3               lisi

                Set set = map1.entrySet();

                set集合(转换之后)
                1zhangsan【注意:Map集合通过entrySet()方法转换成这个集合,Set集合中元素的类型是Map.Entry<K,V>】
                2wangsu【Map.Entry和String一样,都是一种类型的名字,只不过:Map.Entry是Map中的静态内部类】
                3lisi
*/
public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"张三");
        map.put(2,"王五");
        map.put(3,"李四");
        map.put(4,"小刚");

        //通过key获取value
        String value = map.get(1);
        System.out.println(value);//张三

        //获取键值对的数量
        System.out.println(map.size());//4

        //通过key删除value
        map.remove(2);
        System.out.println(map.size());//3

        //判断是否包含某个key
        System.out.println(map.containsKey(3));//true
        //判断是否包含某个value
        System.out.println(map.containsValue("小刚"));//true
        //注意:contains和collection接口的底层类似,都是调用的equals()方法.所以自定义类要长些equals()方法.

        //获取所有value
        Collection<String> list = map.values();
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //清空集合+判断是否为空
        map.clear();
        System.out.println(map.isEmpty());//true


    }
}
