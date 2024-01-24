package com.test.java.view;

import java.util.Scanner;

import com.test.java.member.Member;

public class View {
	public static void mainmenu() {
		System.out.println("============================");
		if(Member.auth != null) {
			System.out.println("           커뮤니티" + Member.auth);
		
		}else {
			System.out.println("           커뮤니티");
		}
		System.out.println("============================");
		if(Member.auth == null) {
			System.out.println("1. 로그인");
			
		}else {
			System.out.println("2. 로그아웃");
			
		}
		System.out.println("3. 자유 게시판");
		if(Member.auth != null) {
			System.out.println("4. 회원 게시판");	
		}
		if(Member.auth != null && Member.level.equals("2")) {
			System.out.println("5. 관리자 게시판");	
		}
		System.out.println("0. 종료");
		System.out.println("----------------------------");
		System.out.printf("선택(번호): ");
	}
	
	public static void title(String title) {
		System.out.println("==================");
		System.out.println("      " + title);
		System.out.println("==================");
	}

	public static void pause() {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("계속하려면 엔터를 입력하세요.");
		scan.nextLine();
		System.out.println();
		
	}
}
