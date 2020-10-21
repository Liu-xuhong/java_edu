package com.day6;

/*
 * 继承中成员方法的特点：
 * 
 * 方法的重写：在子父类当中，子类的方法和父类完全一样，子类重写（覆盖）了父类的方法
 * 方法的重载：在一个类中，多个重名的方法，但是其参数不一样（参数的类型，参数的个数，参数的顺序）和返回值无关
 * */

public class Demo4 {
	public static void main(String[] args) {
		sun s = new sun();
		s.eat();
	}
}

class daddy{
	public void eat() {
		System.out.println("小酌两口");
		System.out.println("准备去睡觉了");
	}
}

class sun extends daddy{
	public void eat() {
		System.out.println("干了两大碗米饭");
		System.out.println("喝了一罐肥宅快乐水");
		System.out.println("跑了两公里");
		System.out.println("然后去洗洗睡");
	}
}