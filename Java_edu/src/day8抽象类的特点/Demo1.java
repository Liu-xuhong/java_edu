package day8��������ص�;
/*
 * ��������ص㣺
 * 	1.���󷽷�ֻ���ڳ���������
 * 	2.������ͳ��󷽷����뱻abstract����
 * 	3.�����಻�ܴ������󣨳����಻��ʵ������
 * 	4.һ��������̳��˳����࣬�ͱ�����д�������еĳ��󷽷��������Լ�Ҳ�����ǳ�����
 * 	5.abstract���β��ܺ�final����privateһ��
 * */
public class Demo1 {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
	}
}

abstract class Animal{
	public abstract void eat();
}

class Cat extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("è����");
	}
	
}

class Dog extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("����ʺ");
	}
	
}