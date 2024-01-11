package com.test.java.obj;

public class Ex33_Access {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.title = "자바 개발서";
		b1.aaa(25000);
		
		System.out.println(b1.title);
		System.out.println(b1.bbb());
		
		Book b2 = new Book();
		b2.title = "코딩테스트 문제집";
		b2.aaa(200000000);
		System.out.println(b2.title);
		System.out.println(b2.bbb());
		b2.setPublisher("영진 출판사");

		System.out.println(b2.title);
		System.out.println(b2.bbb());
		System.out.println(b2.getPublisher());
	}
}
