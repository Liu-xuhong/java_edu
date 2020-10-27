package day11集合练习;
/*
* 需求：学生管理系统
* 1.要求可以对学生进行增删改查
*
* */
import java.util.ArrayList;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        int foo = 0;
        while (foo != 5){
            System.out.println("-----------欢迎进入学生管理系统----------");
            System.out.println("请选择您想要的操作:");
            System.out.println("1.新增学员");
            System.out.println("2.编辑学员");
            System.out.println("3.查询所有学员");
            System.out.println("4.删除学员");
            System.out.println("5退出");
            Scanner sc = new Scanner(System.in);

            foo = sc.nextInt();
            switch (foo){
                case 1:
                    insStudent(array);
                    break;
                case 2:
                    updStudent(array);
                    break;
                case 3:
                    selStudent(array);
                    break;
                case 4:
                    delStudent(array);
                    break;
                case 5:
                    System.out.println("感谢使用~~~\n-------\n------");
                    break;
                default:
                    System.out.println("请输入正确的选项");
                    break;
            }
        }
    }

    public static void insStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生学号:");
        String id = sc.nextLine();
        for(int i = 0;i< array.size();i++){
            Student s = array.get(i);
            if(id.equals(s.getId())){
                System.out.println("错误！输入了重复的学号");
                return;
            }
        }

        System.out.println("请输入学生姓名:");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄:");
        String age = sc.nextLine();

        System.out.println("请输入学生住址:");
        String address = sc.nextLine();

        Student s = new Student(id,name,age,address);
        array.add(s);

        System.out.println("添加学员成功！\n--------\n-------");
    }

    public static void delStudent(ArrayList<Student> array){
        if (array.size() == 0){
            System.out.println("错误！学生数据为空，请先添加学生\n--------\n--------");
            return;
        }
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要删除学生的学号:");
        String id = sc.nextLine();

        for(int i = 0;i< array.size();i++){
            Student s = array.get(i);
            if(id.equals(s.getId())){
                array.remove(i);
                System.out.println("删除学生成功");
                return;
            }
            else if (i == (array.size()-1)){
                System.out.println("错误！查询学号不存在");
                return;
            }
        }
    }

    public static void selStudent(ArrayList<Student> array){
        if (array.size() == 0){
            System.out.println("错误！学生数据为空，请先添加学生\n--------\n--------");
            return;
        }
        System.out.println("学号\t\t姓名\t\t年龄\t\t住址");
        for (int i = 0;i < array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getId()+"\t"+s.getName()+"\t\t"+s.getAge()+"\t\t"+s.getAddress());
        }
    }

    public static void updStudent(ArrayList<Student> array){
        if (array.size() == 0){
            System.out.println("错误！学生数据为空，请先添加学生\n--------\n--------");
            return;
        }
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要编辑学生的学号:");

        String id = sc.nextLine();

        for(int i = 0;i< array.size();i++){
            Student s = array.get(i);
            if(id.equals(s.getId())){
                System.out.println("请输入学生学号:");
                String id1 = sc.nextLine();
                for(int j = 0;j< array.size();j++){
                    Student s1 = array.get(j);
                    String id2 = s1.getId();
                    if(id1.equals(id)){
                        continue;
                    }else if (id1.equals(id2)){
                        System.out.println("错误！输入了重复的学号");
                        return;
                    }
                }

                System.out.println("请输入学生姓名:");
                String name = sc.nextLine();

                System.out.println("请输入学生年龄:");
                String age = sc.nextLine();

                System.out.println("请输入学生住址:");
                String address = sc.nextLine();

                Student s1 = new Student(id1,name,age,address);
                array.set(i,s1);

                System.out.println("编辑学员信息成功！\n--------\n--------");
                return;
            }
            else if (i == (array.size()-1)){
                System.out.println("错误！查询学号不存在");
                return;
            }
        }
    }
}
