package 泛型;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
JDK8之后,引入了:自动类型推断机制.(又称为钻石表达式)

*/
public class GenericTest02 {
    public static void main(String[] args) {
        //ArrayList<这里的类型会自动推断>,前提是JDK8之后才运行.
        //自动类型推断(钻石表达式)
        List<Animal> mylist = new ArrayList<>();

        mylist.add(new Dog());
        mylist.add(new Bird());

        Iterator<Animal> it = mylist.iterator();
        while(it.hasNext()){
            Animal a = it.next();
        }
    }
}
