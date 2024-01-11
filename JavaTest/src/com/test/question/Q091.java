package com.test.question;

import java.util.Scanner;

public class Q091 {
	public static void main(String[] args) {

		String[] opers = {"+", "-", "*", "/", "%"};
		int operIdx = 0; 
		int idx = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력: ");
		String input = scan.nextLine();
		
		input = input.replace(" ", "");
		
		boolean haveOper = false;
		
		for(int i=0; i<opers.length; i++) {
			if(input.contains(opers[i])) {
				haveOper = true;
				operIdx = i;
				idx = input.indexOf(opers[i]);
			}
		}
		
		if(haveOper) {

			if(idx != 0 && idx != input.length()-1) {
				
				int operand1 = Integer.parseInt(input.substring(0,idx));
				int operand2 = Integer.parseInt(input.substring(idx+1));
				
				int result = calc(operand1, operand2, opers[operIdx]);
				
				System.out.printf("%d %s %d = %d",operand1, opers[operIdx], operand2, result);
				
			}else {
				System.out.println("피연산자가 부족합니다.");
			}
			
		} else {
			System.out.println("연산자가 올바르지 않습니다.");
		}
		
	}

	private static int calc(int num1, int num2, String string) {
		
		switch (string) {
		case "*":
			return num1*num2;
		case "+":
			return num1+num2;
		case "-":
			return num1-num2;
		case "/":
			return num1/num2;
		case "%":
			return num1%num2;
		}
		
		return 0;
	}
}
