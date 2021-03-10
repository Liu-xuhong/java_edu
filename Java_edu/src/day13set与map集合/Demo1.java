package day13set与map集合;
//Set集合：无序集合并且不允许重复
//Map接口：类似Python的字典，为键值对应关系，一个键对应一个值，并且键不允许重复
import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        //创建一个Map对象
        Map<String,String> map = new HashMap<String, String>();
        map.put("0001","张三");
        map.put("0002","李四");
        map.put("0003","王五");


        //遍历的第一种方式:将键提取出来遍历，然后根据键来查找对应的值
        //keyset方法 返回值是Set集合（无序集合，不允许重复）,获取Map集合的所有的键，然后组成一个Set集合

       /* Set<String> keys = map.keySet();
        for (String key:
             keys) {
            System.out.println("键:"+key+"---值:"+map.get(key));
        }*/

        //遍历的第二种方式:使用内部类Entry
        Set<Map.Entry<String,String>> en = map.entrySet();

        for (Map.Entry<String,String> ent : en){
            String key = ent.getKey();
            String value = ent.getValue();
            System.out.println("键:"+key+"---值:"+value);
        }

    }
}
