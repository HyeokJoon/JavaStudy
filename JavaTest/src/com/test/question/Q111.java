package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q111 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("폴더: ");
		String path = scan.nextLine();
		System.out.print("확장자: ");
		String exp = scan.nextLine();
		
		File dir = new File(path);
		File[] fileList = dir.listFiles();
		
		for(File file : fileList) {
			if(file.isFile()) {
				if(file.getName().split("\\.")[1].equals(exp)) {
					System.out.println(file.getName());
				}
			}
		}
		
	}
}
/*
C:\class\dev\eclipse
exe
*/