package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex25_While {
	public static void main(String[] args) throws IOException {
		
		//m1();
		//m2();
//		m3();
		m4();
	}
	

	private static void m4() {
		// test git push
		System.out.println("hello git");
		System.out.println("change");
	}

	private static void m3() throws IOException {
		//자판기
		//-루프 > (메뉴 출력 > 선택 > 결과) xN
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		boolean loop = true;
		String sel = "";
		while(loop) {
			System.out.println("============");
			System.out.println("    자판기");
			System.out.println("============");
			System.out.println("1. 콜라");
			System.out.println("2. 사이다");
			System.out.println("3. 박카스");
			System.out.println("4. 종료");
			System.out.println("------------");
			
			sel = reader.readLine();
			switch (sel) {
			case "1":
				System.out.println("700원입니다.");
				pause(reader);
				break;
			case "2":
				System.out.println("600원입니다.");
				pause(reader);
				break;
			case "3":
				System.out.println("500원입니다.");
				pause(reader);
				break;
			case "4":
				System.out.println("프로그램을 종료합니다.");
				loop = false;
				break;
			}
		}
	}

	private static void pause(BufferedReader reader) throws IOException {
		System.out.println("계속하려면 엔터를 입력하세요..");
		reader.readLine();
	}

	private static void m2() {
		//1~100까지 누적하시오.
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum +=i;
		}
		System.out.println(sum);
		
		sum =0;
		int num = 1;
		while(num <=100) {
			sum += num++;
		}
		System.out.println(sum);
	}

	private static void m1() {
		// 1~10까지 출력하시오.
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		int num=1;
		while(num <=10) {
			System.out.println(num);
			num++;
		}
	}
}
