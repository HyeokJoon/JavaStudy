package com.test.java;

public class Ex02_Variable {

	public static void main(String[] args) {

		/*
			자료형 + 변수
			
			variable
			1. 변수 생성하기
				- 자료형 변수명;
			2. 변수 초기화
				- 변수명 = 값;
				- =(대입 연산자)
		*/
		
		//int 국어
		int kor, eng;
		
		kor = 100;
		
		byte math;
		math = 100;
		
		System.out.println("kor : " + kor);
		System.out.println("math : " + math);
		
//		변수명을 만들 때 규칙
//		1. 영문자 + 숫자 + '_' 사용한다.
//		2. 숫자로 시작 불가능
//		3. 예약어 사용 불가능(보라색)
		byte kor1;
		byte kor_1;
		/*
		byte kor+;
		Syntax error on token "+", delete this token
		*/
		
		//변수 선언하는 방식
		int n1; // 선언 > 선언 직후 > 비어있는 상태 > 널(null)
		n1 = 100; // 초기화
		
		int n2 = 200; // 선언 + 초기화
		
		int n3;
		int n4;
		int n5, n6;
		
		// 지도 좌표(x,y)
		double x1; // 우리집 x좌표
		double y1; // 우리집 y좌표
		
		double x2, y2; // 친구집 x좌표, y좌표
		
		double x3, // 마트 x좌표
			   y3; // 마트 y좌표
		
		//학교 x좌표
		double x4;
		//학교 y죄표
		double y4;
		
		int m=0;
		System.out.println(m);
	} 
}








