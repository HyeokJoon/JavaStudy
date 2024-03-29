package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q005 {
	
	public static void main(String[] args) throws IOException {
//		요구사항
//		자전거가 있다. 자전거의 바퀴는 지름(직경)이 26인치이다. 사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오.
//
//		조건..
//		기어비 1:1 → 페달 1회전 == 자전거 바퀴 1회전
//		모든 출력 숫자는 천단위 표기하시오.
		
		//final 변수 지정
		final double InchToMetre = 0.0254;
		final double PI = 3.141592;
		
		//변수 생성
		double length, totalDist;
		int pedalings;
		
		//바퀴 둘레 계산
		length = PI*26*InchToMetre;
		
		//BufferedReader 생성
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//페달 밟은 횟수 입력
		System.out.print("사용자가 페달을 밟은 횟수: ");
		String input = reader.readLine();
		pedalings = Integer.parseInt(input);
		
		//총 이동거리 계산
		totalDist = length*pedalings;
		
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,.3fm를 달렸습니다.", pedalings, totalDist);
		
		
		
	}
}
