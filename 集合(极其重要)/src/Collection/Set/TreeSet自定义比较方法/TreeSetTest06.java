package Collection.Set.TreeSet自定义比较方法;

import java.util.Comparator;
import java.util.TreeSet;

/*
TreeSet集合中元素可排序的第二种方式:使用比较器!

最终的结论:
    放到TreeSet或者TreeMap集合key部分的元素要想排序,包括两种方式:
        第一种:放在集合中的元素实现java.lang.Comparable接口.
        第二种:在构造TreeSet或者TreeMap集合的时候,给它传一个比较器对象.

Comparable和Comparator怎么选择呢?
    当比较规则不会发生改变的时候,或者说当比较规则只有一个的时候,建议实现Comparable接口
    如果比较规则有多个,并且需要多个比较规则之间频繁切换,建议使用Comparator接口.

    Comparator接口的设计符合OCP原则.
*/
public class TreeSetTest06 {
    public static void main(String[] args) {
        //创建集合的同时,要使用这个比较器.
        //TreeSet<Animal> animals = new TreeSet<>();这样不行,没有通过构造方法传递一个比较器进去
        //给构造方法传递一个比较器
        // TreeSet<Animal> animals = new TreeSet<>(new AnimalComparator());
        //可以使用匿名内部类的方式
        TreeSet<Animal> animals = new TreeSet<>(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.age - o2.age;
            }
        });



        animals.add(new Animal(2));
        animals.add(new Animal(10));
        animals.add(new Animal(0));
        animals.add(new Animal(-1));

        for(Animal a : animals){
            System.out.println(a);
        }


    }
}
class Animal{
    int age;

    public Animal(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                '}';
    }
}
//单独在这里编写一个比较器
//比较器实现java.util.Comparator接口.(Comparable是java.lang包下的.Comparator是util下的)

/*class AnimalComparator implements Comparator<Animal>{
    @Override
    public int compare(Animal o1, Animal o2) {
        //指定比较规则
        //按照年龄排序(升序)
        return o1.age-o2.age;
    }
}
class AnimalComparator1 implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        //指定比较规则
        //按照年龄排序(降序)
        return o2.age - o1.age;
    }
}*/
