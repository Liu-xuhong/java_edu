package com.day2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
	public static void main(String[] args) throws IOException {
		//��������������
		FileReader fr = new FileReader("fr.txt");
		

		
//		��һ�ζ�ȡ
//		System.out.println("len:"+len);
//		System.out.println(new String(chs));
//		
//		�ڶ��ζ�ȡ
//		len = fr.read(chs);
//		System.out.println("len:"+len);
//		System.out.println(new String(chs));
//		
//		�����ζ�ȡ
//		len = fr.read(chs);
//		System.out.println("len:"+len);
//		System.out.println(new String(chs));
		char[] chs = new char[5];
		int len;
		while((len = fr.read(chs))!= -1) {
			
		}
	}
}