package day13set��map����;
//Set���ϣ����򼯺ϲ��Ҳ������ظ�
//Map�ӿڣ�����Python���ֵ䣬Ϊ��ֵ��Ӧ��ϵ��һ������Ӧһ��ֵ�����Ҽ��������ظ�
import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        //����һ��Map����
        Map<String,String> map = new HashMap<String, String>();
        map.put("0001","����");
        map.put("0002","����");
        map.put("0003","����");


        //�����ĵ�һ�ַ�ʽ:������ȡ����������Ȼ����ݼ������Ҷ�Ӧ��ֵ
        //keyset���� ����ֵ��Set���ϣ����򼯺ϣ��������ظ���,��ȡMap���ϵ����еļ���Ȼ�����һ��Set����

       /* Set<String> keys = map.keySet();
        for (String key:
             keys) {
            System.out.println("��:"+key+"---ֵ:"+map.get(key));
        }*/

        //�����ĵڶ��ַ�ʽ:ʹ���ڲ���Entry
        Set<Map.Entry<String,String>> en = map.entrySet();

        for (Map.Entry<String,String> ent : en){
            String key = ent.getKey();
            String value = ent.getValue();
            System.out.println("��:"+key+"---ֵ:"+value);
        }

    }
}
