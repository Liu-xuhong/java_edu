package com.day6;
/* �̳��г�Ա�������ص�
 * �̳еľͽ�ԭ��ʹ�����ȼ��ߵı���
 * 
 * super:��ȡ����ĳ�Ա�����ͳ�Ա�������÷���this����ȡ��ǰ��ĳ�Ա�����ͳ�Ա��������һ����
 * 
 * */
public class Demo3 {
	public static void main(String[] args) {
		kid k = new kid();
		k.show();
	}
}

class Dad{
	String name = "����";
}

class kid extends Dad{
	String name = "˼��";
	
	public void show() {
		String name = "��ϣ��";
		//�����ʹ�þֲ�����
		System.out.println(name);
		
		//��Σ�ʹ�õ�ǰ��ĳ�Ա����
		System.out.println(this.name);
		
		//��Զ��ʹ�õ�ǰ��ĸ���ĳ�Ա����
		System.out.println(super.name);
	}
}
