package 二维数组;

/**
 * Created by 15173 on 2020/3/7.
 */

/*
    二维数组的遍历
*/
public class ArrayTest03 {
    public static void main(String[] args) {

        String[][] array={
                {"Hello","World","oracle","java"},
                {"张三","李四","王五"},
                {"lucy","jack"}
        };

        //遍历
        for(int i = 0; i<array.length;i++) //控制行下标
            for(int j = 0; j<array[i].length;j++){ //控制列下标
                System.out.println(array[i][j]);
            }
    }
}
