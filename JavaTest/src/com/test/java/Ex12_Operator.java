package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.annotation.processing.SupportedSourceVersion;

public class Ex12_Operator {
	public static void main(String[] args) throws IOException {
		//Ex12_Operator.java
		
		int a = 10;
		int b = 3;
		System.out.printf("%d > %d = %b\n", a,b,a>b);
		System.out.printf("%d >= %d = %b\n", a,b,a>=b);
		System.out.printf("%d < %d = %b\n", a,b,a<b);
		System.out.printf("%d >= %d = %b\n", a,b,a>=b);
		System.out.printf("%d == %d = %b\n", a,b,a==b);
		System.out.printf("%d != %d = %b\n", a,b,a!=b);
		
		
		//요구사항] 사용자 나이 입력 > 18세 이상이면 통과, 미만이면 거절
//		System.out.print("나이를 입력 : ");
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String input= reader.readLine();
//		int age = Integer.parseInt(input);
//		
//		System.out.println(age >= 18);
//		System.out.println();
//		
		//값형 
		int n1 = 100;
		int n2 = 100;
		int n3 = 50;
		n3 = n3 + 50;
		
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		System.out.println(n1 == n3);
		
		//참조형
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍";
		s3 = s3 + "길동";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		boolean f1 = true;
		boolean f2 = false;
		
		System.out.println(f1 && f2);
		System.out.println(f1 || f2);
		System.out.println(!f1);
		System.out.println(f1 ^ f2);
		
		//나이 입력 > 18세 이상이면 + 60세 미만 
		
		int age = 25;
		System.out.println(18 <= age && 60 > age);
		
		//연산자 우선순위
		//- 산술연산자 > 비교연산자 > 논리연산자 > 대입연산자
		
		int sum = 10 + 20 * 3;
		System.out.println(sum);
		
		int m1 = 100;
		int m2, m3;
		
		m3 = m2 = m1;
		System.out.println(m2);
		System.out.println(m3);
		
		
		int n = 10;
		n = n+1;
		System.out.println(n);

		n+=1;
		System.out.println(n);
		
		n+=5;
		System.out.println(n);
		
		
		
//		n = n+1;
//		n+=1
		
		n = 10;
		int result = 0;
		result = 10 + ++n;
		System.out.println(result);
		
		n = 10;
		result = 0;
		result = 10 + n--;
		System.out.println(result);
		System.out.println(n);
		
		int o = 10;
		System.out.println(--o - o--);
		System.out.println(o);
		
		System.out.println(1+1);
		System.out.println(123123123+3265311);
		
		System.out.println(true ? "남자" : "여자");
		System.out.println(false ? "남자" : "여자");
		
		
		age = 25;
		System.out.println(age >= 18 ? "통과" : "거절");
		
		a = 10;	//1010
		b = 5;	//0101
		System.out.println(a&1);	//0000 = 0
		System.out.println(a|b);	//1111 = 15
		
		
	}
}
