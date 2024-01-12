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

	//setter, getter 구현
	//크기 : 쓰기 전용, A3, A4, A5, B3, B4, B5
	public void setSize(String size) {
		
		if(!size.equals("A3")&&!size.equals("A4")&&!size.equals("A5")&&!size.equals("B3")&&!size.equals("B4")&&!size.equals("B5"))
			return; // 해당되는 사이즈가 아님
		this.size = size;
	}
	
	//표지 색상 : 쓰기 전용, 검정색, 흰색, 노란색, 파란색
	public void setColor(String color) {
		if(color.equals("검정색") || color.equals("흰색") || color.equals("노란색") || color.equals("파란색"))
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
	
	//가격 : Setter,Getter 구현 안함. 추후 info() 메소드에서 사용하기 위해 아래와 같은
	

	public String info() {
		String tmp = "";
		if(this.owner == null)
		{
			tmp += "■■■■■■ 노트 정보 ■■■■■■" + "\n";
			tmp += "주인 없는 노트\n";
			tmp += "■■■■■■■■■■■■■■■■■■■■■■■■\n";
			return tmp;
		}
        
         tmp += "■■■■■■ 노트 정보 ■■■■■■" + "\n";
         tmp += "소유자 : " + this.owner + "\n"; 
         tmp += "특성 : " + this.color + thickness(this.page) + this.size + "노트\n"; 
         tmp += "가격 : " + clacPrice(this.page, this.size, this.color) + "원\n";
         tmp += "■■■■■■■■■■■■■■■■■■■■■■■■\n";
        
         return tmp;
   }

	private String clacPrice(int page, String size, String color) {
		int price = 400;
		switch (size) {
		case "A3":
			price += 400;
			break;
		case "A4":
			price += 200;
			break;
		case "B3":
			price += 500;
			break;
		case "B4":
			price += 300;
			break;
		case "B5":
			price += 100;
			break;
		}
		switch(color) {
		case "검정색":
			price += 100;
			break;
		case "노란색":
			price += 200;
			break;
		case "파란색":
			price += 200;
			break;
		}
		price += page * 10;
		return String.format("%,d", price);
	}

	private String thickness(int page2) {
		if(page2 <= 50 && page2 >=10)
			return " 얇은 ";
		if(page2 <= 100 && page2 >=51)
			return " 보통 ";
		if(page2 <= 200 && page2 >=101)
			return " 두꺼운 ";
		return null;
	}
}