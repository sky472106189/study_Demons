import static java.lang.Math.*;

public class StaticDemo_06 {
    /*
     1、简化了一些操作，比如静态导入Math下的所有静态资源，在频繁使用Math类下静态资源的地方，可以少些很多“Math.”
     2、降低了代码的可读性
     */

    public static void main(String[] args){
//        System.out.println(sin(2.2)); 使用import java.lang.Math.*;
        System.out.println(sin(2.2)); //使用import static java.lang.Math.*;
    }
}
