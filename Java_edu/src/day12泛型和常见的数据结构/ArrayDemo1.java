package day12���ͺͳ��������ݽṹ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//���ͣ���ʵ�����ڱ�д�����ʱ�򲻶������ݵ����ͣ���ʹ�õ�ʱ�����
        //������һ����û����ȷ�����Ͷ��壬������ʹ�õ�ʱ����Ҫȷ������

public class ArrayDemo1 {
    public static void main(String[] args) {
        //��ʹ�õ�ʱ����������
        Tt<String> ta = new Tt<String>();

        ta.setName("haha");

        System.out.println(ta.getName());
    }
}

//������һ��������
class Tt<T>{
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}