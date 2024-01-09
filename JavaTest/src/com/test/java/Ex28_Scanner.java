package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex28_Scanner {
	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("입력: ");
//		String line = scan.nextLine();
//		System.out.println(line);
//		
//		System.out.print("숫자: ");
//		int num = scan.nextInt();
//		System.out.println(10+num);
//		
//		System.out.print("숫자: ");
//		num = scan.nextInt();
//		System.out.println(10+num);
//		scan.nextLine();
//		scan.skip("\r\n");
//		
//		System.out.print("입력: ");
//		line = scan.nextLine();
//		System.out.println("마지막: " + line);
		
		//Finds and returns the next complete token from this scanner
//		System.out.print("입력: ");
//		String txt = scan.next();
//		System.out.println(txt);
		
		String txt = "";
		while(scan.hasNext()) {
			txt = scan.next();
			System.out.println(txt);
			
		}
		
	}
}
