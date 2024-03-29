package com.test.java;

public class Ex15_Method {
	public static void main(String[] args) {
	
		//void > 반환타입
		//hello > 메서드명 > 캐멀표기법
		//() > 인자리스트
		//요구사항] '홍길동'에게 인사하는 메서드를 구현하시오.
		//요구사항] '아무개'에게 인사하는 메서드를 구현하시오.
		//요구사항] '테스트'에게 인사하는 메서드를 구현하시오.
		hello();
		hello2();
		hello3();
		helloEveryOne("홍길동");//실인자
		helloEveryOne("아무개");
		helloEveryOne("테스트");
		checkAge(25);
		checkAge(10);
		checkAge(45);
		checkAge(90);
		checkScore(100,90,80);
		checkScore(50,65,30);
	}

	/**
	 * 성적을 평가합니다.
	 * @param kor 국어점수
	 * @param eng 영어점수
	 * @param math 수학점수
	 */
	public static void checkScore(int kor, int eng, int math) {
		int total = kor + eng + math;
		double avg = total/3.0;
		String result = avg>= 60? "합격" : "불합격";
		System.out.printf("평균 점수 %.1f점은 %s입니다.\n", avg, result);
	}
	
	public static void checkAge(int age) {
		String result = age>=18 ? "통과" : "거절";
		System.out.printf("입력한 나이 %d살은 %s입니다.\n", age, result);
		
	}
	public static void hello() {
		//구현부
		System.out.println("홍길동님. 안녕하세요.");
	}
	public static void hello2() {
		System.out.println("아무개님. 안녕하세요.");
	}
	public static void hello3() {
		System.out.println("테스트님. 안녕하세요.");
	}
	public static void helloEveryOne(String name) {//가인자
//		String name = "홍길동";
		System.out.println(name + "님. 안녕하세요.");
	}
	
	
}
