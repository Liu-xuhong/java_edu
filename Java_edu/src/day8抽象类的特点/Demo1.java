package day8抽象类的特点;
/*
 * 抽象类的特点：
 * 	1.抽象方法只能在抽象类里面
 * 	2.抽象类和抽象方法必须被abstract修饰
 * 	3.抽象类不能创建对象（抽象类不能实例化）
 * 	4.一个类如果继承了抽象类，就必须重写抽象类中的抽象方法，否则自己也必须是抽象类
 * 	5.abstract修饰不能和final还有private一起
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
		System.out.println("猫吃鱼");
	}
	
}

class Dog extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗吃屎");
	}
	
}