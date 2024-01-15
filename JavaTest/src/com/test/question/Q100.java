package com.test.question;

public class Q100 {
	public static void main(String[] args) {
		//포장하는 직원
		Packer packer = new Packer();

		//연필
		Pencil p1 = new Pencil();
		p1.setHardness("HB");
		packer.packing(p1);

		Pencil p2 = new Pencil();
		p2.setHardness("4B");
		packer.packing(p2);

		//지우개
		Eraser e1 = new Eraser();
		e1.setSize("Large");
		packer.packing(e1);

		//볼펜
		BallPointPen b1 = new BallPointPen();
		b1.setThickness(0.3);
		b1.setColor("black");
		packer.packing(b1);

		BallPointPen b2 = new BallPointPen();
		b2.setThickness(1.5);
		b2.setColor("red");
		packer.packing(b2);

		//자
		Ruler r1 = new Ruler();
		r1.setLength(30);
		r1.setShape("줄자");
		packer.packing(r1);

		//결과 확인
		packer.countPacking(0);
		packer.countPacking(1);
		packer.countPacking(2);
		packer.countPacking(3);
		packer.countPacking(4);
	}
}

class Packer{
	private static int pencilCount;
	private static int eraserCount;
	private static int ballPoinPenCount;
	private static int rulerCount;

	public void countPacking(int i) {
		System.out.println("=====================");
		System.out.println("포장 결과");
		System.out.println("=====================");
		switch (i) {
		case 0:
			System.out.println("연필 "+pencilCount+"회");
			System.out.println("연필 "+pencilCount+"회");
			System.out.println("지우개 "+eraserCount+"회");
			System.out.println("볼펜 "+ballPoinPenCount+"회");
			System.out.println("자 "+rulerCount+"회");
			System.out.println();
			break;
		case 1:
			System.out.println("연필 "+pencilCount+"회");
			System.out.println();
			break;
		case 2:
			System.out.println("지우개 "+eraserCount+"회");
			System.out.println();
			break;
		case 3:
			System.out.println("볼펜 "+ballPoinPenCount+"회");
			System.out.println();
			break;
		case 4:
			System.out.println("자 "+rulerCount+"회");
			System.out.println();
			break;
		}
		
	}
	
	public void packing(Pencil pencil) {
		System.out.printf("포장 전 검수 : %s 진하기 연필입니다.\n",pencil.getHardness());
		System.out.println("포장을 완료했습니다.");
		pencilCount++;
	}
	public void packing(Eraser eraser) {
		System.out.printf("포장 전 검수 : %s 사이즈 지우개입니다.\n",eraser.getSize());
		System.out.println("포장을 완료했습니다.");
		eraserCount++;
	}
	public void packing(BallPointPen ballPointPen) {
		System.out.printf("포장 전 검수 : %s 색상 %.1fmm 볼펜입니다.\n",ballPointPen.getColor(), ballPointPen.getThickness());
		System.out.println("포장을 완료했습니다.");
		ballPoinPenCount++;
	}
	public void packing(Ruler ruler) {
		System.out.printf("포장 전 검수 : %dcm 줄자입니다.\n",ruler.getLength());
		System.out.println("포장을 완료했습니다.");
		rulerCount++;
	}
}

class Pencil{
	private String hardness;

	public String getHardness() {
		return hardness;
	}

	public void setHardness(String hardness) {
		this.hardness = hardness;
	}

}


class Eraser{
	private String size;

	
	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}

}

class BallPointPen{
	private double thickness;
	private String color;
	
	public double getThickness() {
		return thickness;
	}

	public void setThickness(double thickness) {
		this.thickness = thickness;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

class Ruler{
	private int length;
	private String shape;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

}
