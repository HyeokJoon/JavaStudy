package com.test.java;

import java.util.Scanner;

public class Ex29_String {
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
//		m14();
		m15();
	}

	private static void m15() {
		String txt = "홍길동,아무개,하하하,호호호,후후후";
		String[] names = txt.split(",");
		
		for(int i=0; i<names.length; i++) {
			System.out.println("이름: "+names[i]);
		}
	}

	private static void m14() {
		String txt = "안녕하세요. 홍길동입니다.";
		
		System.out.println(txt.replaceAll("홍길동", "아무무무개"));
		
		String content = "게시판 글을 씁니다 바보야!";
		String word = "바보";
		
		//masking
		System.out.println(content.replace("바보", "***"));
		
		txt = "    하나    둘    셋    ";
		System.out.println(txt.trim());
		System.out.println(txt.replace(" ", ""));
		System.out.println(txt.replace("하나", ""));
	}

	private static void m13() {
		
		String txt = "안녕하세요. 홍길동입니다.";
		if(txt.indexOf("홍길동") > -1) {
			System.out.println(txt.indexOf("홍길동"));
		}
		if(txt.contains("홍길동")) {
			System.out.println("O");
		}
	}

	private static void m12() {
		String jumin = "970408-2095748";
		
		//성별
		System.out.println(jumin.charAt(7)=='1' ? "남자":"여자");
		System.out.println(jumin.substring(7,8).equals("1")? "남자":"여자");
		
		//몇년생?
		System.out.println("" + jumin.charAt(0) + jumin.charAt(1));
		System.out.println(jumin.substring(0,2));
		
		//몇일생?
		System.out.println(jumin.substring(4,6));
		System.out.println();
		
		//파일 경로
		String path = "C:\\class\\code\\java\\Hello.java";
		
		//1. 파일명 추출
		int index = path.lastIndexOf("\\");
		String filename = path.substring(index+1);
		System.out.println("파일명: " + filename);
		
		//2. 파일명 > 확장자 없는 파일명 추출 > Hello
		index = filename.lastIndexOf(".");
		String filenameWithdoutExtension = filename.substring(0,index);
		System.out.println("순수 파일명: " + filenameWithdoutExtension);
		
		//3. 확장자만 출력 > .java
		String extension = filename.substring(index);
		System.out.println("확장자명: " + extension);
	}

	private static void m11() {
		String txt = "가나다라마바사아자차카타파하";
		System.out.println(txt.substring(3, 7));
		System.out.println(txt.substring(3));
		
		System.out.println(txt.charAt(4)); // > 문자 코드값
		System.out.println(txt.substring(4,5));
		System.out.println();
	}

	private static void m10() {
		
		String name = "홍길동";
		
		//'홍'으로 시작하는지?
		System.out.println(name.charAt(0) == '홍');
		System.out.println(name.indexOf('홍') == 0);
		System.out.println(name.startsWith("홍"));
		
		//자원 경로
		String path = "C:\\class\\code\\java\\Hello.txt";
		
		//위의 자원이 자바 소스파일인가? 확장자
		if(path.endsWith(".java")) {
			System.out.println("O");
		}else 
			System.out.println("X");
		
	}

	private static void m9() {
		//문자열 대소문자 변경
		String content = "오늘 수업하는 과목은 Java 입니다.";
		
		System.out.println(content.toUpperCase());
		System.out.println(content.toLowerCase());
		
	}

	private static void m8() {
		//게시판 글쓰기 > 금지어!
		
		String stop = "바보";
		String content = "안녕하세요. 저는 자바를 배우는 학생입니다.";
		
		if(content.indexOf(stop) > -1) {
			System.out.println("금지어 금지!");
		}else {
			System.out.println("글쓰기 처리~");
		}
		
		String[] stops = {"바보", "멍청이", "메롱", "ㅂㅏㅂㅗ"};
		for(int i=0; i<stops.length; i++) {
			if(content.indexOf(stops[i]) > -1) {
				System.out.println("금지어 발견!");
				break;
			}
		}
		System.out.println("종료");
		
	}

	private static void m7() {
		String txt = "안녕하세요. 홍길동입니다.";
		
		int index = -1;
		
		index = txt.indexOf('하');
		System.out.println(index);

		index = txt.indexOf('강');
		System.out.println(index);
		
		index = txt.indexOf('.');
		System.out.println(index);
		
		System.out.println();
		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕히가세요. 홍길동입니다.";
		index = txt.indexOf("홍길동");
		System.out.println(index);
	}

	private static void m6() {
		//문자열 공백 제거
		String txt = "   하나    둘     셋    ";
		
		System.out.println("원본: "+ txt);
		System.out.println("결과: " + txt.trim());
		
	}

	private static void m5() {
		Scanner scan = new Scanner(System.in);
		System.out.print("단어: ");
		String word = scan.nextLine();
		
		if(isValid(word)) {
			System.out.println("소문자 O");
		}else {
			System.out.println("소문자 X");
		}
		
	}

	private static boolean isValid(String word) {
		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			if(c<'a' || c >'z') {
				return false;
			}
		}
		return true;
	}

	private static void m4() {
		//단어 입력
		//- 영어 소문자만
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단어: ");
		String word = scan.nextLine();
		
//		System.out.println(word.charAt(0));
//		System.out.println(word.charAt(1));
//		System.out.println(word.charAt(2));
		
//		for(int i=0; i<word.length(); i++) {
//			char c = word.charAt(i);
//			if(c>='a' && c <='z')
//				System.out.println("소문자 O");
//			else
//				System.out.println("소문자 X");
//		}
		
		boolean result = true;
		
		//****유효성 검사는 잘못된 것을 찾는 조건을 만드는게 편함
		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			if(c<'a' || c >'z') {
				System.out.println("소문자 X");
				result = false;
				break;
			}
		}
		
		
	}

	private static void m3() {
		//주민등록번호 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("주민번호 입력('-'필수): ");
		
		String jumin = scan.nextLine();
		
		if(jumin.charAt(6) == '-') {
			System.out.println("올바른 주민번호");
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
		
	}

	private static void m2() {
		//문자열 추출
		//- char charAt(int index)
		String txt = "안녕하세요. 홍길동입니다.";
		System.out.println(txt.charAt(4));
		System.out.println(txt.charAt(10));
		//StringIndexOutOfBoundsException
		//System.out.println(txt.charAt(15));
		
		char c = txt.charAt(txt.length()-1);
		System.out.println(c);
		
	
		
	}

	private static void m1() {
		String str = "홍길동";
		String str2 = new String("홍길동");
		
		String txt = "홍길동";
		System.out.println(txt.length());
		System.out.println("ABC한글123!@#".length());
		
		//요구사항] 사용자 입력 > 문자수 ?
		Scanner scan = new Scanner(System.in);
				
		System.out.print("문장 입력: ");
		String statement = scan.nextLine();
		System.out.printf("%s > %d문자\n",statement, statement.length());
		
		//유효성 검사
		//- 이름 입력
		
		System.out.print("이름: ");
		String name = scan.nextLine();
		
		if(name.length()>=2 && name.length() <=5)
			System.out.println("올바른 이름");
		else {
			System.out.println("이름을 2~5자 이내로 입력하세요.");
		}
	}
}
