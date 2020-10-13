package com.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*BufferedWriter�����ı�д�뵽�ַ�������У������ַ����Ա��ṩ�Ե����ַ���������ַ����ĸ�Чд��
BufferedReader����һ���ַ��������ж�ȡ�ı��������ַ����Ա��ṩ�ַ���������еĸ�Ч��ȡ*/

public class BufferedSteamDemo1 {
	public static void main(String[] args) throws IOException {
//		�����������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		bw.write("abcd");
		bw.flush();
		bw.close();
		
//		�������뻺��������
		BufferedReader br = new BufferedReader(new FileReader(".\\src\\com\\day2\\FileReaderDemo1.java"));
		
		/*һ�ζ�ȡһ���ַ�
		int len;
		�ж��Ƿ��ȡ�����һ���ַ��������ȡ�����һ���ַ�֮�󷵻�ֵ����-1�������-1��ֹͣѭ��
		while((len = br.read())!= -1) {
			System.out.print((char)len);
		}*/
		
		char[] chs = new char[1024];
		int len;
		/*
		 * len���ص���ʵ�ʶ�ȡ���ַ����鳤��
		 * chs�Ƕ�ȡ1024���ַ����飬������Ȳ�����ֻ�Ḳ�ǵ�ǰ���ȵ�ֵ����������ֵ�����ϴ�ѭ����ֵ
		 * */
		while((len = br.read(chs))!= -1) {
			System.out.print(new String(chs,0,len));
		}
	}
}