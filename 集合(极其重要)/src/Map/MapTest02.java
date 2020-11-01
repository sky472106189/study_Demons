package Map;

import java.util.*;

/*
Map集合的遍历
    总结:
         keySet():迭代后只能通过get()取key
         entrySet()：迭代后可以e.getKey()，e.getValue()取key和value。返回的是Entry接口
         效率上:
            entrySet()比keySet()要快不少(数据很多的前提下)

*/
public class MapTest02 {
    public static void main(String[] args) {
        Map<Integer,String>map = new HashMap();
        map.put(1,"张三");
        map.put(400,"李四");
        map.put(3,"王五");
        map.put(5,"小刚");
        //遍历Map集合方式1:用keySet()方法
        //1.先获取所有的key,所有的key是一个Set集合(无序不可重复)
        Set<Integer> set = map.keySet();
        //2.获取key对应的value.
            //2.1使用迭代器
/*      Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(map.get(it.next()));
        }*/
            //2.2使用for each
        for(Integer i : set){
            System.out.println(i+"="+map.get(i));
        }

        //遍历集合方式2:Set<Map.Entry<K,V>> entrySet()
        //原理是:把Map集合直接全部转换成Set集合.
        //Set集合中元素的类型是:Map.Entry<K,V>
        //1.调用entrySet()方法获取Set集合
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        //2.遍历Set集合,每一次取出一个Node
        Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> entry = it.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
