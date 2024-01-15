package com.test.java.obj;

public class Ex47_Interface {
	public static void main(String[] args) {
		Iphone14 p1 = new Iphone14();
		p1.powerOn();
		p1.call();
		p1.powerOff();
		
		S23 p2 = new S23();
		p2.powerOn();
		p2.call();
		p2.powerOff();
	}
}	

interface Phone{
	//인터페이스 멤버 선언 -- 구현된 멤버 불가능
//	public int a;
//	public int b;
//	public void ccc() {
//		
//	}
//	public abstract void aaa();
//	public void bbb();
//	void ccc();
	
	void powerOn();
	void powerOff();
	void call();
	
	
	
}


class Iphone14 implements Phone{

	@Override
	public void powerOn() {
		System.out.println("전원 on");
	}

	@Override
	public void powerOff() {
		System.out.println("전원 off");
	}

	@Override
	public void call() {
		System.out.println("전화 걸기");
	}
}

class S23 implements Phone{

	@Override
	public void powerOn() {
		System.out.println("전화를 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("전화를 끕니다.");
	}

	@Override
	public void call() {
		System.out.println("통화를 겁니다.");
	}
	
}














