package com.day6;

/*
 * �̳��г�Ա�������ص㣺
 * 
 * ��������д�����Ӹ��൱�У�����ķ����͸�����ȫһ����������д�����ǣ��˸���ķ���
 * ���������أ���һ�����У���������ķ����������������һ�������������ͣ������ĸ�����������˳�򣩺ͷ���ֵ�޹�
 * */

public class Demo4 {
	public static void main(String[] args) {
		sun s = new sun();
		s.eat();
	}
}

class daddy{
	public void eat() {
		System.out.println("С������");
		System.out.println("׼��ȥ˯����");
	}
}

class sun extends daddy{
	public void eat() {
		System.out.println("�����������׷�");
		System.out.println("����һ�޷�լ����ˮ");
		System.out.println("����������");
		System.out.println("Ȼ��ȥϴϴ˯");
	}
}