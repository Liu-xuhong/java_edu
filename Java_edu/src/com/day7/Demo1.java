package com.day7;

public class Demo1 {
	public static void main(String[] args) {
		Zi z = new Zi();
	}
}


class Die{
	
	public Die() {
		System.out.println("���Ǹ����޲ι���");
	}
	
	public Die(int num) {
		System.out.println("���Ǹ����вι���");
	}
}

class Zi extends Die{
	public Zi() {
		super(2);
		System.out.println("���������޲ι���");
	}
	
	public Zi(int num) {
		System.out.println("���������вι���");
	}
}