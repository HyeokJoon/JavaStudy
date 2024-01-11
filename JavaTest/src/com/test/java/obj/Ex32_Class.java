package com.test.java.obj;

public class Ex32_Class {
	public static void main(String[] args) {
		
		Member m1 = new Member();
		m1.name = "홍길동";
		m1.age = 21;
		m1.hello();
		
		Member m2 = new Member();
		m2.name = "아무개";
		m2.age = 35;
		m2.hello();
		
		Member m3 = new Member();
		m3.name = "강아지";
		m3.age = 5;
		m3.hello();
	}
}

class Member{
	//멤버 변수
	public String name;
	public int age;
	//멤버 메서드
	public void hello() {
		System.out.printf("안녕하세요. 저는 %s입니다.\n", name);
	}
}