package 一维数组;

/**
 * Created by 15173 on 2020/3/6.
 */
public class ClassTest {
    public static void main(String[] args) {
        User[] u1 = new User[2];//存了5个但是并没有任何实际存在的对象,所以地址指向null
        for (User s1:u1) {
            System.out.println(s1);//两个null
        }
        System.out.println("========================");
        User[] uu1 = {new User("张三"),new User("王五")};
        for (User s1:uu1) {
            System.out.println(s1);// User@14ae5a5;User@7f31245a 输出了两个引用的内存地址.
            System.out.println(s1.getName());//调用User里的方法,成功显示相应的名字
        }

    }


}
class User{
    String name;

    public User(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
