package Collection.Set.TreeSet自定义比较方法;

import java.util.Set;
import java.util.TreeSet;

/*
    TreeSet对自定义类的排序
    第一种方法:实现Comparable接口
*/
public class TreeSetTest04 {
    public static void main(String[] args) {
        Customer p1 = new Customer(20);
        Customer p2 = new Customer(21);
        Customer p3 = new Customer(19);

        Set<Customer> Customers = new TreeSet<>();
        Customers.add(p1);
        Customers.add(p2);
        Customers.add(p3);

        for(Customer i:Customers)
            System.out.println(i);

    }
}

//放在TreeSet集合的元素需要时间java.lang.Comparable接口.
//并且实现compareTo方法,equals可以不写.
class Customer implements Comparable<Customer>{
    int age;

    //需要在这个方法中编写比较的逻辑,或者说比较的规则,按照什么进行比较?
    //k.compareTo(t.key)
    //拿着参数k和集合中的每一个k进行比较,返回值可能是>0,<0,=0
    //比较规则最终还是程序员指定;例如按照年龄升序.或者按照年龄降序.
    public int compareTo(Customer c) {//c1.compareTo(Customer c2)
        //this是c1
        //c是c2
        //c1和c2比较就是 this和 o比较
/*      int age1 = this.age;
        int age2 = c.age;
        if(age1 == age2) return 0;
        else if(age1 > age2) return 1;
        else return -1;*/
        return this.age - c.age;
    }

    public Customer(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer[age="+age+"]";
    }

}
