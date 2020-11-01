package JDBC_CLOB_BLOB;

import java.io.*;
import java.sql.*;

/**
 * Created by 15173 on 2020/3/4.
 * 通过JDBC连接数据库,读取CLOB（text）数据
 */

public class JDBC_TakeCLOB {

    public static void main(String[] args){
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            //通过JDBC存储大文本数据(小说)
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqltest","root","123");
            String sql = "SELECT novel from mynove where id = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1,1);

            rs = pstm.executeQuery();
           //读取操作，就一行数据，用if就好，不需要while循环多次
            if(rs.next()){
                //只需要novel的数据
                Reader reader = rs.getCharacterStream("novel");
                //IO流输出
                Writer writer = new FileWriter("C:\\123123\\test_1.txt");

                char[] chs = new char[100];
                int len = -1;
                while ((len = reader.read(chs))!=-1){
                    writer.write(chs,0,len);
                }
                writer.close();
                reader.close();
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
