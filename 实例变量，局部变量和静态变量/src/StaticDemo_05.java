public class StaticDemo_05 {
    /*静态代码块是严格按照父类静态代码块->子类静态代码块的顺序加载的，且只加载一次。*/
}

class A
{
    static
    {
        System.out.println("A.static block");
    }

    public A()
    {
        System.out.println("A.constructor()");
    }
}

class B extends A
{
    static
    {
        System.out.println("B.static block");
    }

    public B()
    {
        System.out.println("B.constructor()");
    }

    public static void main(String[] args)
    {
        new B();
        new B();
        /*输出：
        A.static block
        B.static block
        A.constructor()
        B.constructor()
        A.constructor()
        B.constructor()
        */
    }
}