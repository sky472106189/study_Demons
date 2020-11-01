package String存储原理;

public class StringTest02 {
    public static void main(String[] args) {
        String s1 = "hello";
        //"hello"是存储在方法区的字符串常量池中
        //所以这个"hello"不会新建.(因为这个对象已经存在了!)
        String s2 = "hello";
        //分析结果:
        // == 双等号比较的是变量中保存的内存地址
        System.out.println(s1==s2); //true

        String x = new String("xy");
        String y = new String("xy");
        System.out.println(x==y); //false
    }
}
