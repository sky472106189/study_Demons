package 一维数组;

/**
 * Created by 15173 on 2020/3/6.
 */

/*
    main方法上的"String[] args"有什么用?
        分析一下:谁负责调用main方法(JVM)
        JVM调用main方法的时候,会自动传一个String数组args过来.
*/
public class ArrayTest05 {
    public static void main(String[] args) {
        //JVM默认传递过来的数组对象的长度?默认0
        //通过测试得出:args不是null.
        System.out.println("JVM给传递过来的数组参数,他这个数组的长度是:"+args.length);

        //这个数组什么时候会有值呢?
        //其实这个数组是留给用户的,用户可以在控制台上输入参数,这个参数会自动被转换为"String[] args"
        //例如:这样运行程序:java ArrayTest05 abc def xyz
        //那么这个时候JVM会自动将abc def xyz通过空格的方式进行分离,分离完成之后,自动放到String[] args当中
        //所以main方法中的String[] args数组主要是用来接收用户输入参数的.
        //把abc def xyz转换成字符数组{"abc","def","xyz"}

        //用dos窗口模拟会更直接
        //javac 文件名(编译); java 文件名(运行)
        //例如 javac ArrayTest05
        //     java ArrayTest05 abc def xyz
        //  那么abc def xyz就会写进String[] args数组里面,输出测试就可以验证
    }

}
