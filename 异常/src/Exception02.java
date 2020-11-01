/*
final finally finalize 什么区别
*/
public class Exception02 {
    public static void main(String[] args) {
        //final 是一个关键字,表示修饰的是最终的,不变的
        final int i = 100;

        //final 也是一个关键字,和try联用,使用在异常语句中
        try{}
        finally {
            System.out.println("finally...");
        }

        //finalize()是Object类中的一个方法,作为方法名出现
        //所以finalize是标识符
        //finalize()方法是JVM的GC垃圾回收器负责调用
    }
}
