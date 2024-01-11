package com.test.question;

import java.util.Scanner;

public class Q089 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액(원): ");
		String input = scan.nextLine();
		
		String result = longNumToKor(input);
		
		System.out.println("일금 " + result);
		
	}

	private static String longNumToKor(String input) {
		String first, second;
		if(input.length() > 4) {
			first = input.substring(0,input.length()-4);
			second = input.substring(input.length()-4);	
			return numToKor(first) + "만" + numToKor(second) + "원";
		}
		else {
			return numToKor(input) + "원";
		}
		
	}

	private static String numToKor(String input) {
		String[] units = {"천","백","십", ""};
		String result = "";
		for(int i=0; i<4; i++) {
//			System.out.println(i);
			int idx = input.length()-4 +i;
			if(idx < 0)
				continue;
			char c = input.charAt(idx);
			
			if(charToKor(c) != "")
				result += charToKor(c) + units[i];
		}
		
		return result;
	}

	private static String charToKor(char c) {
		switch (c) {
		case '1':
			return "일";
		case '2':
			return "이";
		case '3':
			return "삼";
		case '4':
			return "사";
		case '5':
			return "오";
		case '6':
			return "육";
		case '7':
			return "칠";
		case '8':
			return "팔";
		case '9':
			return "구";
		case '0':
			return "";
		}
		return null;
	}
}
