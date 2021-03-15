package day14JDBC数据库连接;

import com.alibaba.druid.util.JdbcUtils;
import day14JDBC数据库连接.utils.JDBCutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class druidDemo2 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement psmt = null;
        try {
            //获取连接对象
            conn = JDBCutils.getConnection();

            //定义sql
            String sql = "insert into user values(null,?,?)";

            //获取psmt对象
            psmt = conn.prepareStatement(sql);

            //执行sql
            psmt.setString(1,"王五");
            psmt.setString(2,"2000");
            int count = psmt.executeUpdate();

            //打印执行结果
            System.out.println(count);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            //释放资源
            JDBCutils.close(psmt,conn);
        }
    }
}
