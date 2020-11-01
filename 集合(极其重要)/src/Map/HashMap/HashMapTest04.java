package Map.HashMap;

import java.util.HashMap;
import java.util.Map;

/*
HashMap存储的元素可以为null
*/
public class HashMapTest04 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(null,null);
        System.out.println(map.size());//1

    }
}
