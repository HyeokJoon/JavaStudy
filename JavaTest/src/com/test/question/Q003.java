package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q003 {
	public static void main(String[] args) throws IOException {
		
		//요구사항] 사각형의 너비와 높이를 입력받아 넓이와 둘레를 출력하시오.
		
		//조건
		//사각형 넓이 = 너비 * 높이
		//사각형 둘레 = 너비 * 2 + 높이 * 2
		
		
		// 변수 선언
		int width ,height;
		String input;
		
		// BufferedReader 생성
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 숫자 입력
		System.out.print("너비(cm): ");
		input = reader.readLine();
		width = Integer.parseInt(input);
		System.out.print("높이(cm): ");
		input = reader.readLine();
		height = Integer.parseInt(input);
		
		// 결과 출력
		System.out.printf("사각형의 넓이는 %d㎠입니다.\n",width*height);
		System.out.printf("사각형의 둘레는 %d㎝입니다.\n",2*(width+height));
	}
}
