package com.test.java;

public class Ex03_Variable {
	public static void main(String[] args) {
		
		//Ex03_Variable.java
		
		//모든 자료형 + 변수 생성하기
		
		//정수
		byte b1;
		b1 = 100; // 100 > 상수 (=데이터) > 정수형 상수, 정수형 리터럴
		System.out.println(b1);
		
		b1 = (byte)128;
		System.out.println(b1);
		
		b1 = Byte.MAX_VALUE;
		System.out.println(b1);
		
		b1 = Byte.MIN_VALUE;
		System.out.println(b1);
		
		
		short s1;
		s1 = 100;
		System.out.println(s1);
		
		s1 = 128;
		System.out.println(s1);
		
		s1 = Short.MAX_VALUE;
		System.out.println(s1);
		
		s1 = Short.MIN_VALUE;
		System.out.println(s1);
	
		
		int n1;
		n1 = 100;
		System.out.println(n1);
		
		n1 = 1000000000;
		n1 = 1_000_000_000;
		System.out.println(n1);
		
		n1 = Integer.MAX_VALUE;
		System.out.println(n1);
		
		n1 = Integer.MIN_VALUE;
		System.out.println(n1);
		
		
		long l1;
		l1 = 100;
		System.out.println(l1);
		
		l1 = 1000000000;
		System.out.println(l1);
		
		//모든 상수들도 자료형을 가진다.
		l1 = 3000000000L; // 리터럴 상수는 기본으로 int이기 때문에 long이라는 표시 'L', 'l'을 추가
		System.out.println(l1);
		
		l1 = Long.MAX_VALUE;
		System.out.println(l1);
		
		l1 = Long.MIN_VALUE;
		System.out.println(l1);

		//******** LValue와 RValue는 자료형이 동일해야한다.
		//왼쪽(변수) = 오른쪽(상수)
		//LValue = RValue
		
		//100의 자료형은 int
		//b1 = 100; // byte	 = int
		//s1 = 100; // short = int
		//i1 = 100; // int	 = int
		//l1 = 100; // long	 = int
		
		/***********************************/
		
		//실수
		
		//단정도형
		float f1;
		f1 = 3.14F;
		System.out.println(f1);
		
		f1 = Float.MAX_VALUE;
		System.out.println(f1);
		
		f1 = Float.MIN_NORMAL;
		System.out.println(f1);
		
		f1 = Float.MIN_VALUE;
		System.out.println(f1);
		
		//배정도형
		double d1;
		d1 = 6.28;
		System.out.println(d1);
		
		
		
		//차이점
		f1 = 123.1234567890123456789012345678901234567890F;
		d1 = 123.1234567890123456789012345678901234567890;
		System.out.println(f1);
		System.out.println(d1);
		
		double d2 = 0.2;
		double d3 = 0.1;
		System.out.println(d2 + d3);
		
		//해결법
		//0.2*10 = 2
		//0.1*10 = 1
		//2+1
		//3/10 = 0.3
		
		System.out.println((d2*10 + d3*10)/10);
		
		/*************************/
		
		//문자형
		char c1;
		c1 = 'A'; // 홑따옴표 >> 문자형 상수(리터럴)
		System.out.println(c1);
		
		c1 = '9'; // 숫자가 아님 '1' != 1
		System.out.println(c1 + 10);
		
		c1 = '길';
		System.out.println(c1);
		
		c1 = '\'';
		System.out.println(c1);
		
		
		//논리형
		boolean flag;
		flag = true; //논리형 상수(리터럴) -> 예약어 사용
		flag = false;
		System.out.println(flag);
		
		//String , 문자열 참조형변수
		String name = "";
		name = "홍길동";
		System.out.println(name);
		
//		값형과 참조형의 근본적인 차이점
//		메모리에 생성되는 규칙이 다르다.
		int a = 10;
		String b = "홍길동";
		
		/* 규칙
		 * 1. 우리가 만드는 모든 변수는 stack에 생성(할당)됨
		 * 2. 값형 변수는 stack에 할당된 공간에 값이 저장된다.
		 * 3. 참조형 변수는 stack에 할당된 공간에 heap의 주소값이 저장된다.
		 * 4. heap의 주소값에는 참조형변수값이 저장된다.
		 * */
		
		//각 자료형별(8+1) > 변수 1개 생성 > 값을 대입 > 출력
		// x 10번씩
		
		//샘플
		//1. 데이터 선정
		//- 몸무게
		
		//2. 데이터를 자정할 자료형 선택
		//- 몸무게 범위 + 형태
		
		String place = "쌍용교육센터";
		System.out.println("현재 위치는 "+place+"입니다.");
		String bookName = "채쌤의 자바 프로그래밍";
		System.out.println("강의 교재는 "+bookName+"입니다.");
		String studentName = "김혁준";
		System.out.println("제 이름은 "+studentName+"입니다.");
		String teacherName = "박세인";
		System.out.println("강사님 이름은 "+teacherName+"입니다.");
		String phoneNumber = "010-8107-0162";
		System.out.println("제 전화번호는 "+phoneNumber+"입니다.");
		
		byte computerNumber = 59;
		System.out.println("제 컴퓨터 번호는 "+computerNumber+"입니다.");
		byte roomNumber = 1;
		System.out.println("강의실은 "+roomNumber+"번 강의실 입니다.");
		byte startHour = 9;
		System.out.println("시작 시간은 "+startHour+"시 입니다.");
		byte endHour = 18;
		System.out.println("종료 시간은 "+endHour+"시 입니다.");
		byte weekdays = 7;
		
		
		short numOfDays = 365;
		short shoeSize = 260;
		short age = 26;
		short height = 8;
		short weight = 7;
		short playTime = 1000;
		
		
		
		
		
		
	}
}
















