package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q068 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		int[] arr = new int[10];
		int[] arr = {5,6,1,3,2,8,7,4,10,9};
		int index;
		
		System.out.print("삭제 위치: ");
		index = scan.nextInt();

		System.out.print("원본: ");
		System.out.println(Arrays.toString(arr));
		delete(arr, index);		
		System.out.print("결과: ");
		System.out.println(Arrays.toString(arr));
	}

	private static void delete(int[] arr, int index) {
		for(int i=index; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = 0;
	}
}
