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
		System.out.println("游戏启动了~");
	}
}

class PcGame extends Game2{
	public void update() {
		System.out.println("PC游戏更新了");
	}
}

class mobileGame extends Game2{
	public void update() {
		System.out.println("mobile游戏更新了");
	}
}

class LOL1 extends PcGame{
	
}