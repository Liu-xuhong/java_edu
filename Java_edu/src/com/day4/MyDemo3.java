package com.day4;

import java.util.Scanner;

public class MyDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ�����֣�");
		int c = sc.nextInt();
		
		System.out.println("������ڶ������֣�");
		int d = sc.nextInt();
		
		int result = sum(c,d);
		
		System.out.println("result:"+result);
	}
	
	public static int sum(int a,int b) {
		 int c = a + b;
		 return c;
	}
}
