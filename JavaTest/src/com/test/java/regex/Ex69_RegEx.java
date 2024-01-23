package com.test.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex69_RegEx {
	public static void main(String[] args) {
		
		/*
		3. **출현횟수**
    	- 바로 앞의 문자(집합)의 출현 횟수를 표현
        
        **3.1  생략**
        
        - 바로 앞의 대상의 출현 횟수가 생략 X , 중복 X
        - 출현 횟수 : 1
        - ex) abc > ab, abc, abb, ac, bc, bbc, aaabc
        
        **3.2  ?**
        
        - 바로 앞의 대상의 출현 횟수가 생략 O , 중복 X
        - 출현 횟수 : 0~1
        
        **3.3  +**
        
        - 바로 앞의 대상의 출현 횟수가 생략 X , 중복 O
        - 출현 횟수 : 1~무한대
        
        **3.4  ***
        
        - 바로 앞의 대상의 출현 횟수가 생략 O , 중복 O
        - 출현 횟수 : 0~무한대
		a{1,2}bc> ab, bc, abc, ac, abbc, abcc, aabc, aaabc
		
		*/
		
//		m1();
//		m2();
//		m3();
//		m4();
		m5();
		
		
	}

	private static void m5() {
		String txt = "안녕하세요. 홍길동입니다. 네? 당신 이름도 길동이라구요? 아~ 김길동이요? 저쪽에 최길동도 있어요. 그 옆에 남궁길동도 있습니다.";
		
		//요구사항 ] 모든 길동이 찾기
		String regex = "(홍|김|최|남궁)(길동)";
		
		Pattern p1 = Pattern.compile(regex);
		
		Matcher m1 = p1.matcher(txt);
		
		while(m1.find()) {
			System.out.println("찾은 이름: " + m1.group());
			System.out.println("성: "+ m1.group(1));
			System.out.println("이름: "+ m1.group(2));
			System.out.println();
		}
		
	}

	private static void m4() {
		String txt = "";
		
		String regex = "^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}";
		Pattern p1 = Pattern.compile(regex);
		
		Matcher m1 = p1.matcher(txt);
		while(m1.find()) {
			System.out.println(m1.group());
		}
		
	}

	private static void m3() {

		String txt = "안녕하세요. 홍길동입니다. 제 연락처는 010-8795-1355입니다. 연락주세요. "
				+ "혹시 연락이 안되면 다른번호 010-7894-1245로 연락주세요.";
		
		//txt안에 전화번호가 포함되어 있는가?
		
		String regex = "([0-9]{3})-([0-9]{4})-([0-9]{4})";
//		regex = "\\d{3}-\\d{4}-\\d{4}";
		
		//패턴 객체  == 정규표현식 객체
		Pattern p1 = Pattern.compile(regex);
		
		Matcher m1 = p1.matcher(txt);
//		
//		System.out.println(m1);
//		System.out.println(m1.find());
//		
//		if(m1.find()) {
//			System.out.println("txt내에서 전화번호 발견!");
//		}else {
//			System.out.println("txt내에서 전화번호 없음;;");
//		}
		
		int count = 0;
		while(m1.find()) {
			System.out.println("[전화번호 발견]");
			System.out.println(m1.group(0));
			System.out.println(m1.group(1));
			System.out.println(m1.group(2));
			System.out.println(m1.group(3));
			System.out.println();
			count ++;
		}
		System.out.printf("전화번호를 총 %d번 발견했습니다.\n",count);
	}

	private static void m2() {
		
		String name = "홍길동,,아무개;강아지,고양이 멍멍이";
		String[] list = name.split("[,;\\s]");
		
		for(String item: list) {
			
			
			System.out.println(item);
			
		}
			
//			if(item.contains(";")) {
//				String[] sublist = item.split(";");
//				System.out.println(Arrays.toString(sublist));
//			}
//			
//			System.out.println(item);
			
		
	}

	private static void m1() {
		
		String txt = "안녕하세요. 홍길동입니다. 제 연락처는 010-8795-1355입니다. 연락주세요. "
				+ "혹시 연락이 안되면 다른번호 010-7894-1245로 연락주세요.";
		
		
		//전화번호 마스킹
		System.out.println(
				txt
				.replaceAll("[0-9]{3}-[0-9]{3,4}-[0-9]{4}", "xxx-xxxx-xxxx")
				.replaceAll("[0-9]{3}.[0-9]{3,4}.[0-9]{4}", "xxx-xxxx-xxxx")
				.replaceAll("[0-9]{10,11}", "xxx-xxxx-xxxx")
				);
		
		//처음것만 변경
		System.out.println(
				txt.replaceFirst("[0-9]{3}-[0-9]{3,4}-[0-9]{4}", "xxx-xxxx-xxxx"));
	}
}








