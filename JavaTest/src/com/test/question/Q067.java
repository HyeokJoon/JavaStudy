package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q067 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		int index, value;
		
		System.out.print("삽입 위치: ");
		index = scan.nextInt();
		System.out.print("값: ");
		value = scan.nextInt();

		System.out.print("원본: ");
		System.out.println(Arrays.toString(arr));
		insert(arr, value, index);		
		System.out.print("결과: ");
		System.out.println(Arrays.toString(arr));
	}

	private static void insert(int[] arr, int value, int index) {
		for(int i=index; i<arr.length-1; i++) {
			arr[i+1] = arr[i];
		}
		arr[index] = value;
	}
}
