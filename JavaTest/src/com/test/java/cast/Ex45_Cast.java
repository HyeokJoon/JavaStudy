package com.test.java.cast;

public class Ex45_Cast {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		// 복사
		//Parent = Chlid
		//암시적인 형변환
		//자식클래스 > 부모클래스
		p1 = c1;
		p1 = (Parent)c1;
		
		Parent p2;
		Child c2;
		p2 = new Parent(); // 부모 클래스 > 원본 역할
		
		
		Child c4 = new Child();
		Parent p3 = new Parent();
		c4 = (Child)p3;
		
//		Point p4 = new Point();
	}
}


class Parent{
	public int a;
	public int b;
}

class Child extends Parent{
	public int c;
	public int d;
}