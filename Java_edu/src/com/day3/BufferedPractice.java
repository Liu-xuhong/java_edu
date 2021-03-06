package com.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 使用IO复制文件的几种方式
 * 1.基本流读取字符并输出字符
 * 2.基本流读取字符数组并输出字符数组
 * 3.缓冲流读取字符并输出字符
 * 4.缓冲流读取字符数组并输出字符数组
 * 5.缓冲流的高级用法，读取一行数据并输出一行
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
	
//	1.基本流读取字符并输出字符
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
	
//	2.基本流读取字符数组并输出字符数组
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
	
//	缓冲流读取字符并输出
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
	
//	缓冲流读取字符数组并输出字符数组
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
