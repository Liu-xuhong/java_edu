package day9�ӿ����̬;
/*
 * �ӿڵĳ�Ա�ص㣺
 * 		�ӿ�ֻ���г��󷽷�
 * 		ֻ��ʹ��public&abstract���η�������Ϊһ����ʵ��һ���ӿڱ���ʵ�ֽӿڵ����з��������������˽�еĻ��߲�����̳еĻ���û��ʵ���ˣ�
 * 		ֻ���г���
 * 		Ĭ��ʹ�� public static final���γ�Ա����
 * ע�⣺
 * 		�ӿڲ��ܴ������󣨲��ܱ�ʵ������
 * 		����ӿ���ʵ�ַ�����һ����ʵ��һ���ӿڱ���ʵ�ֽӿڵ����з���
 * �ӿڵĴ���(�봴����һ���ڣ�ֻ�ǰ�class����interface)��
 * 	interface  �ӿ���
 * 
 * ����ӿ���ι���(��̳и���һ����ֻ�ǰ�extends�ؼ��ֻ�����implements)��
 * 		implements
 * */
public class InterFaceDemo1 {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		System.out.println(c.num);
	}
}

interface Animal{
	public final static int num = 10;
	public abstract void eat();
}

class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("è������");
	}
}
