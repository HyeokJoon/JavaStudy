package com.test.java;

public class Ex05_Escape {
	public static void main(String[] args) {
		//Ex05_Escape.java
		
		//특수문자 > Escape Sequence
		//- 컴파일러가 번역을 할 때, 소스의 문자를 그대로 출력하지 않고, 미리 약속된 표현으로 바꿔서 출력하는 요소
		
//		1. \n
//		- new line, line feed
//		- 개행문자
		char c1 = '\n';
		String s1 = "\n";
		
		//** 문자열 리터널 내에는 엔터를 작성할 수 없다.
		String msg = "안녕하세요.\n홍길동입니다.";
		System.out.println(msg);
		System.out.println();
		
//		2. \r
//		- carriage return;
//		- 캐럿(커서)의 위치를 현재 라인의 가장 앞으로 이동
//		- 키보드 Home키 역할
		msg = "안녕하세요.\r홍길동";
		System.out.println(msg);
		
//		운영체제의 엔터
//		1. 윈도우 > \r\n
//		2. 맥OS > \r
//		3. 리눅스 > \n
		
//		3. \t
//		- 탭문자, tab
//		
		msg = "하나	둘	셋";
		System.out.println(msg);
		msg = "하나\t둘\t셋";
		System.out.println(msg);
		
		msg = "홍길동\b입니다.";
		System.out.println(msg);
		
		//요구사항] 화면 > 홍길동 : "안녕하세요."
		System.out.println("홍길동 : \"안녕하세요.\"");
		//요구사항] 수업 폴더의 경로를 출력하시오.
		//C:\class\code\java
		System.out.println("C:\\class\\code\\java");
	}
}
