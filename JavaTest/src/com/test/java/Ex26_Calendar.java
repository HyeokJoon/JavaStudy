package com.test.java;

import java.util.Calendar;

public class Ex26_Calendar {
	
	public static void main(String[] args) {

		//Ex26_Calendar.java
		
		//1. 해당년월의 마지막 일/
		//2. 해당 년월의 1일의 요일
		
//		int year = 2024;
//		int month = 2;
		
		for(int i= 1; i <= 12; i++) {
			printCalendar(2024, i);
		}

	}

	private static void printCalendar(int year, int month) {
		int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year, month);
		
//		System.out.println(dayOfWeek); // 1 = 월요일
//		System.out.println(lastDay);
		
		System.out.println("====================================================");
		System.out.printf("                    %d년 %d월 달력\n", year, month);
		System.out.println("====================================================");
		System.out.println("[일]\t[월]\t[화]\t[수]\t[목]\t[금]\t[토]\t");
		System.out.println("----------------------------------------------------");
		
		for(int i=0; i<dayOfWeek; i++) {
			System.out.printf("\t");
		}
		
		for(int i=1; i<=lastDay; i++) {
			System.out.printf("%3d\t", i);
			if((dayOfWeek + i) % 7 == 0)
				System.out.println();
		}
		System.out.println();
		System.out.println();
	}

	private static int getLastDay(int year, int month) {
		switch(month) {
		case 1: case 7: case 3: case 5: case 8:
		case 10: case 12:
			return 31;
		case 4:case 6:case 9:case 11:
			return 30;
		case 2:
			return isLeafYear(year) ? 29:28;
		default:
			System.out.println("1~12까지 입력하세요");
		}
		return 0;
	}
	//메서드명 패턴
	//1. 반환값 getXXX()
	//2. setXXX(인자값)
	//3. boolean isXXX()

	private static boolean isLeafYear(int year) {
		// 윤년인지 확인
		if(year % 400 == 0)
		{
			return true;
		}
		if(year % 100 == 0) {
			return false;
		}
		if(year % 4 ==0) {
			return true;
		}
		return false;
	}

	private static int getDayOfWeek(int year, int month) {
		
		
		Calendar now = Calendar.getInstance();
		now.set(year, month-1, 1);
		long time = now.getTimeInMillis()/1000/3600/24;
		time++;
		
		
//		System.out.println(time);
		//1970년 1월1일 ~ 
		
		int date = 1; 
		//서기 1월1일부터 며칠이 지났는지
		int sum = 0;
		//1년 1월 1일 ~ 2023년 12월 31일 > 1년 365일
		for(int i=1; i<year; i++) {
			sum += 365;
			if(isLeafYear(i)) {
				sum++;
			}
		}
//		System.out.println(sum);
		
		//2. 2024 1 1 ~ 2024 ~ 3 31 > 1달씩
		for(int i=1; i<month; i++) {
			sum += getLastDay(year,i);
		}
		
		// 3. 2024년 1월 9일 
		sum += date;
		System.out.println(sum%7);
		System.out.println((time+3)%7);
		return (int) ((time+3)%7);
	}
}
