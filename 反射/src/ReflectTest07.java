import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    获取某个特定的方法,并且调用

    以前:
    CustomerService cs = new CustomerService();
    boolean flag = cs.login("zs","123");
*/
public class ReflectTest07 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class c = Class.forName("CustomerService");

        //获取某个特定的方法
        //方法名+形参列表(因为存在方法的重载,所以形参列表要指定)
        Method m = c.getDeclaredMethod("login", String.class, String.class);

        //通过反射机制执行login方法.
        Object o = c.newInstance();
        //调用o对象的m方法,调用zs+123参数,方法的执行结果retValue;
        Object retValue = m.invoke(o,"zs","123");

        System.out.println(retValue);

    }
}
