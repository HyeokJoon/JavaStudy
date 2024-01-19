package com.test.java.file;

public class test {
	
	private int a = 10;
	private static int b = 20;
	
	public void aaa() {
		System.out.println("객체");
		//객체 메서드  > 객체 멤버 접근 가능
		this.a = 10;
		this.aaa();
		
		//객체 메서드 > 정적 멤버
		test.b = 20;
		test.bbb();
	}
	
	public static void bbb() {
		System.out.println("정적");
		// 정적 메서드 > 객체 멤버 ( X )
		
		test.b = 10;
		test.bbb();
		
	}
}
