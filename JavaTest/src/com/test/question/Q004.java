package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q004 {
	public static void main(String[] args) throws IOException {
		

		
		// 변수 생성
		double tempC, tempF;
		
		// BufferedReader 생성
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 온도 입력
		System.out.print("섭씨(℃): ");
		String input = reader.readLine();
		tempC = Double.parseDouble(input);
		
		// 화씨 계산
		tempF = tempC * 1.8 + 32;
		
		// 결과 출력
		System.out.printf("섭씨 %.1f℃는 화씨 %.1f℉입니다.", tempC, tempF);
	}
}
