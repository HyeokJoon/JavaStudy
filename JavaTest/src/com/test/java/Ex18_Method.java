package com.test.java;

public class Ex18_Method {

	public static void main(String[] args) {
		
		//요구사항] 선을 그리는 메서드를 선언하시오.
		//요구사항] -----
		//요구사항] *****
		
//		drawLine();
//		System.out.println("성적표");
//		drawLine();
		
		//기본선
		drawLine();
		drawLine();
		drawLine();
		drawLine("+");
		drawLine("+");
		drawLine("+");
		System.out.println(10);
		System.out.println("문자열");
		
	}
//	public static void drawLine() {
//		System.out.println("==========");
//	}
//
//	public static void drawLine() {
//		System.out.println("----------");
//	}
//
//	public static void drawLine() {
//		System.out.println("**********");
//	}
	
	public static void drawLine() {
		System.out.println("==========");
	}
	public static void drawLine(String c) {
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.println();
	}
	
	//K&R
	public static void m1() {
		
	}
	//Allman
	public static void m2() {
		
	}
}
