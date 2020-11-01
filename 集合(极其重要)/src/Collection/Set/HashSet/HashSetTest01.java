package Collection.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
HashSet集合:
    无序不可重复.
*/
public class HashSetTest01 {
    public static void main(String[] args) {
        //演示一下HashSet集合特点
        Set<String> strs = new HashSet<>();

        //添加元素
        strs.add("Hello1");
        strs.add("Hello2");
        strs.add("Hello3");
        strs.add("Hello4");

        //遍历方法1:
        Iterator<String> it = strs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //遍历方法2,for each增强循环
        for(String s : strs){
            System.out.println(s);
        }
/*
        遍历结果:
            Hello1
            Hello4
            Hello2
            Hello3
        1.存储时的顺序和取出的顺序不同.
        2.不可重复
        3.放到HashSet中的数据,底层实现其实是放到了HashMap中的Key值中.
*/

    }
}
