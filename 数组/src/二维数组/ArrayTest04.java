package 二维数组;

/**
 * Created by 15173 on 2020/3/7.
 */
/*
    动态初始化二维数组
*/
public class ArrayTest04 {
    public static void main(String[] args) {
        //动态初始化,3行4列
        int[][] array = new int[3][4];

        printArray(array);

        printArray(new int[][] {{1,2,3,4},{2,3,4,5},{0},{2,4}});

    }

    public static void printArray(int[][] array){
        //遍历二维数组
        for(int i = 0; i<array.length;i++) { //控制行下标
            for (int j = 0; j < array[i].length; j++) { //控制列下标
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
