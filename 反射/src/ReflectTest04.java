import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
    java.lang.reflect.Filed; 类中的属性
*/
public class ReflectTest04 {
    public static void main(String[] args) throws Exception {
        //获取整个类
        Class c =Class.forName("Employee");

        /*获取public修饰的Field
        Field[] fields = c.getFields();  //这个方法只能获取公共属性
        System.out.println(fields.length);
        System.out.println(fields[0].getName());*/

/*      获取所有属性
        Field[] fields = c.getDeclaredFields();
        for(Field fis :fields){

            修饰符
            int i = fis.getModifiers();
            System.out.println(Modifier.toString(i));

            类型
            Class type =fis.getType();
            //System.out.println(type.getName());
            System.out.println(type.getSimpleName());

            名称
            System.out.println(fis.getName());
        }
                                                */

        Field[] fields = c.getDeclaredFields();
        for (Field fis : fields){
           /* 修饰符
            Modifier.toString(fis.getModifiers());
              类型
            fis.getType().getSimpleName();
              名字
            fis.getName();*/
            System.out.println(Modifier.toString(fis.getModifiers())+" "+fis.getType().getSimpleName()+" "+fis.getName());
        }
    }
}
