package day14JDBC���ݿ�����;

import java.sql.*;

public class Demo1 {
    public static void main(String[] args) throws SQLException {
//        1.ע������
//        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

//        �Ż����룺Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        2.�������ӣ�����һ��Э��+���ʵ����ݿ�  ���������û���  ������������
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","root");

//        3.����Statement�������ݿ�򽻵���һ����Ҫ�������
//        ��ӣ�PreparedStatement��Ԥ�ƴ���sql��䣬��ѹؼ���ֱ�Ӵ���Ϊ��ѯ���
//        ?�����ѯ��ֵ������������ת�����ַ�������ʽ�����ѯ������or 1=1Ҳ�����ַ������в�ѯ
//        ����select * from t_stu where username = 123 and password = 123
//        ���ʺŴ���123֮�󣬿����ų���password�����������sql�����ֵ�����
        PreparedStatement ps = conn.prepareStatement("select * from t_stu where id = ?");
        ps.setString(1,"1");
//        4.ִ�в�ѯ����ȡ��ѯ���
        ResultSet rs = ps.executeQuery();

//        5.������ѯ���
        while (rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            System.out.println("id:"+id+"\n"+"name:"+name+"\n"+"age:"+age);
        }

//        6.�ͷ���Դ����Ҫ���ν���
        rs.close();
        ps.close();
        conn.close();
    }
}
