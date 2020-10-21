package com.day4;

import java.util.Scanner;

public class MyDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个数字：");
		int c = sc.nextInt();
		
		System.out.println("请输入第二个数字：");
		int d = sc.nextInt();
		
		int result = sum(c,d);
		
		System.out.println("result:"+result);
	}
	
	public static int sum(int a,int b) {
		 int c = a + b;
		 return c;
	}
}
