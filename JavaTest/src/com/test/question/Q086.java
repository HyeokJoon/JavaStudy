package com.test.question;

import java.util.Scanner;

public class Q086 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		String input = scan.nextLine();
		
		int endIdx = input.length()-1;
		int startIdx = endIdx-3;
		
		int idx = input.length();
		while(true) {
			idx -=3;
			if(idx <0)
				break;
			input = insertComma(idx, input);
		}
		System.out.println(input);
	}

	private static String insertComma(int idx, String input) {
		String front = input.substring(0,idx);
		String back = input.substring(idx);
		return front+","+back;
	}
}
