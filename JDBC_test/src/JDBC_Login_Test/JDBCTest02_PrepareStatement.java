package JDBC_Login_Test;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by 15173 on 2020/3/3.
 * 1.解决SQL注入问题
 *      只要用户提供的心思不参与SQL语句的编译过程，问题就解决了
 *      即使用户的提供的信息中含有SQL语句的关键字，但是没有参与编译，不起作用.
 *      要想用户信息不参与SQL语句的编译，必须使用java.sql.PrepareStatement
 *      PreparedStatement接口继承了java.sql.Statement
 *      PreparedStatement是属于预编译的数据库操作对象
 *      PreparedStatement的原理是:预先对SQL语句的框架进行编译,然后再给SQL语句传"值"
 */
public class JDBCTest02_PrepareStatement {
    public static void main(String[] args) {
        //初始化一个界面
        Map<String, String> userLoginInfo = initUI();
        //验证用户名和密码
        boolean loginSuccess = login(userLoginInfo);
        //最后输入结果
        System.out.println(loginSuccess ? "登录成功" : "登录失败");
    }

    /**
     * 用户登录
     *
     * @param userLoginInfo 用户登录信息
     * @return false表示失败，true表示成功
     */
    private static boolean login(Map<String, String> userLoginInfo) {
        //打标记的意识
        boolean flag = false;
        //单独定义变量
        String loginName = userLoginInfo.get("Loginname");
        String loginPwd = userLoginInfo.get("Loginpwd");
        //JDBC代码
        Connection conn = null;
        PreparedStatement pstmt = null; //这里使用PreparedStatement,预编译的数据库操作对象
        ResultSet rs = null;

        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqltest", "root", "123");
            //3.获取预编译数据库操作对象
                //sql语句框架，一个?表示一个占位符,一个？将来接受一个"值",注意：占位符不能使用单引号括起来.
            String sql = "SELECT * from tt_user where username = ? and password = ? ";
                //程序执行到此处,会发送sql语句给DBMS,然后DBMS进行sql语句的预先编译.
            pstmt = conn.prepareStatement(sql);
                //给占位符?传值(第一个?下标是1,第二个?下标是2,JDBC中所有下标从1开始.)
            pstmt.setString(1,loginName);
            pstmt.setInt(2, Integer.parseInt(loginPwd));
            //4.执行sql
            rs = pstmt.executeQuery();
            //5.处理结果集
            if (rs.next()) {
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //6.释放资源
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }

    /**
     * 初始化用户界面
     * @return 用户输入的用户名和密码等登录信息
     */
    private static Map<String,String> initUI() {
        Scanner s = new Scanner(System.in);

        System.out.println("用户名");
        String name = s.nextLine();

        System.out.println("密码");
        String pwd = s.nextLine();

        Map<String,String> userLoginInfo = new HashMap<>();
        userLoginInfo.put("Loginname",name);
        userLoginInfo.put("Loginpwd",pwd);

        return userLoginInfo;
    }


}
