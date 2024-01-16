package com.test.java;

public class Ex52_Generic {
	public static void main(String[] args) {
		Item<String> s1 = new Item<String>();
		s1.c = "홍길동";
		
		Item<Integer> s2 = new Item<Integer>();
		s2.c = 100;
		
		Pen<Boolean> p1 = new Pen(); // 별로임
		Pen<Boolean> p2 = new Pen<Boolean>(); // 정석
		Pen<Boolean> p3 = new Pen<>(); // java11이후 가능
		
		Desk<String> d1 = new Desk<>();
		d1.setType("사무용");
		System.out.println(d1.getType());
		
		LapTop<String, Integer> macbook = new LapTop<>("맥북", 3000000);
		System.out.println(macbook.getA());
		System.out.println(macbook.getB());
		
		LapTop<String, String> galaxy = new LapTop<>("갤럭시", "최고사양");
		System.out.println(galaxy.getA());
		System.out.println(galaxy.getB());
	}
}

//제네릭 클래스
//- T: 타입 변수
//- 
class Item<T>{
	public int a;
	public int b;
	public T c; // 클래스 선언 시 c의 자료형이 결정되지 않음. 객체를 생성할 때 결정
}

class Pen<T>{
	public T a;
	public T b;
	public T c;
}

class Desk<T> {
	private T type;
	public void setType(T type) {
		this.type = type;
	}
	public T getType() {
		return type;
	}
}

class LapTop<T,U>{
	private T a;
	private U b;
	
	public LapTop(T a, U b) {
		this.a = a;
		this.b = b;
	}
	
	public T getA() {
		return a;
	}
	public U getB() {
		return b;
	}
	public void setA(T a) {
		this.a = a;
	}
	public void setB(U b) {
		this.b = b;
	}
	
	
}




























