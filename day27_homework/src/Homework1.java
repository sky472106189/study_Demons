import java.util.Scanner;

/*
编写程序模拟用户注册：
1.程序开始执行时，提示用户输入"用户名"和"密码"信息.
2.输入信息之后,后台java程序用户注册.
3.注册时用户名要求长度在[6-14]之间,小于或者大于都表示异常.

注意:
    完成注册的方法放到一个单独的类中
    异常类自定义即可

    class UserService{
        public void register(String username,String password)
        //这个方法中完成注册
    }

编写main方法,在main方法中接受用户输入的信息,在main方法中调
用UserService的register方法完成注册.
*/
public class Homework1 {
    //开始注册
    public static void main(String[] args) {
        while(true) {
            System.out.println("请输入你的用户名,以回车确定");
            Scanner in = new Scanner(System.in);
            String username = in.nextLine();

            System.out.println("请输入你的密码,以回车确定");
            String password = in.nextLine();

            UserService us = new UserService();
            us.register(username, password);
        }
    }
}

class UserService{
    public void register(String username,String password){
        if(username.length()<6||username.length()>14){
            try {
                throw new usernameLengthException("用户名长度不合法,长度在[6-14]之间");
            }catch (Exception e){
                System.out.println(e);
            }
        }else{
            System.out.println("注册成功");
        }
    }
}

class usernameLengthException extends Exception{
    usernameLengthException(){}

    usernameLengthException(String s){
        super(s);
    }
}
