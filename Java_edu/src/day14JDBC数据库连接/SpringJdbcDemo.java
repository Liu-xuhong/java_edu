package day14JDBC���ݿ�����;


/*
 * JdbcTemplateѧϰ
 *
 */

import day14JDBC���ݿ�����.utils.JDBCutils;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbcDemo {
    public static void main(String[] args) {
        //1.����jar��

        //2.����JdbcTemplate����
        JdbcTemplate template = new JdbcTemplate(JDBCutils.getDatasource());

        //3.���÷���
        String sql = "update user set qianbao = '6666' where id = ?";
        int count = template.update(sql,1);
        System.out.println(count);
    }
}
