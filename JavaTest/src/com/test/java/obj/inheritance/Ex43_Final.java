package com.test.java.obj.inheritance;

import java.util.Calendar;

public class Ex43_Final {
	public static void main(String[] args) {
		
		final int A = 10;
		System.out.println(Calendar.YEAR);
		
		
//		final int MALE = 1;
//		final int FEMALE = 2;
		
		Student s1 = new Student();
		s1.age = 20;
		s1.name = "홍길동";
		s1.gender = Gender.MALE;
		
		Student s2 = new Student();
		s2.name = "호호호";
		s2.age = 22;
		s2.gender = Gender.FEMALE;
	}
}

final class FinalParent{
	public String test() {
		return "성별";
	}
}

//class FinalChild extends FinalParent{
//
//	@Override
//	public String test() {
//		return "나이";
//	}
//	
//}



class Gender{
	public static final int MALE = 1;
	public static final int FEMALE = 2;
}

class Student {
	
	public String name;
	public int age;
	public int gender; // 성별 > 남자(1) , 여자(2)
}