package com.test.java.obj.inheritance;

public class Ex41_Overriding {
	public static void main(String[] args) {
		OverridingParent hong = new OverridingParent();
		
		hong.name = "홍길동";
		hong.hello();
		
		
		OverridingChild jhong = new OverridingChild();
		jhong.name = "홍철수";
		jhong.hello();
		
	}
}

class OverridingParent{
	public String name;
	public void hello() {
		System.out.printf("안녕하세요. 좋은 아침입니다. 저는 %s입니다.\n",this.name);
	}
}

class OverridingChild extends OverridingParent{
	public void hello() {
		System.out.printf("하이~ 방가~ 난 %s야 \n",this.name);
	}
}
