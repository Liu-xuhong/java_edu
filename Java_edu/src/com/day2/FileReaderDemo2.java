package com.day2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
	public static void main(String[] args) throws IOException {
		//创建输入流对象
		FileReader fr = new FileReader("fr.txt");
		

		
//		第一次读取
//		System.out.println("len:"+len);
//		System.out.println(new String(chs));
//		
//		第二次读取
//		len = fr.read(chs);
//		System.out.println("len:"+len);
//		System.out.println(new String(chs));
//		
//		第三次读取
//		len = fr.read(chs);
//		System.out.println("len:"+len);
//		System.out.println(new String(chs));
		char[] chs = new char[5];
		int len;
		while((len = fr.read(chs))!= -1) {
			
		}
	}
}
