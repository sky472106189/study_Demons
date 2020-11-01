package JDBC_CLOB_BLOB;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.*;

/**
 * Created by 15173 on 2020/3/4.
 * 通过JDBC连接数据库,存放音乐文件
 */

public class JDBC_SaveBLOB {

    public static void main(String[] args){
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            //通过JDBC存储大文本数据(小说)
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqltest","root","123");
            String sql = "insert into mynove VALUE (?,?)";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1,1);

            InputStream in = new FileInputStream("C:\\test.txt");
            Reader reader = new InputStreamReader(in,"UTF-8");//转换流可以设置编码，防止乱码
            pstm.setCharacterStream(2,reader);

            pstm.executeUpdate();
            reader.close();
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
            if(pstm != null){
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
