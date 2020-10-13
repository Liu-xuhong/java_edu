package com.day2;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo3 {
	public static void main(String[] args) throws IOException {
//		创建输出流对象
//		FileWriter fw = new FileWriter("cc.txt");  不是追加写入，每次默认从头写入
		FileWriter fw = new FileWriter("cc.txt",true); //表示追加写入，不写默认是false
		
//		循环输出
		for(int i = 0; i<10; i++) {
			fw.write("hello" + i);
//			加换行符
			fw.write("\n");
		}
		fw.close();
	}
}
