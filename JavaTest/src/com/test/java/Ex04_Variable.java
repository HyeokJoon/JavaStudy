package com.test.java;

public class Ex04_Variable {

	public static void main(String[] args) {
		
		//Ex04_Variable.java
		
		// + 연산자
		
		double weight;
		weight = 50.6;
		
		int a = 10;
		int b = 20;
		
		//10 + 20 = 30;
		//A+B > 이항 연산자 (피 연산자를 2개)
		//연산자 우선순위 > 1 + 2 x 3 
		//연산자 방향
		System.out.println(a+" + "+b +" = "+(a+b));
		
		//주민등록번호 입력 > 출력
		//ex) 950105
		
		int jumin1 = 950105;
		System.out.println("주민번호: " + jumin1);
		
		jumin1 = 030711; 
		System.out.println("주민번호: " + jumin1); //문제 발생
		
		//자바의 기수법
		//- 10진수
		//- 2진수
		//- 8진수
		//- 16진수
		System.out.println("10진수 :" + 10);
		System.out.println("8진수 : " + 010);
		System.out.println("16진수 : " + 0x10);
		System.out.println("2진수 : " + 0b10);
	}
}
