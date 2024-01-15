package com.test.java;

import java.util.Random;

public class Ex50_Random {
	public static void main(String[] args) {
		//Ex50_Random.java
		//1. Math.random()
		//2. Random 클래스
		
		m1();
		
	}

	private static void m1() {
		
		Random rnd = new Random();
		//각 자료형 별 > 난수 발생
		//rnd.nextXXX()
		
		for(int i=0; i<10; i++) {
//			System.out.println(rnd.nextInt());
//			System.out.println(rnd.nextInt(10));
//			System.out.println(rnd.nextBoolean());
			System.out.println(rnd.nextLong(100));
		}
		
	}
}









