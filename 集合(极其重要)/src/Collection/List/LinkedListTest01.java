package Collection.List;

import java.util.LinkedList;

/*
    双向链表:LinkedList
*/
public class LinkedListTest01 {
    public static void main(String[] args) {
        //LinkedList集合底层也是有下标的
        //因为LinkedList底层是一个双向链表,所以增删改效率高,但是查的效率低
        LinkedList linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        for(int i = 0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }

        //LinkedList集合没有初始化容量
        //起初这个链表是没有任何元素的.first和last引用都是null.
    }
}
