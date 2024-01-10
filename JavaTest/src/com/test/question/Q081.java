package com.test.question;

import java.util.Scanner;

public class Q081 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이메일: ");
		String email = scan.nextLine();
		
		System.out.print("아이디: " + email.split("@")[0]);
		System.out.println();
		System.out.print("도메인: " + email.split("@")[1]);
	}
}
