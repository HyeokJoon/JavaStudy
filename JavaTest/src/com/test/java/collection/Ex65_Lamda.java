package com.test.java.collection;

public class Ex65_Lamda {
	public static void main(String[] args) {
		
		//요구사항] MyInterface를 구현한 객체를 생성하시오.
		
		//Case 1. 클래스 선언 + 객체 생성
		MyInterface m1 = new MyClass();
		m1.test();
		
		//Case 2. 익명 객체 생성
		MyInterface m2 = new MyInterface() {
			@Override
			public void test() {
				System.out.println("익명 객체에서 구현한 메서드");
			}
		};
		m2.test();
		
		//Case 3. 람다식
		MyInterface m3 = () -> {
			System.out.println("람다식으로 구현한 메서드");
		};
		m3.test();
		
		
		TestInterface t1 = new TestInterface() {

			@Override
			public void aaa() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void bbb() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
//		TestInterface t2 = () -> {
//			
//		};
		
		NoParameterNoReturn pr1 = new NoParameterNoReturn() {
			@Override
			public void call() {
				System.out.println("pr1");
			}
		};
		pr1.call();
		
		NoParameterNoReturn pr2 = () -> {
			System.out.println("pr2");
		};
		pr2.call();
		
		//*** 람다식 구현부 > 문장 1개 > {} 생략 가능
		NoParameterNoReturn pr3 = () -> System.out.println("pr2");
		
		
		//*** 람다식의 매개변수 자료형을 생략할 수 있따.
		ParameterNoReturn pr4 = (n) -> {
			System.out.println(n);
		};
		pr4.call(10);
		
		//*** 람다식의 매개변수 ()을 생략할 수 있따.
		ParameterNoReturn pr5 = n -> {
			System.out.println(n);
		};
		pr5.call(30);
		
		ParameterNoReturn pr6 = n -> System.out.println(n);
		pr6.call(100);
		
		
		
		MultiParameterNoReturn pr8 = (String name, int age) -> {
			System.out.println(name + ", "+age);
		};
		pr8.call("홍길동", 20);
		
		MultiParameterNoReturn pr9 = (name, age) -> {
			System.out.println(name + ", "+age);
		};
		pr9.call("아무개", 25);
		
		// *** 매개변수 ()는 매개변수가 1개일 때만 생략이 가능하다.\
//		MultiParameterNoReturn pr10 = name,age -> {
//			System.out.println(name + ", "+age);
//		};
		
		MultiParameterNoReturn pr10  
			= (name, age) -> System.out.println(name + ", "+age);
			
		pr8.call("호호호", 28);
		
		
		
		
		
		
		
		NoParameterReturn pr11 = () -> {
			return 10;
		};
		System.out.println(pr11.call());
		
		//*** 구현부에 return문이 유일하면 {}와 return 키워드를 생략 가능
		NoParameterReturn pr12 = () -> 10;
		System.out.println(pr12.call());
		
		ParameterReturn pr13 = (int a, int b) ->{
			return a+b;
		};
		System.out.println(pr13.call(10, 20));
		
		ParameterReturn pr14 = (a, b) -> a+b;
		System.out.println(pr14.call(100, 200));
	}
}

interface TestInterface{
	void aaa();
	void bbb();
}

@FunctionalInterface
interface MyInterface{
	void test();
}

class MyClass implements MyInterface{

	@Override
	public void test() {
		System.out.println("실명 클래스에서 구현한 메서드");
	}
	
}

interface NoParameterNoReturn{
	void call();
}

interface ParameterNoReturn{
	void call(int n);
}

interface MultiParameterNoReturn{
	void call(String name, int age);
}

interface NoParameterReturn{
	int call();
}

interface ParameterReturn{
	int call(int a, int b);
}















