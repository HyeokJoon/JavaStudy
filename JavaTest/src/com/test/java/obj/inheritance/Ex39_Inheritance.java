package com.test.java.obj.inheritance;

public class Ex39_Inheritance {
	public static void main(String[] args) {	
		Parent p1 = new Parent();
		p1.a = 10;
		p1.b = 20;
		p1.ccc();
		
		Child c1 = new Child();
		c1.d = 30;
		c1.e = 40;
		
		c1.a = 50;
		c1.b = 60;
		c1.fff();
	}
}

class Parent{
	public int a;
	public int b;
	public void ccc() {
		System.out.println("ccc");
	}
}

class Child extends Parent{
	public int d;
	public int e;
	public void fff() {
		System.out.println("fff");
	}
}

class Member{
	public String id;
	public String pw;
}

class User extends Member{
	public String name;
	public int point;
}

class Administrator extends Member{
	public int level;
}


class AAA{
	
}

class BBB extends AAA{
	
}

class CCC extends BBB{
	
}

class DDD extends CCC{
	
}


