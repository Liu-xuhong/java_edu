package com.day2;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrterDemo2 {
	public static void main(String[] args) throws IOException {
		//�������������
		FileWriter fw = new FileWriter("bb.txt");
		
		//����ַ�������
//		fw.write("abcd");
		
//		write(strring str,int index,int len)		
//		����ַ����е�һ�������ݣ���0~2
//		fw.write("abcd",0, 2);
		
//		write(int ch)дһ���ַ����ݣ�����дint�ĺô��ȿ���ֱ��дchar����a��Ҳ����дchar����a��Ӧint��ֵ97
//		fw.write(97);
//		fw.write("a");
		
		char [] chs = {'a','b','c','d'};
		
//		write(char[] chs)�����һ������
//		write(char[] chs,int index,int len)�����һ�������еĲ������ݣ���1~3
		fw.write(chs);
		fw.write(chs,1,3);
		//�ͷ���Դ
		fw.close();
		
	}
}