package com.day5;

public class MyDemo2 {
	private String name;
	
	private int age;
	
	private String sex;
	
//	�޲ι���
	public MyDemo2() {}
	
//	�вι���
	public MyDemo2(String name,int age,String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
//	�����Ļ�ȡ����
	public String getName(String name) {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAge(String age) {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getSex(int sex) {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void show() {
		System.out.println(name+","+age+","+sex);
	}
}
