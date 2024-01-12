package com.test.question;

public class Q093 {
	public static void main(String[] args) {
		Note note = new Note();

		note.setSize("B4");
		note.setColor("노란색");
		note.setPage(25);
		note.setOwner("홍길동");

		System.out.println(note.info());


		Note note2 = new Note();

		note2.setSize("A4");
		note2.setColor("검정색");
		note2.setPage(100);

		System.out.println(note2.info());
	}
}
class Note  {
	private String size;
	private String color;
	private int page;
	private String owner;
	private int price;
	
	//크기 : 쓰기 전용, A3, A4, A5, B3, B4, B5
	public void setSize(String size) {
		if(size != "A3"&&size != "A4"&&size != "A5"&&size != "B3"&&size != "B4"&&size != "B5")
			return; // 해당되는 사이즈가 아님
		this.size = size;
	}
	
	//표지 색상 : 쓰기 전용, 검정색, 흰색, 노란색, 파란색
	public void setColor(String color) {
		if(color!="검정색" && color!="흰색" && color!="노란색" && color!="파란색")
			return;
		this.color = color;
	}
	
	//페이지수 : 쓰기 전용, 10 ~ 200페이지 이내
	//(+) 10~50(얇다), 51 ~ 100(보통), 101 ~ 200(두껍다)
	public void setPage(int page) {
		if(page<10 || page >200)
			return;
		this.page = page;
	}

	//소유자이름 : 쓰기 전용, 한글 2~5자이내. 필수값
	public void setOwner(String owner) {
		if(owner.length() < 2 && owner.length() > 5)
			return;
		for(int i=0; i<owner.length(); i++) {
			if(owner.charAt(i) < '가' || owner.charAt(i) > '힣')
				return;
		}
		this.owner = owner;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//setter, getter 구현
	public String info() {
         return ..
   }
}