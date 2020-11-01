/*
    关于类获取父类和父接口
*/
public class ReflectTest10 {
    //通过反射机制获取 String 类的父类和父接口
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("java.lang.String");

        //获取父类
        Class father = c.getSuperclass();
        System.out.println(father.getSimpleName());

        //获取父接口
        //因为接口支持多继承(实现),所以必须数组
        Class[] InterfaceFather = c.getInterfaces();
        for(Class cs:InterfaceFather){
            System.out.println(cs.getSimpleName());
        }
    }
}
