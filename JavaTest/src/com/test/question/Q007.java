package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q007 {
	
	
	/**
	 * 아스키 코드값을 인자로 받아서 대문자인지 소문자인지 반환
	 * @param code 아스키 코드
	 * @return String
	 */
	public static String getTag(int code) {
		return code>= 'a' && code <= 'z' ? "소문자" : "대문자"; 
	}
	
	public static void main(String[] args) throws IOException {
//		요구사항
//		영문 소문자를 1글자 입력받은 후 대문자로 변환해서 출력하시오.
//
//		조건..
//		대문자와 소문자의 문자 코드값의 관계
		
		//변수 생성
		int codeInput, codeOther;
		
		//BufferedReader 생성
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//문자 입력
		System.out.print("문자 입력: ");
		codeInput = reader.read();
		
		//대응되는 문자의 아스키코드값 계산
		codeOther = (codeInput >= 'a' && codeInput <= 'z') ? 
				(codeInput-'a'+'A') : codeInput-'A'+'a';
		
		//결과 출력
		System.out.printf("%s \'%c\'의 %s는 \'%c\'입니다.",getTag(codeInput), codeInput, getTag(codeOther), codeOther);
		
		
		
		
	}
}
