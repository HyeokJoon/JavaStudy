package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q069 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 길이: ");
		int len = scan.nextInt();
		
		int[] arr = new int[len];
		int[] result = new int[len/2 + len%2];
		
		for(int i=0; i<len; i++) {
			arr[i] = (int)(Math.random()*100 % 9 +1);
		}
		
		System.out.print("원본: ");
		System.out.println(Arrays.toString(arr));
		
		int idx = 0;
		for(int i=0; i<len; i+=2) {
			if(i==len-1) {
				result[idx] = arr[i];
			}
			else {
				result[idx] = arr[i]+arr[i+1];
			}
			idx++;
		}
		System.out.print("결과: ");
		System.out.println(Arrays.toString(result));
	}
}
