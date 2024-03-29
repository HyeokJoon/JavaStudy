package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex21_If {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		m1();
//		m2();
//		m3();
//		m4();
		m5();
	}

	private static void m5() throws NumberFormatException, IOException {
		// 성적입력(0~100) > 합격/불합격
		// + 유효성 검사
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("성적: ");
		int score = Integer.parseInt(reader.readLine());
		
		if(score<0 || score>100) {
			System.out.println("점수는 0~100이내로 입력하세요");
		}
		else if(score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
	}

	private static void m4() throws IOException {
		//심리테스트
		int sum = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1. 어떤 개발툴을 선호합니까?");
		System.out.println("a. 메모장");
		System.out.println("b. 이클립스");
		System.out.println("c. 인텔리제이");
		
		System.out.print("선택: ");
		
		String seq = reader.readLine();
		
		if(seq.equals("a")) {
			sum += 1;
		}else if(seq.equals("b")) {
			sum += 3;
		}else if(seq.equals("c")) {
			sum += 5;
		}
		
		System.out.println("2. 어떤 프로그래밍 언어를 선호합니까?");
		System.out.println("a. Java");
		System.out.println("b. C#");
		System.out.println("c. Kotlin");
		
		System.out.print("선택: ");
		seq = reader.readLine();
		
		if(seq.equals("a")) {
			sum += 7;
		}else if(seq.equals("b")) {
			sum += 3;
		}else if(seq.equals("c")) {
			sum += 2;
		}
		
		System.out.println("3. 하루에 얼마나 코딩을 합니까?");
		System.out.println("a. 4시간");
		System.out.println("b. 2시간");
		System.out.println("c. 1시간");
		
		System.out.print("선택: ");
		seq = reader.readLine();
		
		if(seq.equals("a")) {
			sum += 7;
		}else if(seq.equals("b")) {
			sum += 3;
		}else if(seq.equals("c")) {
			sum += 2;
		}
		System.out.println("설문이 완료되었습니다.");
		
		System.out.println("[결과]");
		if(sum >10 ) {
			System.out.println("당신은 개발자의 자질이 있습니다.");
		}else if(sum >6){
			System.out.println("개발자가 되기 위해 조금 더 노력하세요.");
		}else System.out.println("다른거 하세요");
	}

	private static void m3() throws NumberFormatException, IOException {
		// 출근 > 기상 ?
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("기상 시간(시): ");
		
		int hour = Integer.parseInt(reader.readLine());
		
		if(hour<6) {
			System.out.println("지하철을 타고 출근한다.");;
		}else if(hour <7) {
			System.out.println("버스를 타고 출근한다.");
		}else if(hour < 8) {
			System.out.println("택시를 타고 출근한다.");
		}else System.out.println("병가를 낸다.");
	}

	private static void m2() throws NumberFormatException, IOException {
		//나이 입력 > 판단
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("나이: ");
		int age = Integer.parseInt(reader.readLine());
		
		String result = (age > 18) ? "성인" : "미성년자";
		
		if(age>18) {
			System.out.println("성인");
		}
		else {
			System.out.println("미성년자");
		}
		
	}

	private static void m1() {
		
		int num = 10;
		if(num>0) {
			System.out.println("num은 양수입니다.");
		}
		
		
		if(num>0) {
			System.out.println("num은 양수입니다.");
		}
		else {
			System.out.println("num은 음수입니다.");
		}
		
		if(num>0) {
			System.out.println("양수");
		}else if(num <0){
			System.out.println("음수");
		}else System.out.println("영");
		
		
		System.out.println("종료");
	}
}
