package com.day2;

import java.io.FileWriter;
import java.io.IOException;

/*
 * �����д���ݵĲ���
 * 		1.�������������
 * 		2.��������������д���ݷ�����ˢ�»�����
 * 		3.�ͷ���Դ
 * 
 * fw.flush():ˢ�»�����
 * fw.close():ˢ�»����������ͷ���Դ
 * */
public class FileWriterDemo1 {
	public static void main(String[] args) throws IOException{
		//�������������
		FileWriter fw = new FileWriter("d:\\aa.txt");
		
		//���ö����д���ݷ���
		fw.write("hellow world");
		
		//ˢ�»�����
		fw.flush();
		
		//�ͷ���Դ
		fw.close();
		
		//��ӡ�ɹ�֪ͨ
		System.out.print("�ɹ���");
		
	}
}