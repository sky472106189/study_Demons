
public class 静态变量Demo {
/*  静态变量(类变量，必须用static关键字修饰)
    静态变量从属于类，只要程序加载了类的字节码，静态变量就会被分配空间，即可使用。
    被所有对象共享
    静态代码块 static{} 在类被加载的时候自动调用.

        注意事项:
        （1）静态方法没有this关键字
        （2）静态方法只能访问静态实例变量和静态成员方法

        静态变量和成员变量的区别:
        （1）所属不同：
        静态变量属于类，称为类变量；
        实例变量属于对象，称为对象变量
        （2）内存中位置不同：
        静态变量位于方法区中的静态区
        实例变量存储于堆内存
        （3）内存出现时间不同：
        静态变量随着类的加载而加载，随着类的消失而消失
        实例变量随着对象的创建而存在
        （4）调用不同：
        静态变量可以通过类名调用，也可以通过对象名调用
        实例变量只能通过对象名调用
    */
    public static void main(String[] args) {
        int i;
        StaticTest.y = StaticTest.y+1;
        StaticTest m = new StaticTest();
        StaticTest n = new StaticTest();
        m.x = m.x+3;
        m.y = m.y+3;
        n.x = n.x+5;
        n.y = n.y+5;
        System.out.println("m.x="+m.x+"m.y"+m.y);
        System.out.println("n.x="+n.x+"n.y"+n.y);
        /*
        结果:
        m.x=4   m.y=10
        n.x=6    n.y=10
        */
    }

}
class StaticTest{
    public int x = 1;
    public static int y = 1;
}