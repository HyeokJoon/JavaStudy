package com.test.java.collection;

import java.io.File;
import java.util.Calendar;

public class Ex58_File {
	public static void main(String[] args) {
//		m1();
		m2();
	}

	private static void m2() {
		//폴더 > 정보
		String path = "C:\\class\\code\\java\\file";
		
		//폴더 참조 객체
		File dir = new File(path);
		if(dir.exists()) {
			//파일조작
			System.out.println(dir.getName());
			System.out.println(dir.isFile());
			System.out.println(dir.isDirectory());
			System.out.println(dir.length());
			System.out.println(dir.getAbsolutePath());
			System.out.println(dir.lastModified());
			System.out.println(dir.isHidden());
			System.out.println(dir.canRead());
			System.out.println(dir.canWrite());
			System.out.println(dir.getParent());
		}else {
			System.out.println("해당 경로에 디렉터리가 없습니다.");
		}
		
	}

	private static void m1() {
		
		//C:\class\code\java\file\data.txt
		
		//파일 경로
		String path = "C:\\class\\code\\java\\file\\data.txt";
		
		//파일 참조 객체 > java.il.File 클래스
		
		File file = new File(path);
		if(file.exists()) {
			//파일조작
			System.out.println(file.getName());
			System.out.println(file.isFile());
			System.out.println(file.isDirectory());
			System.out.println(file.length());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.lastModified());
			
			Calendar c1 = Calendar.getInstance();
			c1.setTimeInMillis(file.lastModified());
			System.out.printf("%tF %tT\n",c1,c1);
			
			System.out.println(file.isHidden());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.getParent());
		}
		else {
			System.out.println("해당 경로에 파일이 없습니다.");
		}
	}
}
