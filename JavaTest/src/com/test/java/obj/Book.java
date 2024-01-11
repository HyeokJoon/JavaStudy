package com.test.java.obj;

public class Book {
	public String title;
	private int price;
	private String publisher;
	private String author;
	
	private int discount;
	private String ISBN;
	private int pages;
	
	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	//Setter
	public void aaa(int a) {
		if(a>0 && a < 1000000)
			price = a;
	}
	
	//Getter
	public int bbb() {
		return price;
	}
	
	//Setter
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	//Getter
	public String getPublisher() {
		return publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
