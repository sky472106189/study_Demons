package 一维数组;

/**
 * Created by 15173 on 2020/3/6.
 *  每个类型的默认值
 *      数组结构            默认值
 * ----------------------------------
 *      byte                0
 *      short               0
 *      int                 0
 *      long                0
 *      double              0.0
 *      float               0.0F
 *      String              null
 *      boolean             false
 *      char                \u0000
 *      引用数据类型         null
 */

/*
    什么时候用静态初始化?什么时候用静态初始化?
        当你创建数组的时候,确定数组中有哪些具体的元素时,采用静态初始化.
        当你创建数组到时候,不确定将来中有哪些具体的元素时,就采用动态初始化方式,预先分配内存空间
*/
public class ArrayTest02 {
    public static void main(String[] args) {
        int[] a1 = new int[4]; //创建长度为4的int类型数组,每个元素默认值为0;
        //遍历
        for (int a2:a1) {
            System.out.println(a2);
        }
        System.out.println("==========================");

        String[] s1 = new String[6];
        for(int i =0;i<s1.length;i++){
            System.out.println(s1[i]);
        }
        System.out.println("===================================");
        //静态初始化的方式
        String[] s2 = {"abc","def","xyz"};
        for(String s3:s2){
            System.out.println(s3);
        }
        System.out.println("====================================");
        //存储Object,采用静态初始化
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object[] o4 = {o1,o2,o3};
        for (Object s4 : o4) {
            System.out.println(s4);
        }
        System.out.println("=================================");
        Object[] o5 = { new Object(),new Object(),new Object()};
        for (Object s4:o5){
            System.out.println(s4);
        }
        //动态初始化Obj
        Object[] o6 = new Object[10];
    }
}
