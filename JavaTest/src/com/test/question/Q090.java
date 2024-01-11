package com.test.question;

import java.util.Scanner;

public class Q090 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력: ");
		String input = scan.nextLine();
		
		int sum = 0;
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			if(c >= '0' && c <='9') {
				sum += c - '0';
			}
		}
		
		System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다.\n",sum);
	}
}
