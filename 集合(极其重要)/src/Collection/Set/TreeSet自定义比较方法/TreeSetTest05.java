    package Collection.Set.TreeSet自定义比较方法;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
先按照年龄升序,如果年龄一样的再按照姓名升序.
*/
public class TreeSetTest05 {
    public static void main(String[] args) {
        Vip vip1 = new Vip("zhangsan",20);
        Vip vip2 = new Vip("wangwu",20);
        Vip vip3 = new Vip("xiaoming",50);
        Vip vip4 = new Vip("xiaogang",25);
        Set<Vip> vipSet= new TreeSet<>();
        vipSet.add(vip1);
        vipSet.add(vip2);
        vipSet.add(vip3);
        vipSet.add(vip4);

        Iterator<Vip> it = vipSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class Vip implements Comparable<Vip>{
    String name;
    int age;

    /*
    compareTo方法的返回值很重要:
        返回 0 表示相同,value会覆盖
        返回 >0 会继续在右子树上找
        返回 <0 会继续在左子树上找
    */
    @Override
    public int compareTo(Vip o) {
        if(this.age==o.age) {
            //年龄相等按照名字排序.
            //姓名是String类型,直接调用compareTo来完成比较.
            return this.name.compareTo(o.name);
        } else return this.age-o.age;

    }

    public Vip(String name, int id) {
        this.name = name;
        this.age = id;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", id=" + age +
                '}';
    }
}
