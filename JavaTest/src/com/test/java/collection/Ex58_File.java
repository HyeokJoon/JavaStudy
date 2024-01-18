package com.test.java.collection;

import java.io.File;
import java.util.Calendar;

public class Ex58_File {
	private static int fileCount;
	private static int dirCount;
	private static int dirSize;
	static{
		fileCount = 0;
		dirCount = 0;
		dirSize = 0;
	}
	public static void main(String[] args) {
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m6();
//		m7();
//		m8();
//		m9();
//		m10();
//		m11();
//		m12();
//		m13();
		m14();
//		m15();
	}

	private static void m15() {

		//폴더 > 정보?
		//720MB (755,171,568 바이트)
		//파일 13,137, 폴더 2,605
		
		
		String path = "C:\\class\\code\\java\\file";
		File dir = new File(path);
		
		
	}

	private static void m14() {
		//폴더 > 정보?
		//720MB (755,171,568 바이트)
		//파일 13,137, 폴더 2,605
		

		String path = "C:\\class\\code\\java\\file";
		File dir = new File(path);
		
		if(dir.exists()) {
			count(dir);
			
		}
		System.out.printf("총 파일 개수: %,d개\n",fileCount);
		System.out.printf("총 폴더 개수: %,d개\n",dirCount);
		System.out.printf("크기: %,dB\n",dirSize);
		
	}

	private static void count(File dir) {
		//1. 목록 가져오기
		File[] list = dir.listFiles();
		//2. 파일 개수
		for(File file : list) {
			if(file.isFile())
			{//현재 폴다
//				fileCount++;
//				dirSize+= file.length();
				file.delete();
			}
		}
		//3. 자식 폴더에 있는 파일
		for(File subdir : list) {
			if(subdir.isDirectory()) {
				dirCount++;
				count(subdir);
			}
		}
		
		dir.delete();
	}

	private static void m13() {

		String path = "C:\\class\\dev\\eclipse";
		File dir = new File(path);
		
		int count = 0;
		if(dir.exists()) {
			File[] list = dir.listFiles();
			for(File file : list) {
				if(file.isFile()) {
					count++;
				}
			}
			for(File subdir: list) {
				if(subdir.isDirectory()) {
					
					File[] sublist = subdir.listFiles();
					
					for(File subfile: sublist) {
						if(subfile.isFile()) {
							count++;
						}
					}
					for(File subsubdir: sublist) {
						if(subsubdir.isFile()) {
							File[] subsublist = subsubdir.listFiles();
							
							for(File subsubfile : subsublist) {
								if(subsubfile.isFile()) {
									count++;
								}
							}
						}
						
					}
				}
			}
		}
		
		System.out.printf("총 파일 개수 : %,d개",count);
	}

	private static void m12() {
		//*** 자주 사용
		String path = "C:\\class\\dev\\eclipse";
		File dir = new File(path);
		
//		if(dir.exists()) {
//			String[] list = dir.list();
//			
//			for(String item : list)
//				System.out.println(item);
//		}
		
		File[] list = dir.listFiles();
//		for(File f : list) {
//			System.out.println(f.getName());
//			System.out.println(f.isFile());
//		}
		
		for(File item : list) {
			if(item.isDirectory())
				System.out.printf("[%s]\n",item.getName());
		}
		for(File item : list) {
			if(item.isFile())
				System.out.printf("%s\n",item.getName());
		}
		
		
		
	}

	private static void m11() {
		File dir = new File("C:\\class\\code\\java\\file\\schedule");
		if(dir.exists()) {

			System.out.println(dir.delete());	
		}
		
	}

	private static void m10() {
		//폴더명 수정 or 폴더 이동
		
		 File dir = new File("C:\\class\\code\\java\\move\\schedule");
		 File dir2 = new File("C:\\class\\code\\java\\file\\schedule");
	
		 System.out.println(dir.renameTo(dir2));
	}

	private static void m9() {
		
		//요구사항] 일정관리 > 날짜별 폴더 생성 > [2024-01-18], [2024-01-19]
		//2024년 366일 전부
		Calendar c = Calendar.getInstance();
		c.set(2024, 0, 1);
		
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_YEAR));
		
		for(int i=0; i<c.getActualMaximum(Calendar.DAY_OF_YEAR); i++) {
//			String path = String.format(
//					"[%tF]\n", c);
//			System.out.printf(path);
			
			String path = String.format(
					"C:\\class\\code\\java\\file\\일정\\%tF", c);
			
			File dir = new File(path);
			dir.mkdirs();
			
			c.add(Calendar.DATE, 1);
			
		}
		
//		System.out.printf("%tF\n", c);
//		c.add(Calendar.DATE, 1);
//		System.out.printf("%tF", c);
		
		
	}

	private static void m8() {
		//요구사항] 회원 > 회원명으로 개인폴더 생성
		String[] member = {"홍길동", "아무개", "강아지","고양이","독수리"};
		for(int i=0; i<member.length; i++) {
			String path = String.format(
					"C:\\class\\code\\java\\file\\회원\\[개인폴더]%s님"
					, member[i]);
			File dir = new File(path);
			System.out.println(dir.mkdirs());
		}
		
	}

	private static void m7() {
		
//		//폴더 조작
//		String path = "C:\\class\\code\\java\\file\\aaa";
//		File dir = new File(path);
//		
//		if(!dir.exists()) {
//			boolean result = dir.mkdir();
//			System.out.println(result);
//		}else {
//			System.out.println("같은 이름의 폴더가 있습니다.");
//		}
		

		//폴더 조작
		String path = "C:\\class\\code\\java\\file\\bbb\\ccc\\ddd";
		File dir = new File(path);
		
		if(!dir.exists()) {
			boolean result = dir.mkdirs();
			System.out.println(result);
		}else {
			System.out.println("같은 이름의 폴더가 있습니다.");
		}
		
	}

	private static void m6() {
		String path = "C:\\class\\code\\java\\file\\score.txt";
		File file = new File(path);
		
		if(file.exists()) {
			boolean result = file.delete();
			System.out.println(result);
		}
		
	}

	private static void m5() {
		//이동
		//-java\score.txt => move\score.txt
		String path = "C:\\class\\code\\java\\file\\score.txt";
		File file = new File(path);
		
		String path2 = "C:\\class\\code\\java\\move\\score.txt";
		File file2 = new File(path2);
		
		boolean result = file.renameTo(file2);
		System.out.println(result);
		
		
	}

	private static void m4() {
		//파일명 수정
		//-score.txt => jumsu.txt
		String path = "C:\\class\\code\\java\\file\\score.txt";
		File file = new File(path);
		
		String path2 = "C:\\class\\code\\java\\file\\jumsu.txt";
		File file2 = new File(path2);
		
		boolean result = file.renameTo(file2);
		System.out.println(result);
		
	}

	private static void m3() {
		String path = "C:\\class\\code\\java\\file\\score.txt";
		File file = new File(path);
		try {
			boolean result = file.createNewFile();
			System.out.println(result);
			
		} catch (Exception e) {
			System.out.println("Ex58_File.m3");
			e.printStackTrace();
		}
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
