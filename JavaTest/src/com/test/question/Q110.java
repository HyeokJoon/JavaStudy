package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q110 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("파일경로: ");
		String path = scan.nextLine();
		String[] units = {"B","KB","MB","GB","TB"};
		
		
		File file = new File(path);
		if(file.exists()) {
			
			String name = file.getName();
			
			int idx = file.getName().lastIndexOf(".");
			String type = file.getName().substring(idx+1);
//			String type = file.getName().split("\\.")[1];
			
			double size = file.length();
			int cnt = 0;
			if(size > 1024) {
				cnt++;
				size /= 1024;
			}
			System.out.println("파일명 : " + name);
			System.out.println("종류: " + type + " 파일");
			System.out.printf("파일 크기: %.1f %s",size,units[cnt]);
			
		}
		else {
			System.out.println("경로에 파일이 없습니다.");
		}
		
	}
}
/*
‪D:\Q6_files\operator06.html
operator06
html
142KB (145,644 바이트)
*/

