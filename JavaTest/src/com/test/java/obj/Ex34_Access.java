package com.test.java.obj;

public class Ex34_Access {
	public static void main(String[] args) {
		Monitor m1 = new Monitor();
		
		m1.setModel("TG100");	//쓰기
		System.out.println(m1.getModel());	//읽기
		
		//m1.setSize(100); 		//없음
		System.out.println(m1.getSize());	//읽기 전용 프로퍼티
		
		m1.setPrice(300000);	//쓰기 전용 프로퍼티
		//System.out.println(m1.getPrice());//없음
		
		System.out.println(m1.getLevel()); 	//가상프로퍼티 계산된 프로퍼티
	}
}
