package Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
关于java.util.Collection接口中常用的方法
    1.Collection中能放什么元素?
        没有使用<泛型>之前,Collection中可以存放Object的所有子类型
        使用了<泛型>,Collection只能存储某个具体的类型

    2.Collection中的常用方法
        boolean add(Object e)   向集合中添加元素
        int size()  获取集合中元素的个数
        void clear() 清空集合
        boolean contains(Object o) 判断当前集合中是否包含元素o,包含返回true,反之亦反
        boolean remove(Object o)  删除集合中的指定元素o.
        boolean isEmpty() 判断集合是否为空
        Object[] toArray()  调用这个方法把集合转换成数组.
*/
public class CollectionTest01 {

    public static void main(String[] args) {
        //创建一个集合对象
//        Collection e = new Collection();  接口是抽象的无法实例化
        Collection arrylist = new ArrayList();//多态
        //常用方法
        arrylist.add(100);//自动装箱,实际上放进去了一个对象(x)的内存地址.Integer x = new Integer(100);

        System.out.println(arrylist.size());

        arrylist.clear();

        arrylist.add("绿巨人");
        System.out.println(arrylist.contains("绿巨人"));

        System.out.println(arrylist.remove("不存在"));

        System.out.println(arrylist.isEmpty());

        arrylist.clear();
        arrylist.add("1");
        arrylist.add(2);
        arrylist.add(3);
        arrylist.add(new Student ());
        Object[] objects = arrylist.toArray();
        for(Object str:objects){
                System.out.println(str);
        }


    }
}
class Student{}
