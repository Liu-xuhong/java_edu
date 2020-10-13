package com.day2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//需求：复制文件内容输出到另一个文件
public class FileReaderDemo3 {
	public static void main(String[] args) throws IOException {
		
//		创建输入输出流对象
		FileReader fr = new FileReader(".\\src\\com\\day2\\FileWriteDemo3.java");
		
		FileWriter fw = new FileWriter("copy.java");
		
//		读写数据，一次读取1024个字符并输出
		char [] chs = new char[1024];
		int len;
		while((len = fr.read(chs))!= -1) {
//			输出一次读写的长度
			fw.write(chs,0,len);
		}
//		释放资源
		fw.close();
		fr.close();
	}
}
