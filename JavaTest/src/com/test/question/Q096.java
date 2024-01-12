package com.test.question;

public class Q096 {
	public static void main(String[] args) {
		Box box1 = new Box();
		box1.cook();
//		box1.check();
//		box1.list();
	}
}
class Box {
	private Macaron[] list = new Macaron[10];
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
			if(checkSize(list[i]) || checkColor(list[i]) || checkThickness(list[i])) {
				bad++;
				continue;
			}
			good++;
		}
	}
	public void list() {}
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
   
	@Override
	public String toString() {
		return "Macaron [size=" + size + ", color=" + color + ", thickness=" + thickness + "]";
	}
}