package com.test.java;

public class Ex17_LocalVariable {
	
	//int a = 100;
	
	public static void main(String[] args) {
		
		int a = 10; //지역변수
		int num = 100;
		checkNumber(num);
	}
	
	public static void aaa() {
		int a = 10;
		bbb();
	}
	
	public static void bbb() {
//		System.out.println(a);
	}
	
	public static void checkNumber(int num) {
		
	}
	
	public static void test1() {
		int c = 30;
	}
	
	public static void test2() {
		int c = 50;
		int d = 30;
	}
}
