package com.day6;

public class Demo1 {
	public static void main(String[] args) {
		Dota d = new Dota();
		d.end();
	}
}

class Game{
	String name;
	String agent;
	double version;
	
	public void start() {
		System.out.println("��Ϸ������-----");
	}
	
	public void end() {
		System.out.println("��Ϸ������-----");
	}
}

class Dota extends Game{
	
}

class LOL extends Game{
	
}
