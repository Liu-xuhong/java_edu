package com.day6;
/* 继承中成员变量的特点
 * 继承的就近原则：使用优先级高的变量
 * 
 * super:获取父类的成员变量和成员方法，用法和this（获取当前类的成员变量和成员方法）是一样的
 * 
 * */
public class Demo3 {
	public static void main(String[] args) {
		kid k = new kid();
		k.show();
	}
}

class Dad{
	String name = "健林";
}

class kid extends Dad{
	String name = "思聪";
	
	public void show() {
		String name = "冠希哥";
		//最近：使用局部变量
		System.out.println(name);
		
		//其次：使用当前类的成员变量
		System.out.println(this.name);
		
		//最远：使用当前类的父类的成员变量
		System.out.println(super.name);
	}
}
