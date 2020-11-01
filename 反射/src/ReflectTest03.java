import java.text.SimpleDateFormat;
import java.util.Date;

/*
    获取Class对象之后,可以创建该"类"的对象

    public T newInstance()
              throws InstantiationException,
                     IllegalAccessException
*/
public class ReflectTest03 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c = Class.forName("Employee");

        //创建由此 Class 对象表示的类的新实例。
        Object o = c.newInstance();//调用了Employee的无参构造方法
        System.out.println(o);//Employee@14ae5a5

        Class c1 = Class.forName("java.util.Date");
        Object obj = c1.newInstance();

        if(obj instanceof Date){
            Date t = (Date) obj;
            System.out.println(new SimpleDateFormat("YY-MM-DD HH-MM-SS SSS").format((t)));
        }
    }
}
