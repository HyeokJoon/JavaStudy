package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q006 {
	public static void main(String[] args) throws IOException {
//		요구사항
//		사용자의 한달 수입을 입력받아 세후 금액을 출력하시오.
//
//		조건..
//		세금: 수입의 3.3%
		
		//변수 선언
		long income;
		double tax;
		
		//BufferedReader 생성
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//한달 수입 입력
		System.out.print("한달 수입 금액(원): ");
		String input = reader.readLine();
		income = Long.parseLong(input);
		
		//세금 계산
		tax = income * 0.033;
		
		//결과 출력
		System.out.printf("세후 금액(원): %,.0f원", income-tax);
		System.out.printf("세금(원) : %,.0f원",tax);
		
	}
}
