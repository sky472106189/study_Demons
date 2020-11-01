package 二维数组;

/**
 * Created by 15173 on 2020/3/7.
 */

/*
    关于二维数组中元素的:读和改

        a[二维数组中的行下标][二维数组的列下标]

        a[0][0]:表示第一行第一列的元素 //24


*/
public class ArrayTest02 {
    public static void main(String[] args) {
        //二维数组
        int[][] a = {
                {24,6,7},
                {6,8,0,2},
                {0}
        };

        //请取出以上二维数组中的第一个一维数组.
        int[] a0 = a[0];
        for (int fa : a0){
            System.out.println(fa);
        }

        //改
        a[0][0]= 100;
        System.out.println(a[0][0]);
    }
}
