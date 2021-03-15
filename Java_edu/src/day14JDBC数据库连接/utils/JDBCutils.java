package day14JDBC数据库连接.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/*
* Druid连接池的工具类
*
* */

public class JDBCutils {
//    定义成员变量
    private static DataSource ds;
    static {
        Properties pro = new Properties();
        try {
            //加载配置文件
            pro.load(JDBCutils.class.getClassLoader().getResourceAsStream("com/druid.properties"));

            //获取DataSource
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //获取连接方法
    public static Connection getConnection() throws SQLException {
       return ds.getConnection();
    }

    //获取连接池方法
    public static DataSource getDatasource(){
        return ds;
    }


    //释放资源

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

    //释放资源2
    public static void close(Statement stmt, Connection conn){
        close(null,stmt,conn);
    }
}
