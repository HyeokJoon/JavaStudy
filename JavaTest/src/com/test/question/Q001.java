package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q001 {
	public static void main(String[] args) throws IOException {

		// 문제 1
		// 요구사항] 태어난 년도를 입력받아 나이를 출력하시오.

		// 변수 생성 및 초기화
		int age = 0, todayYear = 2024;
		String year = "";
		
		// BufferReader 생성
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// year 입력
		System.out.print("태어난 년도: ");
		year = reader.readLine();
		
		// 나이 계산
		age = todayYear - Integer.parseInt(year);
		
		// 결과 출력
		System.out.printf("나이: %d세", age);

	}
}
