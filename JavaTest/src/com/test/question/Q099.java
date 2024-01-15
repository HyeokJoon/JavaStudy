package com.test.question;

public class Q099 {
	public static void main(String[] args) {
		//시간 1
		Time t1 = new Time(); //기본 생성자 호출
		System.out.println(t1.info());

		//시간 2
		Time t2 = new Time(2, 30, 45); //오버로딩 생성자 호출
		System.out.println(t2.info());

		//시간 3
		Time t3 = new Time(1, 70, 30); //오버로딩 생성자 호출
		System.out.println(t3.info());

		//시간 4
		Time t4 = new Time(30, 10); //오버로딩 생성자 호출
		System.out.println(t4.info());

		//시간 5
		Time t5 = new Time(90, 10); //오버로딩 생성자 호출
		System.out.println(t5.info());

		//시간 6
		Time t6 = new Time(50); //오버로딩 생성자 호출
		System.out.println(t6.info());

		//시간 7
		Time t7 = new Time(10000); //오버로딩 생성자 호출
		System.out.println(t7.info());
	}
}

class Time{
	private int hour;
	private int minute;
	private int second;
	public Time() {
		hour = 0;
		minute = 0;
		second = 0;
	}
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public Time(int minute, int second) {
		int tmp = 0;
		while(minute>60){
			tmp++;
			minute-=60;
		}
		this.hour = tmp;
		this.minute = minute;
		this.second = second;
	}
	
	public Time(int second) {
		int tmp_m = 0;
		while(second>60){
			tmp_m++;
			second-=60;
		}
		int tmp_h = 0;
		while(tmp_m>60){
			tmp_h++;
			tmp_m-=60;
		}
		this.hour = tmp_h;
		this.minute = tmp_m;
		this.second = second;
	}
	
	public String info() {
		return String.format("%02d:%02d:%02d", hour,minute,second);
	}
}
