package day11������ϰ;
/*
* ����ѧ������ϵͳ
* 1.Ҫ����Զ�ѧ��������ɾ�Ĳ�
*
* */
import java.util.ArrayList;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        int foo = 0;
        while (foo != 5){
            System.out.println("-----------��ӭ����ѧ������ϵͳ----------");
            System.out.println("��ѡ������Ҫ�Ĳ���:");
            System.out.println("1.����ѧԱ");
            System.out.println("2.�༭ѧԱ");
            System.out.println("3.��ѯ����ѧԱ");
            System.out.println("4.ɾ��ѧԱ");
            System.out.println("5�˳�");
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
                    System.out.println("��лʹ��~~~\n-------\n------");
                    break;
                default:
                    System.out.println("��������ȷ��ѡ��");
                    break;
            }
        }
    }

    public static void insStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);

        System.out.println("������ѧ��ѧ��:");
        String id = sc.nextLine();
        for(int i = 0;i< array.size();i++){
            Student s = array.get(i);
            if(id.equals(s.getId())){
                System.out.println("�����������ظ���ѧ��");
                return;
            }
        }

        System.out.println("������ѧ������:");
        String name = sc.nextLine();

        System.out.println("������ѧ������:");
        String age = sc.nextLine();

        System.out.println("������ѧ��סַ:");
        String address = sc.nextLine();

        Student s = new Student(id,name,age,address);
        array.add(s);

        System.out.println("���ѧԱ�ɹ���\n--------\n-------");
    }

    public static void delStudent(ArrayList<Student> array){
        if (array.size() == 0){
            System.out.println("����ѧ������Ϊ�գ��������ѧ��\n--------\n--------");
            return;
        }
        Scanner sc = new Scanner(System.in);

        System.out.println("������Ҫɾ��ѧ����ѧ��:");
        String id = sc.nextLine();

        for(int i = 0;i< array.size();i++){
            Student s = array.get(i);
            if(id.equals(s.getId())){
                array.remove(i);
                System.out.println("ɾ��ѧ���ɹ�");
                return;
            }
            else if (i == (array.size()-1)){
                System.out.println("���󣡲�ѯѧ�Ų�����");
                return;
            }
        }
    }

    public static void selStudent(ArrayList<Student> array){
        if (array.size() == 0){
            System.out.println("����ѧ������Ϊ�գ��������ѧ��\n--------\n--------");
            return;
        }
        System.out.println("ѧ��\t\t����\t\t����\t\tסַ");
        for (int i = 0;i < array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getId()+"\t"+s.getName()+"\t\t"+s.getAge()+"\t\t"+s.getAddress());
        }
    }

    public static void updStudent(ArrayList<Student> array){
        if (array.size() == 0){
            System.out.println("����ѧ������Ϊ�գ��������ѧ��\n--------\n--------");
            return;
        }
        Scanner sc = new Scanner(System.in);

        System.out.println("������Ҫ�༭ѧ����ѧ��:");

        String id = sc.nextLine();

        for(int i = 0;i< array.size();i++){
            Student s = array.get(i);
            if(id.equals(s.getId())){
                System.out.println("������ѧ��ѧ��:");
                String id1 = sc.nextLine();
                for(int j = 0;j< array.size();j++){
                    Student s1 = array.get(j);
                    String id2 = s1.getId();
                    if(id1.equals(id)){
                        continue;
                    }else if (id1.equals(id2)){
                        System.out.println("�����������ظ���ѧ��");
                        return;
                    }
                }

                System.out.println("������ѧ������:");
                String name = sc.nextLine();

                System.out.println("������ѧ������:");
                String age = sc.nextLine();

                System.out.println("������ѧ��סַ:");
                String address = sc.nextLine();

                Student s1 = new Student(id1,name,age,address);
                array.set(i,s1);

                System.out.println("�༭ѧԱ��Ϣ�ɹ���\n--------\n--------");
                return;
            }
            else if (i == (array.size()-1)){
                System.out.println("���󣡲�ѯѧ�Ų�����");
                return;
            }
        }
    }
}
