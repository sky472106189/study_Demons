import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
java.util.Collection 集合接口
java.util.Collections 集合工具类,方便集合的操作
*/
public class CollectionsTest {
    public static void main(String[] args) {
        //ArrayList不是线程安全的
        List<String> list = new ArrayList();
        //变成线程安全的
        Collections.synchronizedList(list);

        //排序
        list.add("k");
        list.add("b");
        list.add("x");
        list.add("a");
        list.add("h");
        Collections.sort(list);
        for(String s :list){
            System.out.println(s);
        }

        List<Person> people = new ArrayList<>();
        Person p1 = new Person(11);
        Person p2 = new Person(-1);
        people.add(p1);
        people.add(p2);
        Collections.sort(people);//自定义类必须实现Comparable接口才行
//      Collections.sort(list集合,比较器对象); 这个方法Comparator比较器就可以.
    }
}
class Person implements Comparable<Person>{
    int age;

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }

    public Person(int age) {
        this.age = age;
    }

}
