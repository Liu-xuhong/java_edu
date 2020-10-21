package com.day5;
/*
 * 输入六个分数，去除一个最高分和最低分，然后进行求平均值
 * 
 * */
import java.util.Scanner;

public class MyDemo1 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println("请输入第"+(i+1)+"组分值：");
			arr[i] = sc.nextInt();
		}
		int max = getMax(arr);
		int min = getMin(arr);
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			if(max != arr[i] && min != arr[i]) {
				sum += arr[i];
			}
		}
		System.out.println("裁判评分是："+sum/(arr.length-2));
		
	}
	
	public static int getMax(int[] arr) {
		int max = arr[0];
		for(int i = 1;i < arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int getMin(int[] arr) {
		int min = arr[0];
		for(int i = 1;i < arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}
