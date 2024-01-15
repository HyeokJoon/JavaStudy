package com.test.java.obj;

public class Ex46_Abstract {
	public static void main(String[] args) {
//		Mouse m1 = new Mouse();
//		m1.bbb();
		
	}
}
//추상 클래스
abstract class Mouse{
//	public int a;
//	public void aaa() {
//		System.out.println("타이핑을 합니다.");
//	}
//
//	public abstract void bbb();
//	
	public String model;
	public int price;
	
	public void info() {
		System.out.println("model: "+this.model);
		System.out.println("price: "+this.price);
	}
	
	public abstract void click();
	
}

class M410 extends Mouse{

	@Override
	public void click() {
		System.out.println("비싼 스위치를 사용해서 클릭 구현");
	}
	
}

class G305 extends Mouse{
	public void click() {
		System.out.println("저렴한 스위치를 사용해서 클릭 구현");
	}
}


//일반 클래스
class Keyboard{
	public int a;
	public void aaa() {
		
	}
	//일반클래스는 추상 메서드를 가질 수 없다.
//	public abstract void bbb();
}