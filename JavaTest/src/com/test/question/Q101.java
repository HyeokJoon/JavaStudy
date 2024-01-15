package com.test.question;

public class Q101 {
	public static void main(String[] args) {
		//바리스타
		Barista barista = new Barista();

		//손님 1
		//에스프레소 1잔 주문 - 원두 30g
		Espresso e1 = barista.makeEspresso(30);
		e1.drink();

		//손님 2
		//라테 1잔 주문 - 원두 30g, 우유 250ml
		Latte l1 = barista.makeLatte(30, 250);
		l1.drink();

		//손님 3
		//아메리카노 1잔 주문 - 원두 30g, 물 300ml, 각얼음 20개
		Americano a1 = barista.makeAmericano(30, 300, 20);
		a1.drink();

		//손님 4
		//에스프레소 10잔 주문 - 원두 25g
		Espresso[] e2 = barista.makeEspressoes(25, 10);

		for (Espresso e : e2) {
		      e.drink();
		}

		//손님 5
		//라테 5잔 주문 - 원두 25g, 우유 300ml
		Latte[] l2 = barista.makeLattes(25, 300, 5);

		for (Latte l : l2) {
		      l.drink();
		}

		//손님 6
		//아메리카노 15잔 주문 - 원두 20g, 물 350ml, 각얼음 30개
		Americano[] a2 = barista.makeAmericanos(20, 350, 30, 15);

		for (Americano a : a2) {
		      a.drink();
		}

		//결산
		barista.result();
	}
}
class Barista{
	public Espresso makeEspresso(int bean) {
		Espresso e = new Espresso(bean);
		Coffee.bean+=bean;
		Coffee.espresso++;
		return e;
	}
	public Espresso[] makeEspressoes(int bean, int count) {
		Espresso[] eList = new Espresso[count];
		Coffee.bean+=bean*count;
		Coffee.espresso+= count;
		for(int i=0; i<count; i++) {
			eList[i] = new Espresso(bean);
		}
		return eList;
	}
	public Latte makeLatte(int bean, int milk) {
		Coffee.bean+=bean;
		Coffee.milk+=milk;
		Coffee.latte++;
		Latte l = new Latte(bean,milk);
		return l;
	}
	public Latte[] makeLattes(int bean, int milk, int count) {
		Latte[] lList = new Latte[count];
		Coffee.bean+=bean*count;
		Coffee.milk+=milk*count;
		Coffee.latte+=count;
		
		for(int i=0; i<count; i++) {
			lList[i] = new Latte(bean,milk);
		}
		return lList;
	}
	public Americano makeAmericano(int bean, int water, int ice) {
		Americano a = new Americano(bean,water,ice);
		Coffee.bean+=bean;
		Coffee.water+=water;
		Coffee.ice+=ice;
		Coffee.americano++;
		return a;
	}
	public Americano[] makeAmericanos(int bean, int water, int ice, int count) {
		Americano[] aList = new Americano[count];
		Coffee.bean+=bean*count;
		Coffee.water+=water*count;
		Coffee.ice+=ice*count;
		Coffee.americano+=count;
		for(int i=0; i<count; i++) {
			aList[i] = new Americano(bean,water,ice);
		}
		return aList;
	}
	public void result() {
		System.out.println("=================================");
		System.out.println("판매 결과");
		System.out.println("=================================");
		System.out.println();
		
		System.out.println("---------------------------------");
		System.out.println("음료 판매량");
		System.out.println("---------------------------------");
		System.out.println("에스프레소 : "+Coffee.espresso+"잔");
		System.out.println("아메리카노 : "+Coffee.americano+"잔");
		System.out.println("라테 : "+Coffee.latte+"잔");
		System.out.println();
		
		System.out.println("---------------------------------");
		System.out.println("원자재 소비량");
		System.out.println("---------------------------------");
		System.out.printf("원두 : %,dg\n",Coffee.bean);
		System.out.printf("물 : %,dml\n",Coffee.water);
		System.out.printf("얼음 : %,d개\n",Coffee.ice);
		System.out.printf("우유 : %,dml\n",Coffee.milk);
		System.out.println();
		
		System.out.println("---------------------------------");
		System.out.println("매출액");
		System.out.println("---------------------------------");
		System.out.printf("원두 : %,d원\n",Coffee.bean*Coffee.beanUnitPrice);
		System.out.printf("물 : %,d원\n",(int)(Coffee.water*Coffee.waterUnitPrice));
		System.out.printf("얼음 : %,d원\n",Coffee.ice*Coffee.iceUnitPrice);
		System.out.printf("우유 : %,d원\n",Coffee.milk*Coffee.milkUnitPrice);
		System.out.println();
	}
}
class Coffee{
	public static int bean = 0;
	public static int water = 0;
	public static int ice = 0;
	public static int milk = 0;
	public static int beanUnitPrice = 1;
	public static double waterUnitPrice = 0.2;
	public static int iceUnitPrice = 3;
	public static int milkUnitPrice = 4;
	public static int beanTotalPrice = 0;
	public static int waterTotalPrice = 0;
	public static int iceTotalPrice = 0;
	public static int milkTotalPrice = 0;
	public static int americano = 0;
	public static int latte = 0;
	public static int espresso = 0;
}

class Espresso{
	private int bean;
	public Espresso() {
		bean = 0;
	}
	public Espresso(int bean) {
		this.bean = bean;
	}
	public void drink() {
		System.out.println("원두 "+bean+"g으로 만들어진 에스프레소를 마십니다.");
	}
}

class Latte{
	private int bean;
	private int milk;
	public Latte() {
		bean = 0;
		milk = 0;
	}
	public Latte(int bean,int milk) {
		this.bean = bean;
		this.milk = milk;
	}
	public void drink() {
		System.out.println("원두 "+bean+"g, 우유 "+milk+"ml으로 만들어진 라테를 마십니다.");
	}
}

class Americano{
	private int bean;
	private int water;
	private int ice;
	public Americano() {
		bean = 0;
		water = 0;
		ice = 0;
	}
	public Americano(int bean,int water, int ice) {
		this.bean = bean;
		this.water = water;
		this.ice = ice;
	}
	public void drink() {
		System.out.println("원두 "+bean+"g, 물 "+water+"ml, 얼음 "+ice+"개로 만들어진 아메리카노를 마십니다.");
	}
}


