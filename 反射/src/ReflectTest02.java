/*
    关于静态语句块的加载
*/
public class ReflectTest02 {
    public static void main(String[] args) throws ClassNotFoundException {
        //将A.class文件装在到虚拟机的过程
        //Class.forName("A");

        //不会执行静态语句块
        //Class c = A.class;

        A a = new A();
        Class c = a.getClass();
    }
}
class A{
    static {
        System.out.println("A的static语句块在类加载时就执行,且只执行一次");
    }
}
