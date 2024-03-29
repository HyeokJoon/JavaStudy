package com.test.java;

//import java.io.BufferedReader; // 클래스 임포트
//import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;  

public class Ex08_BufferedReader {
	public static void main(String[] args) throws IOException {
		
		//요구사항] 사용자로부터 문자 1개를 입력받아 화면에 출력
		
		//Ctrl + Shift + O
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.print("입력: ");
		int code = reader.read() - 'A';
		System.out.println(code);
		
		// A(65)~Z(90)
		// a(97)~z(122)
		// 0(48)~9(57)
//		 \r(13)
//		 \n(10)
//		 space(32)
//		 tab(9)
		
		// 완성형 한글 (가 ~ 힣)
		// 가(44032) ~ 힣(55203)
		
		//콘솔로부터 키보드 값을 입력받을 수 있는도구
		//System.in.read(); 와 동일 
//		System.out.print("문자 입력 > ");
//		int code = reader.read();
//		System.out.printf("%c",code);
		
		//이름 입력
//		System.out.print("이름: ");
//		String name = reader.readLine(); // 입력된 라인 전체를 읽기
//		System.out.printf("안녕하세요 %s님\n",name);
//		
//		//나이 입력
//		System.out.print("나이: ");
//		String age = reader.readLine();
//		System.out.printf("%s님의 나이는 %s살 입니다.",name,age);
		
		//요구사항] 2개의 숫자를 입력받아서 두 수의 합 구해라
		System.out.print("첫 번째 숫자: ");
		String input1 = reader.readLine();
		System.out.print("두 번째 숫자: ");
		String input2 = reader.readLine();
		
		//문자열 > 변환 > 숫자
		//- Integer
		//- Integer.parseInt(String a);
		double num1 = Double.parseDouble(input1);
		double num2 = Double.parseDouble(input2);
		
		System.out.println(num1+num2);
		
		
	}
}
