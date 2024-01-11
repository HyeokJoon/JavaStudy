package com.test.question;

import java.util.Scanner;

public class Q087 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("단어: ");
		String input = scan.nextLine();
		String result = "";
		
		int sidx = 0;
		int eidx = 0;
		for(int i=1; i<input.length(); i++) {
			if(input.charAt(i)>='A' && input.charAt(i)<='Z') {
				eidx = i; 
				result += input.substring(sidx, eidx) + " ";
				sidx = eidx;
			}
		}
		result += input.substring(sidx);		
		
		System.out.println("결과: " + result);
	}
}
