package com.test.java;

public class Ex16_Method {

	public static void main(String[] args) {
		//메서드의 반환값
		int num;
		System.out.println(num = test());
		
		System.out.println(checkNumber(10));
	}
	
	public static void getName() {
		String name = "홍길동";
		return;//빈 리턴문 > 강제로 메서드 종료
	}
	
	public static int getNum() {
		int num = 100;
		return num;
//		System.out.println("메서드 종료");
	}
	
	public static String checkNumber(int num) {
		return num%2 == 0 ? "짝수" : "홀수";
	}
	
	public static int test()
	{
		int a= 10;
		int b = 20;
		int c = a+b;
		return c;
	}
}
