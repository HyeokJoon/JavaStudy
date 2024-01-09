package com.test.question;

public class Q033 {
	public static void main(String[] args) {
		// 윤년인지 확인
		int year = 2020;
		
		System.out.println(isLeafYear(year));
			
	}
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
}
