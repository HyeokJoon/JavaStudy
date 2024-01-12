package com.test.java.obj._static;

public class Ex37_Static {
	
	public static void main(String[] args) {
		
		//학생 3명 역삼중학교
		Student.setSchool("역삼중학교");
		
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setAge(15);

		Student s2 = new Student();
		s2.setName("아무개");
		s2.setAge(14);

		Student s3 = new Student();
		s3.setName("임꺽정");
		s3.setAge(16);
		
		System.out.println(s1.info());
		System.out.println(s2.info());
		System.out.println(s3.info());
	}
}


class Student{
	private String name;
	private int age;
//	private String school;
	
	private static String school;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	public String getSchool() {
//		return school;
//	}
//	public void setSchool(String school) {
//		this.school = school;
//	}
//	

	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
		Student.school = school;
	}
	
	public String info() {
		return String.format("%s[%d세, %s]", 
				this.name, 
				this.age, 
				Student.getSchool());
	}
	
}