package com.test.java;

public class Ex11_Operator {
	public static void main(String[] args) {
		int a = 10;
		int b =3;
		
		System.out.printf("%d + %d = %d\n",a,b,a+b);
		System.out.printf("%d - %d = %d\n",a,b,a-b);
		System.out.printf("%d * %d = %d\n",a,b,a*b);
		System.out.printf("%d / %d = %d\n",a,b,a/b);
		System.out.printf("%d %% %d = %d\n",a,b,a%b);
		
		double c = 10;
		double d = 3;
		System.out.printf("%.0f / %.0f = %f\n", c, d, c/d);
//		 정수 / 정수 = 정수
//		 실수 / 실수 = 실수
//		 정수 / 실수 = 실수
//		 실수 / 정수 = 실수
		
		// 모든 산술 연산자의 결과값의 자료형 >> 두 피연산자의 자료형 중에서 더 큰 자료형으로 반환된다.
		System.out.println(10/3);
		System.out.println(10.0/3.0);
		System.out.println(10.0/3);
		System.out.println(10/3.0);
		
		int e = 1000;
		byte f = 10;
		System.out.println(e+f);
		
		int g = 1000000000;
		int h = 2000000000;
		long i = (long)g+h;
		System.out.println(i);
		
		byte j = 10;
		byte k = 20;
		
		System.out.println(j+k);
		
		//byte와 short의 연산은 항상 int이다.
		byte l = (byte)(j+k);
		
		// 정수 > int 주로 사용. 가끔씩 long 사용
		// 실수 > double 주로 사용
		
		// float의 정밀도가 낮기 때문에 double을 주로 사용
		float m;
		int n = 123456789;
		m = n;
		System.out.println((int)m);
		// %(나머지)
		// - 패턴 생성
		
		System.out.println(10%2);
	}
}
























