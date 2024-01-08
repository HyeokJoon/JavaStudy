package com.test.java;

public class Ex10_Casting {
	public static void main(String[] args) {
		
		
		byte b1;
		short s1;
		
		s1 = 128;
		b1 = (byte) s1;
		System.out.println(b1);
		
		//은행 계좌
		int m1;
		long m2 = 3000000000L;
		
		//계좌이체
		m1 = (int)m2;
		System.out.println(m1);
		
		//** 정수와 실수간의 크기 비교는 단순한 메모리 크기가 아닌 실제 저장하는 수의 범위로 비교한다.
		
		// byte < short < int < long <<<< float <<<< double
		
		//char 형변환
		
		char c1 = 'A';
		System.out.println((int)c1);
		System.out.println((char)65);
		
		
		//주의점
		char c2;
		short t2;
		c2 = '가';
		t2 =  (short)c2;
		System.out.println(t2);
		
		char c3;
		short t3;
		t3 = 65;
		c3 = (char)t3;
		System.out.println(c3);
		
		//String은 int로 형변환 할 수 없다.
//		System.out.println((int)"A");
		
		
		System.out.println((int)'A');
		
		//100 -> "100"
		 
		String txt2 = String.valueOf(100); // 정석
		String txt3 = 100 +"";
		String txt4 = "" + 100;
		String txt5 = 3.14 + ""; // "3.14"
		String txt6 = true + ""; // "true"
		
	}
}
