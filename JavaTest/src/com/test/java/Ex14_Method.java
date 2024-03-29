package com.test.java;

public class Ex14_Method {
	
	//Main 메서드
	//-특수 메서드
	public static void main(String[] args) {
		
		//요구사항] "안녕하세요." x5 출력
		//수정사항] "반갑습니다." x5로 변경 
		
		//Case A.
		//가장 단순한 방법
		//Ctrl + C,V : 하드코딩
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println();
		
		
		printNumber();
		
		//Case B.
		//메서드 호출
		hello();
		hello();
		hello();
		hello();
		hello();
		
		
	}//main
	
	//메서드 선언 위치
	//- 클래스 내부
	//- 메서드의 순서는 무관
	
	public static void hello() {
		
		//구현부 : 메서드가 하려는 업무
		System.out.println("반갑습니다.");
	}
	
	public static void printNumber() {
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덟");
		System.out.println("아홉");
		System.out.println("열");
	}
	
	
}//Ex14_Method
