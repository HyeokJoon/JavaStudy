package com.test.question;

public class Q017 {
	public static void main(String[] args) {
		position("홍길동");
		position("홍길동", "유재석");
		position("홍길동", "유재석", "박명수");
		position("홍길동", "유재석", "박명수", "정형돈");
	}

	private static void position(String string, String string2, String string3, String string4) {
		System.out.println("사원 : " + string);
		System.out.println("대리 : " + string2);
		System.out.println("과장 : " + string3);
		System.out.println("부장 : " + string4);
		System.out.println();
	}

	private static void position(String string, String string2, String string3) {
		System.out.println("사원 : " + string);
		System.out.println("대리 : " + string2);
		System.out.println("과장 : " + string3);
		System.out.println();
	}

	private static void position(String string, String string2) {
		System.out.println("사원 : " + string);
		System.out.println("대리 : " + string2);
		System.out.println();
	}

	private static void position(String string) {
		System.out.println("사원 : " + string);
		System.out.println();
	}
}
