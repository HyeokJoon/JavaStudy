package com.test.java;

import java.util.Scanner;

import com.test.java.board.adminboard.AdminBoard;
import com.test.java.board.freeboard.FreeBoard;
import com.test.java.board.memberboard.MemberBoard;
import com.test.java.member.Login;
import com.test.java.member.Logout;
import com.test.java.view.View;

public class Main {
	public static void main(String[] args) {
		
		//전체 흐름 통제
		boolean loop = true;
		Scanner scan = new Scanner(System.in);
		while(loop) {
			
			View.mainmenu();
			
			String sel = scan.nextLine();
			
			if(sel.equals("1")) {
				//로그인
				Login.login();
			}else if(sel.equals("2")) {
				//로그아웃
				Logout.logout();
			}else if(sel.equals("3")) {
				//자유게시판
				FreeBoard board = new FreeBoard();
				board.list();
			}else if(sel.equals("4")) {
				MemberBoard board = new MemberBoard();
				board.list();
				
			}else if(sel.equals("5")) {
				AdminBoard board = new AdminBoard();
				board.list();
				
			}else {
				loop = false;
			}
		}
		
		System.out.println("커뮤니티 종료");
		
	}
}
