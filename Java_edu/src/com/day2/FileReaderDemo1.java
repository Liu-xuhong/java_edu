package com.day2;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
	public static void main(String[] args) throws IOException {
		//��������������
		FileReader fr = new FileReader("fr.txt");
		
//		��������������Ķ����ݷ�������ֵ��ch
//		int ch = fr.read();	
//		System.out.print((char)ch);
		
		int ch;
		while((ch = fr.read())!= -1) {
			System.out.print((char)ch);
		}
	}
}
