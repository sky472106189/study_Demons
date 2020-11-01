import com.sun.org.apache.xpath.internal.operations.Mod;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/*
    java.lang.reflect.Constructor
    获取类中的构造方法
*/
public class ReflectTest08 {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException {
        Class c = Class.forName("java.lang.String");

/*
        //获取所有的构造
        Constructor[] cts = c.getDeclaredConstructors();

        for(Constructor ct:cts){
            //获取修饰符
            System.out.println(Modifier.toString(ct.getModifiers()));
            //获取方法名
            System.out.println(c.getSimpleName());
            //获取形参列表
            Class[] ParameterTypes = ct.getParameterTypes();
            for(Class types :ParameterTypes)
                System.out.println(types.getSimpleName());
        }
*/
        //反编译
        StringBuffer sb = new StringBuffer();
        Constructor[] cts = c.getDeclaredConstructors();
        sb.append(Modifier.toString(c.getModifiers())+" class ");
        sb.append(c.getSimpleName()+"{\n");

        //构造方法
        for(Constructor ct:cts){
            sb.append("\t");
            sb.append(Modifier.toString(ct.getModifiers())+" ");        //public String(形参1，形参2)
            sb.append(c.getSimpleName()+"(");
            //形参列表
            Class[] ParameterTypes = ct.getParameterTypes();

            for(int i = 0 ;i<ParameterTypes.length;i++){
                Class types = ParameterTypes[i];
                if (i==ParameterTypes.length-1) {  //
                    sb.append(types.getSimpleName());

                }else
                    sb.append(types.getSimpleName()+",");
            }

            sb.append("){\n");
        }

            sb.append("}");

        System.out.println(sb);
    }
}
