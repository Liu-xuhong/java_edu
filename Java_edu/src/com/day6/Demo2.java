package com.day6;

public class Demo2 {
	public static void main(String[] args) {
		LOL1 l = new LOL1();
		l.update();
		l.start();
	}
}

class Game2{
	public void start() {
		System.out.println("��Ϸ������~");
	}
}

class PcGame extends Game2{
	public void update() {
		System.out.println("PC��Ϸ������");
	}
}

class mobileGame extends Game2{
	public void update() {
		System.out.println("mobile��Ϸ������");
	}
}

class LOL1 extends PcGame{
	
}