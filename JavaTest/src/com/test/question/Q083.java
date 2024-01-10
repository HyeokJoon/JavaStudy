package com.test.question;

import java.util.Scanner;

public class Q083 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] names = {"mp3", "jpg", "java", "hwp", "doc"};
		int[] count = {0,0,0,0,0}; 
		
		for(int i=0; i<10; i++) {
			System.out.print("파일명: ");
			String name = scan.nextLine();
			String extension = name.split("\\.")[1];
			
			for(int j=0; j<names.length; j++) {
				if(names[j].equals(extension)) {
					count[j]++;
					break;
				}
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(names[i] + " : " + count[i] +"개");
		}
	}
}
