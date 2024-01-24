package com.test.java;

public class Ex70_String {
	public static void main(String[] args) {
//		m1();
		m2();
	}

	private static void m2() {
		
		String txt = "홍길동";
		txt = txt + "님";
		System.out.println(txt);
		

		String txt2 = "홍길동님";
		System.out.println(txt2);
		
		long begin = 0, end = 0;
		
		begin = System.currentTimeMillis();
		
		String txt3 = "홍길동";
		for(int i=0; i<100000; i++) {
			txt3 += ".";
		
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("길이 : %,d자\n시간: %,dms\n", txt3.length(),end-begin);
		
		
		
		begin = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder("홍길동");
		
		for(int i=0; i<100000; i++) {
			sb.append(".");
		
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("길이 : %,d자\n시간: %,dms\n", sb.length(),end-begin);
		
		
	}

	private static void m1() {
		
		//값형 
		int n1 = 10;	//크기 4byte
		int n2 = 10000;	//크기 4byte
		
		//참조형
		int[] ns1 = {10,20,30};			//12byte
		int[] ns2 = {10,20,30,40,50};	//20byte
		
		String s1 = "홍길동"; 		//6byte
		String s2 = "홍길동입니다.";	//14byte
		
		String s3 = "문자열문자열문자열문자열문자열문자열";
		String s4 = "문자열문자열문자열문자열문자열문자열";
		String s5 = "문자열문자열문자열문자열문자열문자열.";
		
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println(s3==s4);
		System.out.println(s4==s5);
		
		s4 += ".";

		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println(s3==s4);
		System.out.println(s4==s5);
		
	}
}

class Item2{
	private int num;
	private String type;
	/*
	@Override
	public String toString() {
		return String.format("Item [num=%s, type=%s]", num, type);
	}
	*/
	
	
	/*
	@Override
	public String toString() {
		return "Item [num=" + num + ", type=" + type + "]";
	}
	*/
	
	
	/*
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [num=");
		builder.append(num);
		builder.append(", type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}
	*/
}

