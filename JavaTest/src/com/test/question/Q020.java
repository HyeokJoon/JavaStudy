package com.test.question;

import java.util.Calendar;

public class Q020 {
	public static void main(String[] args) {
		Calendar next100 = Calendar.getInstance();
		Calendar nextBirthday = Calendar.getInstance();
		
		next100.add(Calendar.DATE, 100);
		nextBirthday.add(Calendar.YEAR, 1);
		
		System.out.printf("백일: %tF\n",next100);
		System.out.printf("첫돌: %tF\n",nextBirthday);
		
	}
}
