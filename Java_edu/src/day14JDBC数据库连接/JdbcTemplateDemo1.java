package day14JDBC���ݿ�����;

import day14JDBC���ݿ�����.utils.JDBCutils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JdbcTemplateDemo1 {
    //��ȡJdbcTemplated����
    JdbcTemplate template = new JdbcTemplate(JDBCutils.getDatasource());
    @Test
    //�޸�idΪ1��Ǯ��Ϊ9999
    public void test1(){
        //ִ��sql
        String sql = "update user set qianbao = '9999' where id = ?";
        //��ȡִ�н����ֵ��count
        int count = template.update(sql,1);
        //���ִ�н��
        System.out.println("sql���ִ�гɹ��������޸���---"+count+"---������");
    }

    @Test
    //���һ����¼
    public void test2(){
        //ִ��sql
        String sql = "insert into user values (null ,?,?)";
        //��ȡִ�н����ֵ��count
        int count = template.update(sql,"����",7777);
        //���ִ�н��
        System.out.println("sql���ִ�гɹ��������޸���---"+count+"---������");
    }

    @Test
    //ɾ���ո���ӵļ�¼
    public void test3(){
        //ִ��sql
        String sql = "delete from user  where id = ?";
        //��ȡִ�н����ֵ��count
        int count = template.update(sql,7);
        //���ִ�н��
        System.out.println("sql���ִ�гɹ��������޸���---"+count+"---������");
    }

    @Test
    //��ѯidΪ1�ļ�¼���������װΪmap����
    //ע�⣺���������ѯ�Ľ����ֻ����1�����ֶ�����Ϊkey���������Ϊvalue
    public void test4(){
        //ִ��sql
        String sql = "select * from user where id = ?";
        //����ѯ�Ľ��װ�ص�map������
        Map<String,Object> map =  template.queryForMap(sql,1);
        //���ִ�н��
        System.out.println(map);
    }

    @Test
    //��ѯ���еļ�¼���������װΪlist����
    //ע�⣺��ÿһ����¼��װΪһ��map���ϣ��ٽ�map����װ�ص�list������
    public void test5(){
        //ִ��sql
        String sql = "select * from user";
        ////����ѯ��map���װ�ص�list������
        List<Map<String,Object>> list =  template.queryForList(sql);
        //���ִ�н��
        for (Map<String,Object> stringObjectMap : list){
            System.out.println(stringObjectMap);
        }
    }

    @Test
    //��ѯ���еļ�¼���������װΪUser�����list����
    //ע�⣺����ѯ�����װΪ���󼯺�
    public void test6(){
        //ִ��sql
        String sql = "select * from user";
        //��ȡִ�н����ֵ��count
        List<user> list = template.query(sql, new RowMapper<user>() {
            @Override
            public user mapRow(ResultSet rs, int i) throws SQLException {
                user u = new user();
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String qianbao = rs.getString("qianbao");

                u.setId(id);
                u.setName(name);
                u.setQianbao(qianbao);
                return u;
            }
        });
        //���ִ�н��
        for (user u : list){
            System.out.println(u);
        }
    }

    @Test
    //��ѯ���еļ�¼���������װΪlist����
    //ע�⣺��ÿһ����¼��װΪһ��map���ϣ��ٽ�map����װ�ص�list������
    public void test7(){
        //ִ��sql
        String sql = "select * from user";
        //��ȡִ�н����ֵ��count
        List<user> list =  template.query(sql,new BeanPropertyRowMapper<user>(user.class));
        //���ִ�н��
        for (user u : list){
            System.out.println(u);
        }
    }

    @Test
    //��ѯ���еļ�¼��
    //ע�⣺��ÿһ����¼��װΪһ��map���ϣ��ٽ�map����װ�ص�list������
    public void test8(){
        //ִ��sql
        String sql = "select count(id)from user";
        //��ȡִ�н����ֵ��count
        Long total = template.queryForObject(sql,Long.class);
        //���ִ�н��
        System.out.println(total);
    }
}
