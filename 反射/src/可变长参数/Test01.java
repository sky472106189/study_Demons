package 可变长参数;

import java.util.Date;

/*
    关于java中的可变长参数
*/
public class Test01 {

    //m1方法有一个可变长参数
    public static void m1(int... a){ //m1方法在调用的时候传递的实参可以是 0-N 个
        System.out.println("Test");
    }

    //如果可以精确匹配的该方法,则调用该方法,不会再去执行可变长参数的那个方法.
    public static void m1(int i){
        System.out.println(i);
    }

    //可变长参数可以看做数组
    public static void m2(String... s){
        for(String str:s){
            System.out.print(str);
        }
    }

    public static void m3(Class... class1) throws IllegalAccessException, InstantiationException {
        for(int i = 0; i <class1.length; i++){
            Class c = class1[i];
            System.out.println(c.newInstance());
        }
    }

    public static void m4(int i,String... s ){//可变长参数只能出现1次,并且只能出现在所有参数的最后一位

    }
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        m1();
        m1(1);
        m1(1,2);
        m1(3,4,5,6,7);

        m2();
        m2("我","是","中","国","人");
        System.out.println();
        String s [] ={"篮球","足球","棒球","桌球"};
        m2(s);
        System.out.println();

        m3(Date.class,Employee.class);
    }
}
