package com.test.java;

public class Ex23_For {
	public static void main(String[] args) {
		
//		for(초기식; 조건식; 증감식) {
//			구현부;
//		}
		
//		m1();
		m10();
		
	}

	private static void m10() {
		// TODO Auto-generated method stub
		
		//0~1사이의 값
		System.out.println((Math.random()));
		
		//0~9 (정수)
		System.out.println((int)(Math.random()*10));
		//주사위(0~6)
		System.out.println((int)(Math.random()*6)+1);
		
		//5*8
		System.out.println((int)(Math.random()*4)+5);
		
	}

	private static void m1() {
		//요구사항] "안녕하세요." x5 번 출력

		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println();
		
		hello();hello();hello();hello();hello();
		System.out.println();
		
		
		
	}

	private static void hello() {
		System.out.println("안녕하세요.");
	}
}
