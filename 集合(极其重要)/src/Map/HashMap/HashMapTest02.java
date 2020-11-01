package Map.HashMap;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
1.向Map集合中存,以及从Map集合中取,都是先调用key的hashCode()方法,然后再调用equals()方法!
equals()方法有可能调用
    用put(k,v)方法举例,什么时候equals()不会调用?
        k.hashCode()方法返回哈希值.
        哈希值经过哈希算法转换成数组下标
        数组下标位置上如果是null,equals()不会调用.

2.注意:如果一个类的equals()重写了,那么hashCode()方法必须重写.
并且equals()方法返回true,hashCode()返回的值必须一样.
    equals()方法返回true,表示两个对象相同,在同一个单向链表上比较.
    那么对于同一个单向链表上的节点来说,他们的哈希值都是相同的.
    所以hashCode()方法的返回值也必须相同.

3.hashCode()方法和equals()方法不用研究了,可以直接用IDEA工具生成,但是这两个方法要同时生成!
*/
public class HashMapTest02 {
    public static void main(String[] args) {
        Student s1 = new Student("张三");
        Student s2 = new Student("张三");
        System.out.println(s1.equals(s2));//重写之前是false,重写之后是true

        System.out.println("s1的哈希值"+s1.hashCode());//s1的哈希值21685669 重写之后s1的哈希值774920
        System.out.println("s2的哈希值"+s2.hashCode());//s2的哈希值2133927002 重写之后s2的哈希值774920
        //原因是因为没有重写hashCode()方法,里面存的是s1和s2的内存地址,而s1和s2的内存地址很显然不同,于是不同的内存地址调用hashCode()方法也不同
        //解决方法就是针对Student里面的name来写hashCode(),这样的话,就行了

        //s1.equals(s2)结果已经是true了,表示s1和s2是一样的,相同的.那么往HashSet集合中放的话
        //按说只能放进去一个.(HashSet:有序不可重复)
        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        System.out.println(set.size());//2 但是这个结果按说是1
    }
}
class Student{
    private String name;

    public int hashCode(){
        return Objects.hash(name);
    }
    //equals:如果学生名字一样,表示同一个学生.
    public boolean equals(Object obj){
        if(obj==null|| !(obj instanceof Student)) return false;
        if(obj==this) return true;
        Student s = (Student)obj;
        return this.name.equals(s.name);
    }
    public Student() {
    }

    public Student(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
