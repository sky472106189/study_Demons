package 一维数组;

import org.omg.CORBA.OBJ_ADAPTER;

/**
 * Created by 15173 on 2020/3/7.
 */

/*
 关于维数组的扩容.
 在java开发中,数组长度一旦确定不可变,那么数组满了怎么办?
    数组满了,需要扩容.
    java中对数组的扩容是:
        先新建一个大容量的数组,然后将小容量数组中的数据一个一个拷贝到大数组当中

    结论:数组库容效率较低,因为涉及到拷贝的问题.所以以后在开发中请注意:尽可能少的进行数组的拷贝
    可以在创建数组对象的时候,预估计多长合适.最后预估准确,这样可以减少数组的扩容次数,提高效率.
*/
public class ArrayTest08 {
    public static void main(String[] args) {
        //java中数组是怎么进行拷贝的呢?
        //System.arraycopy(Object src,  int  srcPos,Object dest, int destPos,int length);

        //拷贝源
        int[] src = {1,11,22,34};

        //拷贝目标(拷贝到这个数组上)
        int[] dest = new int[10];

        //调用JDK System类中的arraycopy方法,完成数组的拷贝
        System.arraycopy(src,1,dest,3,2);

        for (int a1: dest){
            System.out.println(a1); //0 0 0 11 22 0 ... 0
        }

        //String类型数组也可以拷贝
        String[] src1 = {"Hello","World","Java","MySql","JDBC"};
        String[] dest1 = new String[10];
        System.arraycopy(src1,0,dest1,0,src1.length);
        for (String a1: dest1){
            System.out.println(a1);
        }

        Object[] objs = {new Object(),new Object(),new Object()};
        Object[] dest2 = new Object[10];
        System.arraycopy(objs,0,dest2,0,objs.length);
        for(Object o1: dest2){
            System.out.println();
        }
    }
}
