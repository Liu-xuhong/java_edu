package com.day2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//���󣺸����ļ������������һ���ļ�
public class FileReaderDemo3 {
	public static void main(String[] args) throws IOException {
		
//		�����������������
		FileReader fr = new FileReader(".\\src\\com\\day2\\FileWriteDemo3.java");
		
		FileWriter fw = new FileWriter("copy.java");
		
//		��д���ݣ�һ�ζ�ȡ1024���ַ������
		char [] chs = new char[1024];
		int len;
		while((len = fr.read(chs))!= -1) {
//			���һ�ζ�д�ĳ���
			fw.write(chs,0,len);
		}
//		�ͷ���Դ
		fw.close();
		fr.close();
	}
}
