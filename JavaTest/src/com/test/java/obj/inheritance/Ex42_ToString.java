package com.test.java.obj.inheritance;

import java.util.Calendar;
import java.util.Date;

import com.test.java.obj.Monitor;

public class Ex42_ToString {
	public static void main(String[] args) {
		
		Monitor m1 = new Monitor();
		m1.setModel("LG100");
		m1.setPrice(500000);
		
		//방금 만든 객체의 상태가 궁금? > 출력을 통해서 상태 확인
		System.out.println(m1.getModel());
		System.out.println(m1.getSize());
		System.out.println(m1.getLevel()); // 귀찮음 ;; 
		
		//객체의 상태를 일괄적으로 확인 > 단점: info() 메서드를 사람들이 잘 모름..
		//System.out.println(m1.info());
		System.out.println(m1);
		
		
		Time t1 = new Time(2,30);
		Time t2 = new Time(3,50);
		
		System.out.println(t1.info());
		System.out.println(t2.info());
		System.out.println(t1.toString()); //t1.toString() == Date.toString()
		System.out.println(t2); //t2.toString()
		
		Date now1 = new Date();
		Calendar now2 = Calendar.getInstance();
		
		System.out.println(now1);
		System.out.println(now1.toString()); //Date.toString()
		System.out.println(now2);
		System.out.println(now2.toString()); //Calendar.toString()

		
	}
}

class Time{
	private int hour;
	private int minute;
	
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}

	public String info() {
		return this.hour + ":" + this.minute; 
	}
	
	@Override
	public String toString() {
		return this.hour + ":" + this.minute;
	}
	
}