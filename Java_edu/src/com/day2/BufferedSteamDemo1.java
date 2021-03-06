package com.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*BufferedWriter：将文本写入到字符输出流中，缓冲字符，以便提供对单个字符、数组和字符串的高效写入
BufferedReader：从一个字符输入流中读取文本，缓冲字符，以便提供字符、数组和行的高效读取*/

public class BufferedSteamDemo1 {
	public static void main(String[] args) throws IOException {
//		创建输出缓冲流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		bw.write("abcd");
		bw.flush();
		bw.close();
		
//		创建输入缓冲流对象
		BufferedReader br = new BufferedReader(new FileReader(".\\src\\com\\day2\\FileReaderDemo1.java"));
		
		/*一次读取一个字符
		int len;
		判断是否读取到最后一个字符，如果读取到最后一个字符之后返回值会是-1，如果是-1则停止循环
		while((len = br.read())!= -1) {
			System.out.print((char)len);
		}*/
		
		char[] chs = new char[1024];
		int len;
		/*
		 * len返回的是实际读取的字符数组长度
		 * chs是读取1024的字符数组，如果长度不够则只会覆盖当前长度的值，数组后面的值还是上次循环的值
		 * */
		while((len = br.read(chs))!= -1) {
			System.out.print(new String(chs,0,len));
		}
	}
}
