package com.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(".\\src\\com\\day2\\BufferedSteamDemo1.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
		
		
		
		char[] chs = new char[1024];
		int len;
		while((len = br.read(chs))!= -1) {
			bw.write(chs,0,len);
		}
		br.close();
		bw.close();
	}
}
