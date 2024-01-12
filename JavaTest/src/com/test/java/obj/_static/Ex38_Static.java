package com.test.java.obj._static;

public class Ex38_Static {
	public static void main(String[] args) {
		
		//요구사항]
		//1. 펜을 생성하시오.
		//2. 생성된 펜의 개수를 세시오.
		
		
		//Case 1.
		int count = 0;
		
		Pen p1 = new Pen("MonAmi", "Black");
		Pen p2 = new Pen("MonAmi", "Black");
		Pen p3 = new Pen("MonAmi", "Black");
		
		Pen p4 = p1;
		
		System.out.println("볼펜 개수: "+ Pen.getCount());
		
		
		//Case 2.
		//- Pen클래스와 count의 관계
	}
}

//class Pen{
//	private String model;
//	private String color;
//	
//	public Pen(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
//	
//	public String dump() {
//		return String.format("[model: %s, color: %s]", this.model, this.color);
//	}
//}

class Pen{
	private String model;
	private String color;
	private static int count = 0;
	
	public Pen(String model, String color) {
		this.model = model;
		this.color = color;
		Pen.count++;
	}
	
	public String dump() {
		return String.format("[model: %s, color: %s]", this.model, this.color);
	}
	public static int getCount() {
		return Pen.count;
	}
}