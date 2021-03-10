package day14JDBC数据库连接;

import java.sql.*;

public class Demo1 {
    public static void main(String[] args) throws SQLException {
//        1.注册驱动
//        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

//        优化代码：Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        2.建立连接：参数一：协议+访问的数据库  参数二：用户名  参数三：密码
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","root");

//        3.创建Statement，跟数据库打交道，一定需要这个对象
//        添加：PreparedStatement是预制处理sql语句，会把关键字直接处理为查询语句
//        ?代替查询的值，后续？都会转换成字符串的形式参与查询，比如or 1=1也会变成字符串进行查询
//        区别：select * from t_stu where username = 123 and password = 123
//        用问号代替123之后，可以排除掉password输入框中输入sql语句出现的问题
        PreparedStatement ps = conn.prepareStatement("select * from t_stu where id = ?");
        ps.setString(1,"1");
//        4.执行查询，获取查询结果
        ResultSet rs = ps.executeQuery();

//        5.遍历查询结果
        while (rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            System.out.println("id:"+id+"\n"+"name:"+name+"\n"+"age:"+age);
        }

//        6.释放资源，需要依次进行
        rs.close();
        ps.close();
        conn.close();
    }
}
