package com.test.java.obj.constructor;

public class Ex36_Constructor {
	public static void main(String[] args) {
		
		//자료형 참조변수 = 객체생성연산자 생성자();
//		Box b1 = new Box();
		Box b1 = new Box("소형", 2000);
		
//		Box b1 = new Box();
//		
//		b1.setSize("소형");
		//b1.setPrice(2000);
		
		b1.setPrice(2500);
		
		System.out.println(b1.getSize());
		System.out.println(b1.getPrice());
		
		
		
	}

}


class Box{
	private String size;
	private int price;
	
	//기본 생성자
	public Box() {
//		this.size = "";
//		this.price = 0;
		this("");
	}
	
	public Box(String size) {
//		this.size = size;
//		this.price = 0;
		this(size,0);
	}
	
	public Box(String size, int price) {
		this.size = size;
		this.price = price;
	}
	
	public String getSize() {
		return size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}


class Cup {
	private String color;
	private int size;
	
	public Cup(int size) {
		this("", size);
	}

	public Cup(String color, int size) {
		this.color = color;
		this.size = size;
	}
}


class Mouse{
	private int a;
	private int b;
	private static int c;
	
	//객체 생성자 > 객체 내부를 초기화
	public Mouse(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	//정적 생성자
	static {
		Mouse.c = 0;
	}
}
