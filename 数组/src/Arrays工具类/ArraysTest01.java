package Arrays工具类;

import java.util.Arrays;

/*
    使用SUN公司提供的数据工具类:java.util.Arrays;
*/
public class ArraysTest01 {
    public static void main(String[] args) {
        int[] array = {2,3,5,20,3,67,1};

        //进行排序
        Arrays.sort(array);

        for (int a:array) {
            System.out.println(a);
        }
    }
}
