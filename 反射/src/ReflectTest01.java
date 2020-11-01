import java.util.Date;

/*
    获取Clss类型对象的三种方式:
*/
public class ReflectTest01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //第一种方式
        Class c1 = Class.forName("Employee");//c1引用保存内存地址指向堆中的对象,该对象代表的是Employee整个类.

        //第二种方式:
        //java中每个类型都有 class 属性.
        Class c2 = Employee.class;

        //第三种方式:
        //java中任何一个java对象都有 getClass 方法
        Employee e = new Employee();
        Class c3 = e.getClass();

        //因为Employee这个类在JVM只有一个,所以c1,c2,c3的内存地址是相同的,指向堆中唯一的一个对象
        System.out.println(c1==c2);
        System.out.println(c2==c3);

        Class cd1 = Date.class;
        Class cd2 = Class.forName("java.util.Date");
        Date date = new Date();
        Class cd3 = date.getClass();

    }
}
