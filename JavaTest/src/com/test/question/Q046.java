package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q046 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String output = "";
		
		for(int i=0; i<10; i++) {
			System.out.print("숫자: ");
			int code = Integer.parseInt(reader.readLine());
			
			if(code > 9)
			{
				System.out.println("다시 입력하세요");
				i--;
				continue;
			}
			output += numberToKor(code);
		}
		
		System.out.println(output);
		
		
	}

	private static String numberToKor(int code) {
		switch (code){
		case 1:
			return "일";
		case 2:
			return "이";
		case 3:
			return "삼";
		case 4:
			return "사";
		case 5:
			return "오";
		case 6:
			return "육";
		case 7:
			return "칠";
		case 8:
			return "팔";
		case 9:
			return "구";
		}
		return null;
	}
}
