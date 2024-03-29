package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13_Operator {
	public static void main(String[] args) throws IOException {
		//요구사항 ] 사용자로부터 문자 1개 입력 > 영어 소문자인지 검사?
		
		//1. 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//2.
		System.out.printf("문자 입력 : ");
		
		//3. read() vs readLine()
		//- read() : 1문자, 문자 코드값이 필요한경우 int
		//- readLine() : N문자, 문자 코드 값을 알아내기가 번거롭다 String
		int code = reader.read();
		
		//4. 유효성 검사
		//System.out.println(code);
		String result = ((code >= 'a' && code <='z')? "소문자 입니다." : "소문자가 아닙니다.");
		
		System.out.printf("입력한 문자 %c는 %s", code, result);
	}
}
