package com.test.java;

public class Ex24_For {

	public static void main(String[] args) {
		//Ex24_for.java
		
		/*
		 * 중첩된 for 문
		 * 
		*/
		
//		m1();
		m4();
	}

	private static void m4() {
		// 별찍기
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private static void m1() {
		// 단일
		for(int i=0; i<10; i++) {
			System.out.println("i: " + i);
		}
		System.out.println();
		// 2중
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.println("i: " + i + " , j: " + j);	
			}
			System.out.println();
		}
		System.out.println();
		
		// 3중
		for(int i=0; i<10; i++) { 
			for(int j=0; j<10; j++) {
				for(int k=0; k<10; k++) {
					System.out.printf("i: %d, j: %d, k: %d\n", i,j,k);
				}
			}
		}
		System.out.println();
	}
}
