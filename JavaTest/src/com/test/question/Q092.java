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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPubYear() {
		return pubYear;
	}
	public void setPubYear(String pubYear) {
		this.pubYear = pubYear;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
   
	public String info() {
		String tmp = "";
		tmp += "제목: " +title+ "\n";
		tmp += "가격: " +price+ "원\n";
		tmp += "저자: " +author+ "\n";
		tmp += "출판사: " +publisher+ "\n";
		tmp += "발행년도: " +pubYear+ "\n";
		tmp += "ISBN: " +isbn+ "\n";
		tmp += "페이지: " +page+ "장\n";
		return tmp;
	}
}