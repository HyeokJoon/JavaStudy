package com.test.java;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class Ex20_DateTime {

	public static void main(String[] args) throws IOException {
		
		//m1();
//		m2();
//		m3();
//		m4();
//		m5();
		m6();
	}
	
	private static void m6() {
		// 
		int h1 = 2;
		int h2 = 1;
		
		System.out.println(h1+h2);
		
		//2시간 30분 + 10분 = 2시간 40분
		int hour = 2;
		int min = 30;
		min += 10;
		
		System.out.printf("%d시간 %d분\n",hour, min);
		
		//2시간 30분 + 40분 = 2시간 40분

		hour = 2;
		min = 30;
		min += 40;
		
		hour += min/60;
		min %= 60;
				
		System.out.printf("%d시간 %d분\n",hour, min);
		
	}

	private static void m5() {
		// 연산
		// 시각 - 시각 = 시간
		
		// 내가 태어나서 살아온 시간?
		
		Calendar now = Calendar.getInstance();
		Calendar birthday = Calendar.getInstance();
		Calendar birthday_s = Calendar.getInstance();
		
		birthday.set(1998, 6, 7, 12, 0, 0);
		birthday_s.set(2002, 04, 24, 12, 0, 0);
		
		//System.out.println(now - birthday);
		//Epoch Time , Tick 을 구해서 계산해야 함
		System.out.println(birthday.getTimeInMillis());
		System.out.println(now.getTimeInMillis());
		
		long gap = now.getTimeInMillis() - birthday.getTimeInMillis();
		
		System.out.printf("살아온 시간: %,dms\n",gap);
		System.out.printf("혁준이가 살아온 시간: %,dh\n",gap /1000/60/60);
		System.out.printf("혁준이가 살아온 시간: %,d일\n",gap /1000/60/60/24);
		long gap_s = now.getTimeInMillis() - birthday_s.getTimeInMillis();
		System.out.printf("서진이가 살아온 시간: %,dh\n",gap_s /1000/60/60);
		System.out.printf("서진이가 살아온 시간: %,dh\n",gap_s /1000/60/60/24);
		
		
		//수료일까지? 112일
		Calendar end = Calendar.getInstance();
		end.set(2024, 5, 17);
		System.out.printf("수료일까지 남은 일: %d일\n"
				,(end.getTimeInMillis()-now.getTimeInMillis())/1000/60/60/24);
		
		//오늘 집에 가려면 남은 시간?

		Calendar out = Calendar.getInstance();
		out.set(Calendar.HOUR_OF_DAY, 17);
		out.set(Calendar.MINUTE, 50);
		
		System.out.printf("남은시간: %.1f시간", (out.getTimeInMillis() - now.getTimeInMillis())/1000.0/60/60);
		
	}

	private static void m4() {
		
		// 연애 100일 구하고 싶음
		
		Calendar now = Calendar.getInstance();
		System.out.printf("1일차: %tF\n", now);
		
		now.add(Calendar.DATE, 99); 
		System.out.printf("100일차: %tF\n", now);
		
		//1주일 전?
		now = Calendar.getInstance();
		now.add(Calendar.DATE, -7);
		System.out.printf("일주일 전: %tF\n", now);
		
		//컵라면에 > 3분뒤?
		
		now = Calendar.getInstance();
		now.add(Calendar.MINUTE, 3);
		System.out.printf("3분뒤: %tT\n", now);
	}


	private static void m3() {
		// TODO 오후 2시에 이대리에게 질문!
		// XXX 치명적 문제
		// FIXME 오류 해결
		
		//특정 날짜를 생성하기 > 올해 크리스마스
		Calendar christmas = Calendar.getInstance(); // 현재시각
		System.out.printf("%tF\n",christmas);
		
		//수정
//		christmas.set(christmas.MONTH, 11);
//		christmas.set(christmas.DATE, 25);
		
//		christmas.set(2024, 11, 25);
		
		christmas.set(2024, 11, 25, 18, 30, 0);
		
		System.out.printf("%tF\n",christmas);
		System.out.printf("%tT\n",christmas);
		
	}

	private static void m2() {
		// Calendar 클래스
		Calendar c1 = Calendar.getInstance(); // 객체 생성
		
		System.out.println(Calendar.YEAR);					//인덱스
		System.out.println(c1.get(Calendar.YEAR));			//2024	> 년
		System.out.println(c1.get(Calendar.MONTH));			//0		> 월 (0~11)
		System.out.println(c1.get(Calendar.DATE));			//5 	> 일 (1~)
		System.out.println(c1.get(Calendar.HOUR));			//11 	> 시(12H)
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));	//11 	> 시(24H)
		System.out.println(c1.get(Calendar.MINUTE));		//8		> 분
		System.out.println(c1.get(Calendar.SECOND));		//35	> 초
		System.out.println(c1.get(Calendar.MILLISECOND));	//0.960	> 밀리초
		System.out.println(c1.get(Calendar.AM_PM));			//0		> 오전(0) 오후(1)
		System.out.println(c1.get(Calendar.DAY_OF_YEAR));	//5		> 일(년)
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));	//5		> 일(월)
		System.out.println(c1.get(Calendar.DAY_OF_WEEK));	//6		> 요일 일(1) ~ 토(7)
		System.out.println(c1.get(Calendar.WEEK_OF_YEAR));	//1		> 몇주차
		System.out.println(c1.get(Calendar.WEEK_OF_MONTH));	//1		> 몇주차
		
		System.out.println();
		
		//요구사항] "오늘은 2024년 1월 5일입니다." 출력하세요
		System.out.printf("오늘은 %d년 %d월 %d일입니다.\n"
							, c1.get(Calendar.YEAR)
							, c1.get(Calendar.MONTH)+1
							, c1.get(Calendar.DATE));
		
		System.out.printf("오늘은 %d년 %d월 %s일입니다.\n"
							, c1.get(Calendar.YEAR)
							, c1.get(Calendar.MONTH)+1
							, c1.get(Calendar.DATE) <10 ? "0"+c1.get(Calendar.DATE) : ""+c1.get(Calendar.DATE));
		
		System.out.printf("오늘은 %d년 %02d월 %02d일입니다.\n"
				, c1.get(Calendar.YEAR)
				, c1.get(Calendar.MONTH)+1
				, c1.get(Calendar.DATE));
		
		//요구사항] "지금은 오전 11시 36분 49초입니다."
		System.out.printf("지금은 %s %d시 %d분 %d초입니다.\n"
							,c1.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
							,c1.get(Calendar.HOUR)
							,c1.get(Calendar.MINUTE)
							,c1.get(Calendar.SECOND));
		
		System.out.printf("%tF\n", c1); // 2024-01-05
		System.out.printf("%tT\n", c1); // 11:32:07
		System.out.printf("%tA\n", c1); // 금요일
	}
	
	

	private static void m1() {
		//Date 클래스
		
		Date now = new Date(); // 컴퓨터의 시각을 가져온다.
		
		System.out.println(now);
		
	}
}
