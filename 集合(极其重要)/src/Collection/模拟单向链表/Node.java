package Collection.模拟单向链表;

/*
单链表的节点
    节点是单向链表的基本单元.
    每一个节点Node都有两个属性:
        一个属性存储数据
        一个属性存储下一个节点的内存地址
*/
public class Node {
    //存储的数据
    Object element;
    //下一个节点的内存地址
    Node next;

    public Node(){}

    public Node(Object element,Node next){
        this.element = element;
        this.next = next;
    }
}
