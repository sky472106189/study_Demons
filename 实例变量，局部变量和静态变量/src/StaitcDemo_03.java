
public class StaitcDemo_03 {
    /*
    说明静态资源的加载顺序是严格按照静态资源的定义顺序来加载的
    */

    private static int a = B();

    static
    {
        System.out.println("Enter A.static block");
    }

    public static void main(String[] args) {}

    public static int B()
    {
        System.out.println("Enter A.B()");
        return 1;
    }

    /*
    输出:
    Enter A.B()
    Enter A.static block    */

}

