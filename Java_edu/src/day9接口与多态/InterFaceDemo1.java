package day9接口与多态;
/*
 * 接口的成员特点：
 * 		接口只能有抽象方法
 * 		只能使用public&abstract修饰方法（因为一个类实现一个接口必须实现接口的所有方法，如果方法是私有的或者不允许继承的话就没法实现了）
 * 		只能有常量
 * 		默认使用 public static final修饰成员变量
 * 注意：
 * 		接口不能创建对象（不能被实例化）
 * 		类与接口是实现方法，一个类实现一个接口必须实现接口的所有方法
 * 接口的创建(与创建类一样在，只是把class换成interface)：
 * 	interface  接口名
 * 
 * 类与接口如何关联(像继承父类一样，只是把extends关键字换成了implements)：
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
		System.out.println("猫吃鱼了");
	}
}
