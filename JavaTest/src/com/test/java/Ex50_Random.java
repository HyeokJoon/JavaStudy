package com.test.java;

import java.util.Random;

public class Ex50_Random {
	public static void main(String[] args) {
		//Ex50_Random.java
		//1. Math.random()
		//2. Random 클래스
		
//		m1();
		m2();
		
	}

	private static void m2() {
		
		Random rnd = new Random();
		//문자열 난수 > 배열
		String[] name1 = {"김","이","박","최","정","유","민","차","강","장","조","전"};
		String[] name2 = {"길","동","재","석","명","수","진","원","호","미","주","이","경","준","혁","상","민"};
		
		String[] address1 = {"서울시","인천시","부산시","강릉시","대구시","광주시","제주시"};
		String[] address2 = {"강남구", "강동구", "강서구", "강북구", "중구"};
		String[] address3 = {"역삼동", "대치동", "압구정동", "천호동", "길동", "명일동"};
		for(int i=0; i<200; i++) {
			String name = name1[rnd.nextInt(name1.length-1)] 
						+ name2[rnd.nextInt(name2.length-1)]
						+ name2[rnd.nextInt(name2.length-1)];
			
			int age = rnd.nextInt(2) +13;
			
			String gender = rnd.nextInt(2) == 0 ? "남자" : "여자";
			
			String address = address1[rnd.nextInt(address1.length-1)] + " "
							+ address2[rnd.nextInt(address2.length-1)] + " "
							+address3[rnd.nextInt(address3.length-1)] + " ";
			
			System.out.printf("%s(%d세) %s %s\n",name,age,gender,address);
		}
		
	}

	private static void m1() {
		
		Random rnd = new Random();
		//각 자료형 별 > 난수 발생
		//rnd.nextXXX()
		
		for(int i=0; i<10; i++) {
//			System.out.println(rnd.nextInt());
//			System.out.println(rnd.nextInt(10));
//			System.out.println(rnd.nextBoolean());
			System.out.println(rnd.nextLong(100));
		}
		
	}
}









