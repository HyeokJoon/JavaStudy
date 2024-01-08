package com.test.java;

public class Ex19_Method {
	
	public static void main(String[] args) {
		int n = 4;
		int result = factorial(n);
		System.out.printf("%d! = %d\n", n, result);
		
	}
	
	public static void m1() { // 재귀 메서드
		
		System.out.println("메서드1");
		
	}
	
	public static int factorial(int n) {
		return (n==1) ? 1 : n * factorial(n-1);
	}
}
