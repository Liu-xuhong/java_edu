package day14JDBC���ݿ�����;

import com.alibaba.druid.util.JdbcUtils;
import day14JDBC���ݿ�����.utils.JDBCutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class druidDemo2 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement psmt = null;
        try {
            //��ȡ���Ӷ���
            conn = JDBCutils.getConnection();

            //����sql
            String sql = "insert into user values(null,?,?)";

            //��ȡpsmt����
            psmt = conn.prepareStatement(sql);

            //ִ��sql
            psmt.setString(1,"����");
            psmt.setString(2,"2000");
            int count = psmt.executeUpdate();

            //��ӡִ�н��
            System.out.println(count);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            //�ͷ���Դ
            JDBCutils.close(psmt,conn);
        }
    }
}
