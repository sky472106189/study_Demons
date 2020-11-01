package 一维数组;

/**
 * Created by 15173 on 2020/3/6.
 */
public class ArrayTest03 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4};
        String[] s1 = {"a","b","c"};
        printArray(array);
        printArray(s1);

        printArray(new String[2]);
        printArray(new int[2]);


    }

    public static void printArray(int[] array){
        for(int a1:array){
            System.out.print(a1+",");
        }
    }

    public static void printArray(String[] array){
        for(String s1:array){
            System.out.print(s1+",");
        }
    }
}
