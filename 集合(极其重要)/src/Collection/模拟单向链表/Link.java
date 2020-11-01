package Collection.模拟单向链表;

public class Link {
    //头节点
    private Node header = null;

    private int size = 0;

    public int Size(){
        return size;
    }

    //向链表中添加元素
    public void add(Object obj){
        //创建一个新的节点对象
        //让之前单链表的末尾节点next指向新的节点对象.
        //有可能这个元素是第一个,也有可能是第二个,也有可能是第三个
        if(header == null){
            //说明还没有节点
            //new一个新的节点对象,作为头结点,同时也是尾节点
            header = new Node(obj,null);
        }else{
            //说明已经有节点了
            //采用尾插法
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(obj,null);
        }
        size++;

    }

    //查找末尾节点的方法
    private Node findLast(Node header) {
        //判断header是否为尾节点
        while (header.next != null){
            //执行到此说明不是
            header = header.next;
            findLast(header);
        }
        //执行到此说明是
        return header;
    }

    //删除链表中某个数据的方法
    public void remove(Object obj){

    }

    //修改链表中某个数据的方法
    public void modify(Object obj){

    }

    //查找链表中某个元素的方法
    public Object find(Object obj){
        return null;
    }
}
