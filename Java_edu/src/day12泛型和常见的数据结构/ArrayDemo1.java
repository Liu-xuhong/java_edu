package day12泛型和常见的数据结构;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//泛型：其实就是在编写代码的时候不定义数据的类型，在使用的时候定义好
        //和数组一样，没有明确的类型定义，但是在使用的时候需要确定类型

public class ArrayDemo1 {
    public static void main(String[] args) {
        //在使用的时候定义其类型
        Tt<String> ta = new Tt<String>();

        ta.setName("haha");

        System.out.println(ta.getName());
    }
}

//定义了一个泛型类
class Tt<T>{
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}