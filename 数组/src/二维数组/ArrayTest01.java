package 二维数组;

/**
 * Created by 15173 on 2020/3/7.
 */

/*
 关于java中的二维数组
    1.二维数组其实是一个特殊的一维数组,特殊在这个一维数组当中的每一个元素是一个一维数组.
    2.三维数组是什么?
        三维数组是一个特殊的二维数组,特殊在这个二维数组中每一个元素是一个一维数组
        实际的开发中,使用最多的是一维数组,二维数组较少使用,三维数组几乎不用
    3.二维数组静态初始化
        int[][] array = {{1,2,3,4},{5,6,7},{2,2,2},{0,9,5}};
*/
public class ArrayTest01 {
    public static void main(String[] args) {
        //一维数组
        int[] array = {1,2,3,4};
        System.out.println(array.length);//4

        //二维数组
        //里面4个一维数组
        int[][] a = {   //4行4列
                {100,2,4},
                {2,62,73,8},
                {0,7,4},
                {10}
        };
        System.out.println(a.length);//4,因为4行
        System.out.println(a[0].length);//3
        System.out.println(a[1].length);//4
        System.out.println(a[2].length);//3
        System.out.println(a[3].length);//1
    }
}
