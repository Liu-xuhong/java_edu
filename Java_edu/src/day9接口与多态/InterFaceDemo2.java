package day9接口与多态;
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
		System.out.println("猫吃鱼");
	}
	public static void sleep(){
		System.out.println("猫睡觉");
	}
}

class Animal1{
	public void eat(){
		System.out.println("吃了啥");
	}
}