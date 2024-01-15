package com.test.java.obj;

public class Ex48 {
	public static void main(String[] args) {

		//상황] 프린터 대리점 운영
		//1. LG100 모델 x 5대, HP200모델 x3대
		//2. 하루 1번씩 > 제품 점검 > 모델과 상관없이 출력 기능 확인!
		
		//추가상황]
		//1. 프린터 재고 증가
		//2. 프린터 종류 증가
//		m1();
//		m2();
		m3();
	}

	private static void m3() {
		//Case 3.
		//-배열 + 업다운 캐스팅
		
		//업캐스팅 = 자식객체를 부모 변수에 넣을 수 있다.
		Printer[] plist = new Printer[8];
//		plist[0] = new LG100("lg100", 300000, "black", 100);
//		plist[1] = new HP200("hp200", 1000000, "white");
		
		Printer[] list = new Printer[8];
		for(int i=0; i<list.length; i++) {
			if(i<5)
				list[i] = new LG100("lg100", 300000, "black", 100);
			else {
				list[i] = new HP200("hp200", 1000000, "white");
			}
		}
		
		for(int i=0; i<list.length; i++) {
			if(list[i] instanceof LG100) {
				LG100 lg = (LG100)list[i];
				lg.selfTest();
			}
			else   {
				HP200 hp = (HP200)list[i];
				hp.call();
			}
			
			//연산자
			//-객체
			//System.out.println(list[i] instanceof LG100);
		}
		
		
	}

	private static void m2() {
		//Case 2.
		//-같은 종류의 프린터를 조작 > 아주 가성비 높은 방식
		//-다른 종류의 프린터가 증가 > 같은 패턴 증가
		LG100[] lg = new LG100[5];
		HP200[] hp = new HP200[3];
		
		for(int i=0; i<lg.length; i++) {
			lg[i] = new LG100("lg100", 300000, "black", 100);
		}
		for(int i=0; i<hp.length; i++) {
			hp[i] = new HP200("hp200", 1000000, "white");
		}
		//점검
		for(int i=0; i<lg.length; i++) {
			lg[i].print();
			lg[i].selfTest();
		}
		for(int i=0; i<hp.length; i++) {
			hp[i].print();
			hp[i].call();
		}
		
	}

	private static void m1() {
		//Case 1.
		//-가장 비효율적인 방식
		//-대당 비용 동일
		LG100 lg1 = new LG100("lg100", 300000, "black", 100);
		LG100 lg2 = new LG100("lg100", 300000, "black", 100);
		LG100 lg3 = new LG100("lg100", 300000, "black", 100);
		LG100 lg4 = new LG100("lg100", 300000, "black", 100);
		LG100 lg5 = new LG100("lg100", 300000, "black", 100);
		
		HP200 hp1 = new HP200("hp200", 1000000, "white");
		HP200 hp2 = new HP200("hp200", 1000000, "white");
		HP200 hp3 = new HP200("hp200", 1000000, "white");
		
		lg1.print();
		lg2.print();
		lg3.print();
		lg4.print();
		lg5.print();
		
		hp1.print();
		hp2.print();
		hp3.print();
	}
}


//클래스의 부모 역할
//1. 일반 클래스
//2. 추상 클래스
//3. 인터페이스

abstract class Printer{
	private String model;
	private int price;
	
	//제품의 종류와 상관없이 공통된 기능 선언 > 출력기능 > void print()
	public Printer(String model, int price) {
		this.model = model;
		this.price = price;
	}
	public abstract void print();
}

class LG100 extends Printer{
	private String color;
	private int size;
	
	
	
	public LG100(String model, int price, String color, int size) {
		super(model, price);
		this.color = color;
		this.size = size;
	}

	public void print(){
		System.out.printf("%d 사이즈로 출력합니다.\n",this.size);
	}
	
	public void selfTest() {
		System.out.println("자가 진단을 합니다.");
	}
}

class Dell300 extends Printer{

	public Dell300(String model, int price) {
		super(model, price);
	}

	@Override
	public void print() {
		System.out.println("Dell 방식으로 출력합니다.");
	}
	
}

class HP200 extends Printer{

	private String type;
	

	public HP200(String model, int price, String type) {
		super(model, price);
		this.type = type;
	}
	
	public void print() {
		System.out.printf("%s 방식으로 출력합니다.\n",this.type);
	}
	
	public void call() {
		System.out.println("상담원과 연결합니다.");
	}
	
}