package com.day2;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrterDemo2 {
	public static void main(String[] args) throws IOException {
		//创建输出流对象
		FileWriter fw = new FileWriter("bb.txt");
		
		//输出字符串数据
//		fw.write("abcd");
		
//		write(strring str,int index,int len)		
//		输出字符串中的一部分数据，从0~2
//		fw.write("abcd",0, 2);
		
//		write(int ch)写一个字符数据，这里写int的好处既可以直接写char数据a，也可以写char数据a对应int的值97
//		fw.write(97);
//		fw.write("a");
		
		char [] chs = {'a','b','c','d'};
		
//		write(char[] chs)是输出一个数组
//		write(char[] chs,int index,int len)是输出一个数组中的部分数据，从1~3
		fw.write(chs);
		fw.write(chs,1,3);
		//释放资源
		fw.close();
		
	}
}