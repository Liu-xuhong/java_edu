package com.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(".\\src\\com\\day2\\BufferedSteamDemo1.java"));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("copy.java"));
		
		String ln;
		while((ln = br.readLine())!= null) {
			bw.write(ln);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}
