package com.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ʹ��IO�����ļ��ļ��ַ�ʽ
 * 1.��������ȡ�ַ�������ַ�
 * 2.��������ȡ�ַ����鲢����ַ�����
 * 3.��������ȡ�ַ�������ַ�
 * 4.��������ȡ�ַ����鲢����ַ�����
 * 5.�������ĸ߼��÷�����ȡһ�����ݲ����һ��
 * */

public class BufferedPractice {
	public static void main(String[] args) throws IOException {
		String filename = ".\\src\\com\\day2\\BufferedSteamDemo1.java";
		method1(filename,"copy1.java");
		method2(filename,"copy2.java");
		method3(filename,"copy3.java");
		method4(filename,"copy4.java");
		method5(filename,"copy5.java");
	}
	
//	1.��������ȡ�ַ�������ַ�
	public static void method1(String srcFileName,String copyFileName) throws IOException {
		FileReader fr = new FileReader(srcFileName);
		FileWriter fw = new FileWriter(copyFileName);
		
		int len;
		while((len = fr.read())!= -1) {
			fw.write(len);
			fw.flush();
		}
		fw.close();
		fr.close();
	}
	
//	2.��������ȡ�ַ����鲢����ַ�����
	public static void method2(String srcFileName,String copyFileName) throws IOException {
		FileReader fr = new FileReader(srcFileName);
		FileWriter fw = new FileWriter(copyFileName);
		
		int len;
		char[] chs = new char[1024];
		while((len = fr.read(chs))!= -1) {
			fw.write(new String(chs,0,len));
			fw.flush();
		}
		fw.close();
		fr.close();
	}
	
//	��������ȡ�ַ������
	public static void method3(String srcFileName,String copyFileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(srcFileName));
		BufferedWriter bw = new BufferedWriter(new FileWriter(copyFileName));
		
		int ln;
		while((ln = br.read())!= -1) {
			bw.write(ln);
			bw.flush();
		}
		
		bw.close();
		br.close();
	}
	
//	��������ȡ�ַ����鲢����ַ�����
	public static void method4(String srcFileName,String copyFileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(srcFileName));
		BufferedWriter bw = new BufferedWriter(new FileWriter(copyFileName));
		
		char[] chs = new char[1024];
		int len;
		while((len = br.read(chs))!= -1) {
			bw.write(chs,0,len);
			bw.flush();
		}
		bw.close();
		br.close();
	}
	
	public static void method5(String srcFileName,String copyFileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(srcFileName));
		BufferedWriter bw = new BufferedWriter(new FileWriter(copyFileName));
		
		String line;
		while((line = br.readLine())!= null) {
			bw.write(line);
			bw.newLine();
		}
		
		bw.close();
		br.close();
	}
}