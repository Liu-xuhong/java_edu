package day15;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;

//XML Demo
public class Demo1 {
    public static void main(String[] args) {
//        1.����SAX��ȡ�����ʵ��
        SAXReader reader = new SAXReader();
//        2.ָ��������XML
        Document document = null;
        try {
            document = reader.read(new File("src/day15/index.xml"));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
//        3.�õ�Ԫ��
//        getRootElement��ȡ��Ԫ��
        Element rootElement = document.getRootElement();


        System.out.println(rootElement.element("stu").element("age").getStringValue());
    }
}
