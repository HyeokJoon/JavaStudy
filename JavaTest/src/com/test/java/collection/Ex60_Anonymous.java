package com.test.java.collection;

public class Ex60_Anonymous {
	public static void main(String[] args) {
		//요구사항] 인터페이스를 구현한 클래스 선언하기 > 객체를 생성하기
		
		
		//1. 본인 타입의 참조 변수를 만들기
		BBB b1 = new BBB();
		b1.test();
		
		//2. 
		AAA b2 = new BBB();
		
		//3.
		AAA b3 = new AAA() {
			// interface 이름을 사용해서 새로운 클래스를 만들 수 있다.
			// 익명 클래스
			@Override
			public void test() {
				System.out.println("익명 객체 클래스");
				
			}
			
		};
		
		AAA b4 = new AAA() {
			@Override
			public void test() {
				System.out.println("익명 객체 클래스");	
			}
		};
		b4.test();
		
	}
}

interface AAA{
	void test();
}

class BBB implements AAA{

	@Override
	public void test() {
		System.out.println("추상 메서드를 구현");
		
	}
	
}
