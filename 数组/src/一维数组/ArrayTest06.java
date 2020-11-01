package 一维数组;

/**
 * Created by 15173 on 2020/3/6.
 * 模拟一个系统,假设这个系统要使用,必须输入用户名和密码.
 * 利用args数组来完成
 *      注意:IDEA点击RUN,点击EditConfiguration,选中Programe arguments里面输入的
 */
public class ArrayTest06 {
    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("使用该系统时,必须输入用户名和密码,例如:zhangsan 123");
            return;
        }

        //程序还到此处,提供了用户名和密码
        //接下来判断用户名和密码是否正确
        //取出用户名
        String username = args[0];
        //取出密码
        String password = args[1];

        //假设用户是admin,密码是123的时候表示登录成功.其他一律失败
        //if(username.equals("admin")&&password.equals("123"))
        //这样编写可以避免空指针异常
        if("admin".equals(username)&&"123".equals(password)){
            System.out.println("欢迎回来,"+username);
        }else{
            System.out.println("验证失败 ");
        }
    }
}
