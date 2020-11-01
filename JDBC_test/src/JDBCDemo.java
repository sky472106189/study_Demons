import java.sql.*;

/**
 * Created by 15173 on 2020/3/3.
 */
public class JDBCDemo {

    public static void main(String[] args) { //增删改
        //JDBC代码
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");//加载具体的驱动类
            //2.获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqltest","root","123");
            //3.获取数据库操作对象
            stmt = conn.createStatement();
            //4.执行sql(两大类:增删改;查)
            //String sql = "INSERT into t_user VALUE ('01',123)";
            //String sql = "DELETE from t_user where username='01'";
            //String sql = "UPDATE t_user set password=223 where username='01'";
            //stmt.executeUpdate(sql);//返回值int类型表示增删改了几条数据
            //查询sql
            String sql = "select * from t_user";
            rs = stmt.executeQuery(sql);//查询用executeQuery
            //5.处理结果集
            while(rs.next()){
                String uname = rs.getString("username");
                int upwd = rs.getInt("password");
                System.out.println(uname+":"+upwd);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //释放资源
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stmt != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
