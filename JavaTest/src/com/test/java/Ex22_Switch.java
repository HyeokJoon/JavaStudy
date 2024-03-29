package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex22_Switch {

	
	public static void main(String[] args) throws IOException {
		
//		switch(조건) {
//		case 값:
//			구현부;
//			break;
//		[case 값:
//			구현부;
//			break;] xN
//		[default:
//			구현부;
//			break;]
//		}
//		m1();
//		m2();
		m3();
	}

	private static void m3() {
		int month = 5;
		int lastDay = 0;
		switch(month) {
		case 1: case 3: case 5:
		case 7: case 8: case 10:
		case 12:
			lastDay = 31;
			break;
		case 4: case 6: case 9: case 11:
			lastDay = 30;
			break;
		case 2:
			lastDay = 28;
			break;
		}
		System.out.printf("%d월은 %d일까지 있습니다.", month, lastDay);
		
	}

	private static void m2() throws IOException {
		// 자판기
		//- 메뉴출력
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("====================");
		System.out.println("        자판기");
		System.out.println("====================");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 박카스");
		System.err.println("--------------------");
		System.out.print("번호 선택: ");
		String input = reader.readLine();
		
		if(input.equals("1") || input.equals("2")) {
			System.out.println("700원입니다.");
		}else if(input.equals("3")) {
			System.out.println("500원입니다.");
		}else {
			System.out.println("선택하신 음료는 없습니다.");
		}
		
		switch(input) {
		case "1":
		case "2":
			System.out.println("700원입니다.");
			break;
		case "3":
			System.out.println("500원입니다.");
			break;
		default:
			System.out.println("선택하신 음료는 없습니다.");
		}
		

	
	}

	private static void m1() {
		// 숫자를 1개 입력받아 한글로 출력하시오.
		//1 > "하나"
		//2 > "둘"
		int num = 1;
		
		if(num==1) {
			System.out.println("하나");
		}else if(num==2) {
			System.out.println("둘");
		}else if(num==3) {
			System.out.println("셋");
		}
		
		switch(num) {
		case 1:
			System.out.println("하나");
			break;
		default:
			System.out.println("0");
		}
		
	}
}
