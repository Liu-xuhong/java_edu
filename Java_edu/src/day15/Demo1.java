package day15;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;

//XML Demo
public class Demo1 {
    public static void main(String[] args) {
//        1.创建SAX读取对象的实例
        SAXReader reader = new SAXReader();
//        2.指定解析的XML
        Document document = null;
        try {
            document = reader.read(new File("src/day15/index.xml"));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
//        3.得到元素
//        getRootElement获取根元素
        Element rootElement = document.getRootElement();


        System.out.println(rootElement.element("stu").element("age").getStringValue());
    }
}
