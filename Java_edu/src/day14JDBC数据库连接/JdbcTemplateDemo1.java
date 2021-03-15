package day14JDBC数据库连接;

import day14JDBC数据库连接.utils.JDBCutils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JdbcTemplateDemo1 {
    //获取JdbcTemplated对象
    JdbcTemplate template = new JdbcTemplate(JDBCutils.getDatasource());
    @Test
    //修改id为1的钱包为9999
    public void test1(){
        //执行sql
        String sql = "update user set qianbao = '9999' where id = ?";
        //获取执行结果赋值到count
        int count = template.update(sql,1);
        //输出执行结果
        System.out.println("sql语句执行成功，本次修改了---"+count+"---条数据");
    }

    @Test
    //添加一条记录
    public void test2(){
        //执行sql
        String sql = "insert into user values (null ,?,?)";
        //获取执行结果赋值到count
        int count = template.update(sql,"赵六",7777);
        //输出执行结果
        System.out.println("sql语句执行成功，本次修改了---"+count+"---条数据");
    }

    @Test
    //删除刚刚添加的记录
    public void test3(){
        //执行sql
        String sql = "delete from user  where id = ?";
        //获取执行结果赋值到count
        int count = template.update(sql,7);
        //输出执行结果
        System.out.println("sql语句执行成功，本次修改了---"+count+"---条数据");
    }

    @Test
    //查询id为1的记录，并将其封装为map集合
    //注意：这个方法查询的结果集只能是1，将字段名作为key，将结果作为value
    public void test4(){
        //执行sql
        String sql = "select * from user where id = ?";
        //将查询的结果装载到map集合里
        Map<String,Object> map =  template.queryForMap(sql,1);
        //输出执行结果
        System.out.println(map);
    }

    @Test
    //查询所有的记录，并将其封装为list集合
    //注意：将每一条记录封装为一个map集合，再将map集合装载到list集合中
    public void test5(){
        //执行sql
        String sql = "select * from user";
        ////将查询的map结果装载到list集合里
        List<Map<String,Object>> list =  template.queryForList(sql);
        //输出执行结果
        for (Map<String,Object> stringObjectMap : list){
            System.out.println(stringObjectMap);
        }
    }

    @Test
    //查询所有的记录，并将其封装为User对象的list集合
    //注意：将查询结果封装为对象集合
    public void test6(){
        //执行sql
        String sql = "select * from user";
        //获取执行结果赋值到count
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
        //输出执行结果
        for (user u : list){
            System.out.println(u);
        }
    }

    @Test
    //查询所有的记录，并将其封装为list集合
    //注意：将每一条记录封装为一个map集合，再将map集合装载到list集合中
    public void test7(){
        //执行sql
        String sql = "select * from user";
        //获取执行结果赋值到count
        List<user> list =  template.query(sql,new BeanPropertyRowMapper<user>(user.class));
        //输出执行结果
        for (user u : list){
            System.out.println(u);
        }
    }

    @Test
    //查询所有的记录数
    //注意：将每一条记录封装为一个map集合，再将map集合装载到list集合中
    public void test8(){
        //执行sql
        String sql = "select count(id)from user";
        //获取执行结果赋值到count
        Long total = template.queryForObject(sql,Long.class);
        //输出执行结果
        System.out.println(total);
    }
}
