package com.test.question;

import java.util.Scanner;

public class Q082 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		String input = scan.nextLine();
		
		int sum = 0;
		String opers = "";
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			sum += c - '0';
			
			if(i == input.length()-1)
				opers += c;
			else 
				opers += c + " + ";
		}
		
		System.out.println("결과: " + opers + " = " + sum);
	}
}
