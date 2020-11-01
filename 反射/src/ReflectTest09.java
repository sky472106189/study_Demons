
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    获取某个特定的构造方法,然后创建对象
*/
public class ReflectTest09 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c  = Class.forName("Customer");

        Constructor ct = c.getConstructor(String.class,int.class);
        //Constructor ct = c.getDeclaredConstructor(String.class,int.class);//此方法破封装

        Object o = ct.newInstance("张三",13);

        System.out.println(o);
    }
}
class Customer{
    String name;
    int age;

    public Customer(String name,int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
