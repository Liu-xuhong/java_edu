package com.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedSteamDemo1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(".\\src\\com\\day2\\BufferedSteamDemo1.java"));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("d3.txt",true));
		
		
		for(int i = 0;i<=10;i++) {
			bw.write("hello"+i);
			bw.newLine();
//			bw.flush();
		}
		bw.close();
	}
}
