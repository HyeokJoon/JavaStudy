package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Ex53_Exception {
	public static void main(String[] args) {
		
		//Ex53_Exception.java
		
//		m1();
//		m2();
//		m3();
//		m4();
		try {
//			m5();
//			m6();
		}catch(Exception e){
			
		}
		m7();
				
	}

	private static void m7() {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			System.out.printf("입력: ");
			int input = Integer.parseInt(reader.readLine());
			
		} catch (Exception e) {
			System.out.println("Ex53_Exception.m7");
			e.printStackTrace();
		}
		
		System.out.println("종료");
				
	}

	private static void m6() throws IOException {
		//Wrapping class
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		
	}

	private static void m5() throws Exception{
		// TODO Auto-generated method stub
		
	}

	private static void m4() {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("숫자: ");
		int num = scan.nextInt();
		
		try {
			//비즈니스 코드 영역
			System.out.println(100/num);
			
		} catch (Exception e) {
			// 예외 처리 영역
			System.out.println("예외 처리");
		} finally {
			// 자원 해제 영역
			System.out.println("finally");
		}
				
		
	}

	private static void m3() {
		try {
			
			int num = 10;
			System.out.println(100/num);
			
			int[] nums = {10,20,30};
			System.out.println(nums[5]);
			
			Random rnd = null;
			System.out.println(rnd.nextInt());
			
		}
		catch (ArithmeticException e) {

			System.out.println("0을 나누기 > 김대리 연락");
		}
		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("배열 첨자 오류 > 박과장 연락");
		}
		catch (NullPointerException e) {

			System.out.println("널 참조 > 최대리 연락");
		}
		catch (Exception e) {
//			System.out.println(e.getMessage());
			System.out.println("예외 처리");
		}
		
	}

	private static void m2() {
		
		int num = 0;
		
		try {
			System.out.println(100/num);
		} catch (Exception e) {
			System.out.println("0을 나누기 > 김대리 연락");
		}
		
		int[] nums = {10,20,30};
		
		try {
			System.out.println(nums[5]);			
		} catch (Exception e) {
			System.out.println("배열 첨자 오류 > 박과장 연락");
		}
		
		
		Random rnd = null;
		try {
			System.out.println(rnd.nextInt());	
		} catch (Exception e) {
			System.out.println("널 참조 > 최대리 연락");
		}
		
		
	}

	private static void m1() {
		System.out.printf("숫자: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		//*** try문 > 감시 ! > 에러가 발생하는지 계속 검사
		//*** catch문 > 예외처리
		try {
			//비즈니스 코드(업무 코드)
			System.out.println(111);
			System.out.printf("100 / %d = %d\n", num, 100/num);
			System.out.println(222);
		}catch(Exception e) {
			
			//예외 처리 코드
			System.out.println("0을 입력하지 마시오.");
		}
		
		System.out.println("종료");
		
	}
}
