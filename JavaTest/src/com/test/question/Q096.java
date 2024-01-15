package com.test.question;

public class Q096 {
	public static void main(String[] args) {
		Box box1 = new Box();
		box1.cook();
		box1.check();
		box1.list();
	}
}

class Box {
	private Macaron[] list = new Macaron[10];
	private boolean[] result = new boolean[10]; 
	public void cook() {
		for(int i=0; i<10; i++) {
			list[i] = new Macaron();
//			System.out.println(list[i]);
		}
		System.out.println("마카롱 10개 만들었습니다.");
	}
	
	public void check() {
		int good = 0, bad = 0;
		for(int i=0; i<10; i++) {
			if(!checkSize(list[i]) || !checkColor(list[i]) || !checkThickness(list[i])) {
				result[i] = false;
				bad++;
				continue;
			}
			result[i] = true;
			good++;
		}
		System.out.println("[박스 체크 결과]");
		System.out.printf("QC 합격 개수 : %d개\n",good);
		System.out.printf("QC 불합격 개수 : %d개\n",bad);
		
	}
	private boolean checkThickness(Macaron macaron) {
		if(macaron.getThickness()<3 || macaron.getThickness()>18)
			return false;
		return true;
	}

	private boolean checkColor(Macaron macaron) {
		if(macaron.getColor().equals("black"))
			return false;
		return true;
	}

	private boolean checkSize(Macaron macaron) {
		if(macaron.getSize()<8 || macaron.getSize()>14)
			return false;
		return true;
	}

	public void list() {
		System.out.println("[마카롱 목록]");
		for(int i=0; i<10; i++) {
			System.out.printf("%d번 마카롱 : %dcm(%s, %dmm) : %s\n",
					i+1,
					list[i].getSize(), 
					list[i].getColor(), 
					list[i].getThickness(),
					result[i]? "합격": "불합격");
		}
		
	}
}

class Macaron {
	private int size;
	private String color;
	private int thickness;
	private String[] colors= {"red", "blue", "yellow", "white", "pink", "purple", "green", "black"};
	
	public Macaron() {
		this.size = (int)(Math.random()*100) % 11 + 5;
		int idx = (int)(Math.random()*100) % 8;
		this.color = colors[idx];
		this.thickness =  (int)(Math.random()*100) % 20 +1;
	}
	public int getThickness() {
		return this.thickness;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getSize() {
		return this.size;
	}
   
	@Override
	public String toString() {
		return "Macaron [size=" + size + ", color=" + color + ", thickness=" + thickness + "]";
	}
}