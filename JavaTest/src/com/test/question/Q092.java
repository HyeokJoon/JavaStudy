package com.test.question;

public class Q092 {
	public static void main(String[] args) {
		Book b1 = new Book();

		b1.setTitle("자바의 정석");
		b1.setPrice(45000);
		b1.setAuthor("남궁성");
		b1.setPublisher("도우출판");
		b1.setIsbn("8994492038");
		b1.setPage(1022);

		System.out.println(b1.info());
	}
}

class Book {
 
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2019";
	private String isbn;
	private int page;

	//getter, setter
	//제목 : 읽기/쓰기, 최대 50자 이내(한글, 영어, 숫자, 공백)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title.length() <= 50)
			this.title = title;
	}
	//가격 : 읽기/쓰기, 0 ~ 1000000원
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price >=0 && price <1000000)
			this.price = price;
	}
	//저자 : 읽기/쓰기, 제한 없음
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	//출판사 : 쓰기 전용
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	//발행년도 : 읽기 전용(2019년)
	public String getPubYear() {
		return pubYear;
	}
	//ISBN : 읽기/쓰기
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	//페이지수 : 읽기/쓰기, 1~무제한
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		if(page>0)
			this.page = page;
	}
	
	private String addComma(int num) {
		
		String result = "";
		int cnt = 1;
		while(num >= 10) {
			int a = num %10;
			num /= 10;
			if(cnt %3 == 0) {
				result = ","+a+result;
			}
			else {
				result = a+result;
			}
			cnt++;
		}
		result = num + result;
		return result;
	}
   
	public String info() {
		String tmp = "";
		tmp += "제목: " +title+ "\n";
		tmp += "가격: " +addComma(price)+ "원\n";
		tmp += "저자: " +author+ "\n";
		tmp += "출판사: " +publisher+ "\n";
		tmp += "발행년도: " +pubYear+ "\n";
		tmp += "ISBN: " +isbn+ "\n";
		tmp += "페이지: " +addComma(page)+ "장\n";
		return tmp;
	}
}