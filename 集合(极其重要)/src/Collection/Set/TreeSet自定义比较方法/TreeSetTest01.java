package Collection.Set.TreeSet自定义比较方法;

import java.util.Set;
import java.util.TreeSet;

/*
TreeSet集合存储元素的特点:
    1.无序不可重复的,但是存储的元素可以自动按照大小顺序排序.
    称为:可排序集合
    2.无序:存进去的顺序和取出来的顺序不同,并且没有下标
*/
public class TreeSetTest01 {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(7);

        for(Integer i : treeSet){
            System.out.println(i);
        }
        /*
        遍历结果:
        1
        4
        5
        7
        结果进行了排序.
        */
    }
}
