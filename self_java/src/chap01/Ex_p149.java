package chap01;

import java.util.Scanner;

public class Ex_p149 {

	public static void main(String[] args) {
		// 문제1
		System.out.println("---- 문제1 ----");
		byte b = 5;
		b = (byte) (-b); // int -> byte
		int result = 10 / -b;
		System.out.println(result);
		
		// 문제2
		System.out.println("---- 문제2 ----");
		int pencils = 534;
		int students = 30;
		
		// 학생 1명이 가지는 연필 개수
		int pencilsPerStudent = (pencils / students);
		System.out.printf("학생 1명이 가지는 연필 개수: %d\n", pencilsPerStudent);
		
		// 남은 연필 개수
		int pencilsLeft = (pencils % students);
		System.out.printf("남은 연필 개수: %d\n", pencilsLeft);
		
		// 문제5
		System.out.println("---- 문제5 ----");
		
		int var1 = 5;
		int var2 = 2;
		double var3 = var1 % var2;
		int var4 = (int) (var3 * var1);
		System.out.println(var4);
		
		// 5를 예상함 -> 5*1 -> var1 * (var1 % var2)
		
		// 문제6
		System.out.println("---- 문제6 ----");
		
		int value = 365;
		System.out.println((value/100) * 100);
		
		// 문제7
		System.out.println("---- 문제7 ----");
		
		float num1 = 10f;
		float num2 = num1 / 100;
		
		if(num2 == 0.1f) {
			System.out.println("10%입니다.");
		}
		else {
			System.out.println("10%가 아닙니다.");
		}
		
		// 문제8
		System.out.println("---- 문제8 ----");
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
		double area = ((lengthTop + lengthBottom) * 7 / 2);
		System.out.println(area);
		
		// 문제9
		System.out.println("---- 문제9 ----");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		double num3 = sc.nextDouble();
		
		System.out.print("두 번째 수: ");
		double num4 = sc.nextDouble();
		
		double sum = num3 / num4;
		
		if (sum == 0 || sum == 0.0) {
			System.out.println("결과: 무한대");
		}
		else {
			System.out.println("결과: " + sum);
		}
		sc.close();
	
		// 윤년 구하기
		Scanner scanner = new Scanner(System.in);
		System.out.println("---- 윤년 구하기 ----");
		
		System.out.print("##년도 입력: ");
		int year = Integer.parseInt(scanner.nextLine());
		
		if ((year % 4 == 0 && year != 100) || year % 400 == 0) {
			System.out.printf("%d년은 윤년입니다.", year);
		}
		else {
			System.out.printf("%d년은 평년입니다.", year);
		}
		// 4 == 0 && 100 != 0
		// 400 == 0
		
	}

}
