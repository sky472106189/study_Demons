package Collection.List;


import java.util.*;

/*
集合ArrayList的构造方法

*/
public class ArrayListTest02 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        List list2 = new ArrayList(100);

        Collection c = new HashSet();
        c.add(100);
        c.add(200);
        c.add(400);
        c.add(50);
        //通过此构造方法,可以将HashSet集合转换成List集合.
        List list3 = new ArrayList(c);
        for(int i = 0;i<list3.size();i++){
            System.out.println(list3.get(i));
        }


    }
}
