package 一维数组;

/**
 * Created by 15173 on 2020/3/6.
 */
/*
    当一个方法参数是数组的时候,我们还可以采用这种方式传
*/
public class ArrayTest04 {
    public static void main(String[] args) {
        //静态初始化
        int[] a = {1,2,3};
        printArray(a);

        //重要示范
        //printArray({1,2,3,});没有这种写法,会报错
        printArray(new int[]{1,2,3});
        System.out.println("=====================");
        printArray(new String[]{"a","b","c"});
    }

    public static void printArray(int[] array){
        for(int a1:array){
            System.out.println(a1);
        }
    }
    public static void printArray(String[] array){
        for(String a1:array){
            System.out.println(a1);
        }
    }
}
