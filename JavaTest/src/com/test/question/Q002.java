package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q002 {
	public static void main(String[] args) throws IOException {
		//요구사항] 숫자 2개를 입력받아 아래의 연산식을 출력하시오.
		
		//조건
		//- 출력 숫자에 천단위 표기 하시오.
		//- 결과값은 소수 이하 1자리까지 표기 하시오.
		
		
		// 변수 선언
		int num1 ,num2;
		String input;
		
		// BufferedReader 생성
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 숫자 입력
		System.out.print("첫번째 숫자: ");
		input = reader.readLine();
		num1 = Integer.parseInt(input);
		System.out.print("두번째 숫자: ");
		input = reader.readLine();
		num2 = Integer.parseInt(input);
		
		// 연산식 출력
		System.out.printf("%,d + %,d = %,d\n", num1, num2, num1+num2);
		System.out.printf("%,d - %,d = %,d\n", num1, num2, num1-num2);
		System.out.printf("%,d * %,d = %,d\n", num1, num2, num1*num2);
		System.out.printf("%,d / %,d = %,.1f\n", num1, num2, (float)num1/num2);
		System.out.printf("%,d %% %,d = %,d\n", num1, num2, num1%num2);
		
		
	}
}
