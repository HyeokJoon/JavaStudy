package com.test.java.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
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
		m4();
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
