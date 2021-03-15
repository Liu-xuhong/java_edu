package day14JDBC���ݿ�����.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/*
* Druid���ӳصĹ�����
*
* */

public class JDBCutils {
//    �����Ա����
    private static DataSource ds;
    static {
        Properties pro = new Properties();
        try {
            //���������ļ�
            pro.load(JDBCutils.class.getClassLoader().getResourceAsStream("com/druid.properties"));

            //��ȡDataSource
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //��ȡ���ӷ���
    public static Connection getConnection() throws SQLException {
       return ds.getConnection();
    }

    //��ȡ���ӳط���
    public static DataSource getDatasource(){
        return ds;
    }


    //�ͷ���Դ

    public static void close(ResultSet rs, Statement stmt, Connection conn){
        if (stmt != null){
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (conn != null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (rs != null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    //�ͷ���Դ2
    public static void close(Statement stmt, Connection conn){
        close(null,stmt,conn);
    }
}
