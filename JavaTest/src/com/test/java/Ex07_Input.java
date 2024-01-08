package com.test.java;

import java.io.IOException;

public class Ex07_Input {

	
	public static void main(String[] args) throws IOException {

		//요구사항] 사용자에게 문자 1개를 입력 > 화면에 출력하시오.
		//1. 라벨 출력
		//2. 문자 입력
		//3. 문자를 화면에 출력
		
		System.out.print("문자 입력 : ");
		
		// 사용자로부터 키보드 입력을 받아서 입력한 문자를 돌려준다.
		//- 현재 상태 > 사용자가 키를 입력하기를 기다리는 상태
		//- 사용자가 입력을 해야 대기 상태가 해제된다.
		
		int code = System.in.read();
		System.out.println("출력: " + code);
		System.out.printf("출력: %d\n",code);
		System.out.printf("출력: %c\n",code);
		
		code = System.in.read();
		System.out.printf("출력: %d\n",code);
		System.out.printf("출력: %c\n",code);
		
		
	}
}
