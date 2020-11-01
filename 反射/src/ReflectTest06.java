
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
    java.lang.reflect.Method

    获取类中的所有方法
*/
public class ReflectTest06 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("CustomerService");

        Method[] methods = c.getMethods();
        /*
        for(Method method:methods){


            //修饰符
            System.out.println(Modifier.toString(method.getModifiers()));

            //方法返回值类型
            Class type = method.getReturnType();
            System.out.println(type.getSimpleName());


            //方法名
            System.out.println(method.getName());//显示很多,因为继承了Object类中某些方法

            //形式参数
            Class[] types = method.getParameterTypes();
            for(Class cc:types){
                System.out.println(cc.getSimpleName());
            }

*/

        //反编译
        StringBuffer sb = new StringBuffer();
        sb.append(Modifier.toString(c.getModifiers())+" class ");
        sb.append(c.getSimpleName()+"{\n");

        for(Method method:methods){
            sb.append("\t");//缩进
            sb.append(Modifier.toString(method.getModifiers())+" ");
            sb.append(method.getReturnType().getSimpleName()+" ");
            sb.append(method.getName()+"(");
            //形参
            Class[] types = method.getParameterTypes();
            for(int i = 0 ;i <types.length;i++){
                Class ParameterType = types[i];

                if(i==types.length-1){
                    sb.append(ParameterType.getSimpleName());
                }
                else{
                    sb.append(ParameterType.getSimpleName()+",");
                }
            }

            sb.append("){}\n");

        }

        sb.append("}");

        System.out.println(sb);
    }


}
