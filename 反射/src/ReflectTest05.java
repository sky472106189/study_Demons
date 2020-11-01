/*
    java.lang.reflect.Field:获取某个指定的属性
*/

import java.io.File;
import java.lang.reflect.Field;

public class ReflectTest05 {
    public static void main(String[] args) throws Exception {

        //以前的方式
        Employee e = new Employee();
        e.setName("12");
        System.out.println(e.getName());

        //获取类
        Class c = Class.forName("Employee");

        //获取name属性
        Field file = c.getDeclaredField("name");

        //获取某个特定的属性
        Object o = c.newInstance();

        //打破封装(name是private)
        file.setAccessible(true); //使用反射机制可以打破封装性,导致了java对象的属性不安全.

        //给o对象的id属性赋值
        file.set(o,"112");

        //得到值
        System.out.println(file.get(o));
    }
}
