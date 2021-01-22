/**
 * Created by 15173 on 2020/3/6.
 *      类中调用另一个类，报的空指针异常
 *      原因是没有实例化
 */
public class Error1 {
    public static void main(String[] args) {
        User u = new User();
        u.address.display();//空指针异常,因为user类调用了Address类,但是没有new出来.
                         //相当于整个程序只有user存在,没有Address存在

        //以下为解决方法
//        u.address = new Address();
//        u.address.display(); //编译+运行通过
    }
}
class Address{
    String city = "杭州";
    String street = "街道";
    String zipcode = "31000";

    public void display(){
        System.out.println(city+street+zipcode);
    }
}

class User {

//    static{
//        address = new Address();
//    }

    String id;
    String name;
    Address address;
//    static Address address;


}