package com.day7;

public class Demo1 {
	public static void main(String[] args) {
		Zi z = new Zi();
	}
}


class Die{
	
	public Die() {
		System.out.println("我是父类无参构造");
	}
	
	public Die(int num) {
		System.out.println("我是父类有参构造");
	}
}

class Zi extends Die{
	public Zi() {
		super(2);
		System.out.println("我是子类无参构造");
	}
	
	public Zi(int num) {
		System.out.println("我是子类有参构造");
	}
}