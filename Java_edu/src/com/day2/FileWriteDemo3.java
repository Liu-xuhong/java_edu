package com.day2;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo3 {
	public static void main(String[] args) throws IOException {
//		�������������
//		FileWriter fw = new FileWriter("cc.txt");  ����׷��д�룬ÿ��Ĭ�ϴ�ͷд��
		FileWriter fw = new FileWriter("cc.txt",true); //��ʾ׷��д�룬��дĬ����false
		
//		ѭ�����
		for(int i = 0; i<10; i++) {
			fw.write("hello" + i);
//			�ӻ��з�
			fw.write("\n");
		}
		fw.close();
	}
}
