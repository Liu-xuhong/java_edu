package day14JDBC数据库连接;


/*
 * JdbcTemplate学习
 *
 */

import day14JDBC数据库连接.utils.JDBCutils;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbcDemo {
    public static void main(String[] args) {
        //1.导入jar包

        //2.创建JdbcTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCutils.getDatasource());

        //3.调用方法
        String sql = "update user set qianbao = '6666' where id = ?";
        int count = template.update(sql,1);
        System.out.println(count);
    }
}
