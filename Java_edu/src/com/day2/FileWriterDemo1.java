package com.day2;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 输出流写数据的步骤
 * 		1.创建输出流对象
 * 		2.调用输出流对象的写数据方法并刷新缓冲区
 * 		3.释放资源
 * 
 * fw.flush():刷新缓冲区
 * fw.close():刷新缓冲区，并释放资源
 * */
public class FileWriterDemo1 {
	public static void main(String[] args) throws IOException{
		//创建输出流对象
		FileWriter fw = new FileWriter("d:\\aa.txt");
		
		//调用对象的写数据方法
		fw.write("hellow world");
		
		//刷新缓冲区
		fw.flush();
		
		//释放资源
		fw.close();
		
		//打印成功通知
		System.out.print("成功！");
		
	}
}
