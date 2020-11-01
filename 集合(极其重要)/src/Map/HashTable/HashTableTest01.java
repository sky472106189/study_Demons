package Map.HashTable;

import java.util.Hashtable;
import java.util.Map;

/*
HashTable的key和value可以为null吗?
    都不可以!

    总结:HashMap的key和value都可以为null
         HashTable的key和value都不可以为null.

HashTable是线程安全的
线程安全也有其他的方案,这个HashTable对线程的处理,导致效率较低,
使用较少了.

HashTable底层也是哈希表,初始化容量是11,负载因子是0.75;
*/
public class HashTableTest01 {
    public static void main(String[] args) {
        Map map = new Hashtable();
        map.put(null,123);//java.lang.NullPointerException

        map.put(123,null);//java.lang.NullPointerException

    }
}
