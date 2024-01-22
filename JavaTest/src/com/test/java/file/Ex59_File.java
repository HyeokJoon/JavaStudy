package com.test.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex59_File {
	public static void main(String[] args) {
		/*
		ANSI (ISO-8859-1, EUC-KR, MS949)
		- 영어(숫자, 특수문자, 서유럽 문자 등 ASCII(~255)) : 1byte
		- 한글(한자, 일본어 등)
		- 영어: 1byte
		- 한글: 2byte
		- 
		
		UTF-8 > 국제 표준 역할 > 자바 오라클 / UTF-8사용
		- 영어: 1byte
		- 한글: 3byte
		
		UTF-16 > 모든 문자를 2바이트로 저장
		- 영어: 2byte
		- 한글: 2byte
		*/
		
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m6();
//		m7();
		m8();
	}

	private static void m8() {
		
		//성적관리
		//- 성적표 출력
		//- 성적 파일(score.txt)
		 
		//*****데이터 구조 설계
		//- 이름, 국어, 영어, 수학
		
		try {
			// . 을 사용하면 프로젝트 경로를 가르켜줌
			BufferedReader reader = new BufferedReader(new FileReader(".\\dat\\score.txt"));
			
//			File file = new File(".\\dat\\score.txt");
//			System.out.println(file.exists());
			
			System.out.println("=============================");
			System.out.println("             성적표");
			System.out.println("=============================");
			System.out.println("[이름]\t[국어]\t[영어]\t[수학]");
			
			String line = null;
			while((line = reader.readLine()) != null) {
				
				System.out.println(makeFormat(line));
			}
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m8");
			e.printStackTrace();
		}
		
		
		
		
	}

	private static String makeFormat(String line) {
		
		String[] list = line.split(",");
		String temp = "";
		temp += String.format("%4s\t", list[0]); 
		temp += String.format("%4d\t", Integer.parseInt(list[1])); 
		temp += String.format("%4d\t", Integer.parseInt(list[2])); 
		temp += String.format("%4d", Integer.parseInt(list[3])); 
		
		return temp;
	}

	private static void m7() {
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.print("자바 파일명: "); // Ex01_DataType.java
			String filename = scan.nextLine();
			
			String path = "C:\\class\\code\\java\\JavaTest\\src\\com\\test\\java\\" + filename;
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String line = null;
			int number = 1; // 줄 번호
			
			
			while((line = reader.readLine()) !=null) {
				System.out.printf("%-3d: ",number++);
				System.out.println(line);
			}
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m7");
			e.printStackTrace();
		}
		
	}

	private static void m6() {
		// 
		try {
//			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file\\list.txt"));
//			
//			writer.write(65);
//			writer.write("문자열");
//			
//			
//			writer.close();
						
			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\file\\list.txt"))	;
//			String line = reader.readLine();
//			System.out.println(line);
//			line = reader.readLine();
//			System.out.println(line);
//			line = reader.readLine();
//			System.out.println(line);
			
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void m5() {
		//파일 읽기
		
		try {
			
			//FileInputSteam > FileReader
			FileReader reader = new FileReader("C:\\class\\code\\java\\file\\data.txt");
			
//			int code = reader.read();
//			System.out.println((char)code);
//			
			int code = -1;
			while((code = reader.read()) != -1) {
				System.out.print((char)code);
			}
			
			reader.close();
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m5");
			e.printStackTrace();
		}
		
	}

	private static void m4() {
		//메모장 구현 > 콘솔 버전
		try {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("저장할 파일명: ");
			String filename = scan.nextLine();
			
			FileWriter writer = new FileWriter("C:\\class\\code\\java\\file\\" + filename);
			
			boolean loop = true;
			
			while(loop) {
				System.out.print("입력: ");
				String line = scan.nextLine();
				
				if(line.equals("q!")) {
					break;
				}
				
				writer.write(line);
				writer.write("\r\n");
			}
			
			writer.close();
			System.out.println("end");
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m4");
			e.printStackTrace();
		}
		
	}

	private static void m3() {
		
		try {
			
			//파일 쓰기
			//FileWriter
			
			FileWriter writer = new FileWriter("C:\\class\\code\\java\\file\\member.txt", true);
			
			writer.write("홍길동");
			
			System.out.println("end");
			writer.close();
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m3");
			e.printStackTrace();
		}
		
	}

	private static void m2() {

		//읽기 스트림 객체
		try {
			FileInputStream stream = new FileInputStream("C:\\class\\code\\java\\JavaTest\\src\\com\\test\\java\\Ex28_Scanner.java");
			
			//아래 두개와 용법이 비슷함
			//System.in.read()
			//reader.read()
//			int code = stream.read();
//			System.out.println((char)code);
//
//			code = stream.read();
//			System.out.println((char)code);
//
//			code = stream.read();
//			System.out.println((char)code);
//
//			code = stream.read();
//			System.out.println((char)code);
//			code = stream.read();
//			System.out.println((char)code);
//			code = stream.read();
//			System.out.println((char)code);
//			code = stream.read();
//			System.out.println((char)code);
//			code = stream.read();
//			System.out.println((char)code);
//			code = stream.read();
//			System.out.println((char)code);
//			code = stream.read();
//			System.out.println((char)code);
//			code = stream.read();
//			System.out.println((char)code);
//			code = stream.read();
//			System.out.println((char)code);
//			
//			code = stream.read();
//			System.out.println(code);
			
			//로직 기억
			int code = -1;
			while((code = stream.read()) != -1) {
				System.out.print((char)code);
			}
			
			stream.close();
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m2");
			e.printStackTrace();
		}
		
	}

	private static void m1() {
		
		//쓰기 스트림 객체
		try {
			//텍스트 파일 참조
			File file = new File("C:\\class\\code\\java\\file\\data.txt");
			
			//파일 객체 > 스트림 생성
			FileOutputStream stream = new FileOutputStream(file);
			FileOutputStream streamAppend = new FileOutputStream(file, true);
			
			char c = 'A';
			
			stream.write((int)c); //문자 코드를 사용해서 파일에 문자를 작성
			stream.write('B');
			stream.write('C');
//			stream.write('나');
			
			String txt = "Hello Java!!";
			for(int i=0; i<txt.length(); i++) {
				char c1 = txt.charAt(i);
				stream.write(c1);
			}
			
			stream.close();
			
			System.out.println("end");
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m1");
			e.printStackTrace();
		}
		
	}
}
