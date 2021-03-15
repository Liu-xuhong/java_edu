package day14JDBC数据库连接;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class druidDemo {
    public static void main(String[] args) throws Exception {

        Properties pro = new Properties();

        //通过当前类的class对象获取资源文件
        InputStream is = druidDemo.class.getClassLoader().getResourceAsStream("com/druid.properties");
        pro.load(is);

        //返回的是DataSource，不是DruidDataSource
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);

        //获取连接对象

        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
