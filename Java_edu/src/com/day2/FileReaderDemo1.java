package com.day2;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
	public static void main(String[] args) throws IOException {
		//创建输入流对象
		FileReader fr = new FileReader("fr.txt");
		
//		调用输入流对象的读数据方法并赋值给ch
//		int ch = fr.read();	
//		System.out.print((char)ch);
		
		int ch;
		while((ch = fr.read())!= -1) {
			System.out.print((char)ch);
		}
	}
}
