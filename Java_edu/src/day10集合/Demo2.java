package day10集合;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",20);
        Student s3 = new Student("王五",21);
        Student s4 = new Student("赵六",22);

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        for(int i = 0;i<array.size();i++){
            Student s = array.get(i);
            System.out.println("name"+s.getName()+"----age:"+s.getAge()+"岁");
        }

    }
}
