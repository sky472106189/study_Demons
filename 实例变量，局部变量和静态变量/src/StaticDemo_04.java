public class StaticDemo_04 {

    /*
    静态代码块对于定义在它之后的静态变量，可以赋值，但是不能访问。*/

    static
    {
        c = 3;
//        System.out.println(c);//Illegal forward reference
    }

    private static int c;
}
