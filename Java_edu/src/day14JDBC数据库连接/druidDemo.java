package day14JDBC���ݿ�����;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class druidDemo {
    public static void main(String[] args) throws Exception {

        Properties pro = new Properties();

        //ͨ����ǰ���class�����ȡ��Դ�ļ�
        InputStream is = druidDemo.class.getClassLoader().getResourceAsStream("com/druid.properties");
        pro.load(is);

        //���ص���DataSource������DruidDataSource
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);

        //��ȡ���Ӷ���

        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
