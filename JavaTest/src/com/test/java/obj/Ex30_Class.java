package com.test.java.obj;

public class Ex30_Class {
	public static void main(String[] args) {
		
		//우리집 좌표
		int x = 100;
		int y = 200;
		
		System.out.printf("우리집은 [%d, %d]에 위치합니다.\n",x,y);
		
		//마트 좌표
		int x2 = 300;
		int y2 = 400;
		
		System.out.printf("마트는 [%d, %d]에 위치합니다.\n",x2,y2);
		
		//배열 사용
		//배열의 단점 > 요소의 성질 차이를 구분 불가능
		//동일한 자료형만 저장 가능
		int[] a = { 100, 200 };
		System.out.printf("우리집은 [%d, %d]에 위치합니다.\n",a[0],a[1]);
		
		int[] a2 = { 300, 400 };
		System.out.printf("마트는 [%d, %d]에 위치합니다.\n",a2[0],a2[1]);
		
		//클래스사용
		Point p1 = new Point();
		p1.x = 100;
		p1.y = 200;
		System.out.printf("우리집은 [%d, %d]에 위치합니다.\n",p1.x,p1.y);
		
		//마트 좌표
		Point p2 = new Point();
		p2.x = 300;
		p2.y = 400;
		System.out.printf("마트는 [%d, %d]에 위치합니다.\n",p2.x,p2.y);
		
		//모니터
		Size monitor = new Size();
		monitor.name = "LG모니터";
		monitor.width = 1920;
		monitor.height = 1080;
		
		//
		Score s1 = new Score();
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 90;
		s1.math = 88;
	}
}

class Point{
	
	//구현부
	public int x;
	public int y;
}

class Size{
	public String name;
	public int width;
	public int height;
}

class Score{
	public String name;
	public int kor;
	public int eng;
	public int math;
}

