package day9�ӿ����̬;
/*
 * 
 * 
 * 
 * */
public class InterFaceDemo2 {
	public static void main(String[] args) {
		Animal1 an = new Cat1();

		Cat1 c = new Cat1();
		Cat1.sleep();
	}
}

class Cat1 extends Animal1{
	public void eat(){
		System.out.println("è����");
	}
	public static void sleep(){
		System.out.println("è˯��");
	}
}

class Animal1{
	public void eat(){
		System.out.println("����ɶ");
	}
}